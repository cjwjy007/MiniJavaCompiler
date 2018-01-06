import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.IntervalSet;

class MiniJavaBaseErrorListener extends BaseErrorListener {
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInline,
                            String msg, RecognitionException e) {

        this.errorReporter(recognizer, offendingSymbol, line, charPositionInline, msg, e);
        this.underlineError(recognizer, (Token) offendingSymbol, line, charPositionInline);
    }

    private void underlineError(Recognizer recognizer, Token offendingToken, int line, int charPositionInline) {
        CommonTokenStream tokens = (CommonTokenStream) recognizer.getInputStream();
        String input = tokens.getTokenSource().getInputStream().toString();
        String[] lines = input.split("\n");
        String errorLine = lines[line - 1];
        System.err.println(errorLine);
        for (int i = 0; i < charPositionInline; i++) {
            System.err.print(" ");
        }
        int start = offendingToken.getStartIndex();
        int stop = offendingToken.getStopIndex();
        if (start >= 0 && stop >= 0) {
            for (int i = start ; i <= stop; i++) {
                System.err.print("^");
            }
        }
        System.err.println();
    }
    private void errorReporter(Recognizer recognizer, Object offendingSymbol, int line, int charPositionInline,
                               String msg, RecognitionException e) {
        if (e instanceof InputMismatchException) {
            this.reportInputMismatchException(recognizer, offendingSymbol, line, charPositionInline, msg, e);
        } else if (e instanceof MyRecognitionException) {
            System.err.println("[Syntax Error]: line " + line + ":" + charPositionInline + "\t" + msg);
        } else {
            System.err.println("line " + line + ":" + charPositionInline + " at " + offendingSymbol + ": " + msg);
        }
    }

    private void reportInputMismatchException(Recognizer recognizer, Object offendingSymbol, int line,
                                              int charPositionInline, String msg, RecognitionException e) {
        CommonToken token = (CommonToken) e.getOffendingToken();
        IntervalSet expectedTokens = e.getExpectedTokens();
        Vocabulary vocabulary = recognizer.getVocabulary();
        String shouldBe = this.reportKeywordMismatchException(token.getText(), expectedTokens.toString(vocabulary));
        String reservedWord = this.reportReservedWordMisuseException(recognizer, token.getText());
        if (!shouldBe.equals("")) {
            System.err.println("[Lexical Error]: line " + line + ":" + charPositionInline + "\tWrong Keyword: " + token.getText()
                    + "\tExpected Tokens: " + expectedTokens.toString(vocabulary) + "\tSuggested Keyword: " + shouldBe);
        } else if (!reservedWord.equals("")) {
            System.err.println("[Syntax Error]: line " + line + ":" + charPositionInline + "\tMisuse Reserved Word: " + reservedWord
                    + "\tShould be: " + expectedTokens.toString(vocabulary));
        } else {
            System.err.println("line " + line + ":" + charPositionInline + " at " + offendingSymbol + ": " + msg);
        }
    }

    private String reportKeywordMismatchException(String wrongWord, String expectedTokens) {
        String[] expected = expectedTokens.replace("{", "").replace("}", "").split(",");
        double maxSimilarity = 0.5;
        String similarest = "";
        for (String anExpected : expected) {
            String tmp = anExpected.trim().replace("'", "");
            double similarity = MiniJavaBaseErrorListener.similarity(wrongWord, tmp);
            if (similarity > maxSimilarity) {
                maxSimilarity = similarity;
                similarest = tmp;
            }
        }
        return similarest;
    }

    private String reportReservedWordMisuseException(Recognizer recognizer, String wrongWord) {
        String result = "";
        Vocabulary vocabulary = recognizer.getVocabulary();
        int maxTokenType = vocabulary.getMaxTokenType();
        for (int i = 0; i < maxTokenType; i++) {
            String tokenName = vocabulary.getDisplayName(i).replace("'", "");
            if (wrongWord.equals(tokenName)) {
                result = tokenName;
            }
        }
        return result;
    }

    public static double similarity(String wrongWord, String rightWord) {
        final int m = wrongWord.length();
        final int n = rightWord.length();

        int[][] d = new int[m + 1][n + 1];
        for (int j = 0; j <= n; ++j) {
            d[0][j] = j;
        }
        for (int i = 0; i <= m; ++i) {
            d[i][0] = i;
        }

        for (int i = 1; i <= m; ++i) {
            char ci = wrongWord.charAt(i - 1);
            for (int j = 1; j <= n; ++j) {
                char cj = rightWord.charAt(j - 1);
                if (ci == cj) {
                    d[i][j] = d[i - 1][j - 1];
                } else {
                    d[i][j] = Math.min(d[i - 1][j - 1] + 1, Math.min(d[i][j - 1] + 1, d[i - 1][j] + 1));
                }
            }
        }
        return 1 - (double) d[m][n] / Math.max(m, n);
    }
}

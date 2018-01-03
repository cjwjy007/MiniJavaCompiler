import org.antlr.v4.runtime.*;

class MiniJavaBaseErrorListener extends BaseErrorListener {
    void underlineError(Recognizer recognizer, Token offendingToken, int line, int charPositionInline) {
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
}

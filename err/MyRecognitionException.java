import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;

public class MyRecognitionException extends RecognitionException {
    public MyRecognitionException(Parser recognizer) {
        super(recognizer, recognizer.getInputStream(), recognizer.getContext());
        this.setOffendingToken(recognizer.getCurrentToken());
    }
}

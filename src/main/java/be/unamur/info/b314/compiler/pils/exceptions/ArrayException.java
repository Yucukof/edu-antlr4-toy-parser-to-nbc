package be.unamur.info.b314.compiler.pils.exceptions;

/**
 * @author Hadrien BAILLY
 */
public class ArrayException extends GrammarException {

    public ArrayException() {
        super();
    }

    public ArrayException(final String message) {
        super(message);
    }

    public ArrayException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public ArrayException(final Throwable cause) {
        super(cause);
    }

    protected ArrayException(final String message, final Throwable cause, final boolean enableSuppression, final boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

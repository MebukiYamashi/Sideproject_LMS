package exception;

public class DuplicationException extends RuntimeException{

    public DuplicationException () {}

    public DuplicationException (String message) {
        super(message);
    }

}

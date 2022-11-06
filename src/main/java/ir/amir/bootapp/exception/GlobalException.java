package ir.amir.bootapp.exception;

public class GlobalException extends RuntimeException{

    public GlobalException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return getMessage();
    }
}

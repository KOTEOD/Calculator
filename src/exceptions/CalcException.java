package exceptions;

import java.util.regex.Pattern;


public class CalcException extends RuntimeException {
    public CalcException() {
    }

    public CalcException(String message) {
        super(message);
    }
}
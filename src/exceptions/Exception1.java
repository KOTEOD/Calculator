package exceptions;

import java.util.regex.Pattern;

public class Exception1 extends CalcException {
    public Exception1() {
    }

    public Exception1(String message) {
        super(message);
    }

    public String inputException(String inputExept) {
        if (!inputExept.matches(".*[-+*/].*")) {
            throw new Exception1("Incorrect acquisition value");
        } else if (Pattern.compile("\\b([1-9]|10)\\s*([-+*/])\\s*([IVX]{1,10})").matcher(inputExept).matches()
                || Pattern.compile("([IVX]{1,10})\\s*([-+*/])\\s*([1-9]|10)\\b").matcher(inputExept).matches()) {
            throw new Exception1("Different number systems are used simultaneously");
        } else if (inputExept.length() > 4) {
            throw new Exception1("The format of the mathematical operation does not satisfy the task");
        } else {
            return "No name exception";
        }

    }
}

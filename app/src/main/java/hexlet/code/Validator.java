package hexlet.code;

import java.util.Scanner;
import hexlet.code.StringSchema;
public class Validator {
    private final StringSchema stringSchema;
    public Validator() {
        stringSchema = new StringSchema();
    }
    public StringSchema string() {
        return stringSchema;
    }

    public boolean isValid() {
        return true;
    }
}

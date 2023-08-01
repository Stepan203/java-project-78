package hexlet.code;

import java.util.Scanner;
import hexlet.code.StringSchema;

import javax.xml.validation.Schema;

public class Validator {
    private final StringSchema stringSchema;
    private NumberSchema numberSchema;
    private MapSchema mapSchema;
    public Validator() {
        stringSchema = new StringSchema();
        numberSchema = new NumberSchema();
        mapSchema = new MapSchema();

    }
    public StringSchema string() {
        return stringSchema;
    }
    public NumberSchema number() {
        return numberSchema;
    }
    public MapSchema map() {
        return mapSchema;
    }

}

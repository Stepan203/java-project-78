package hexlet.code;

import static java.util.Objects.isNull;

public class StringSchema {
    private boolean contains;
    private boolean minLength;
    private boolean required;
    private int num;
    private String word;

    //  private static StringSchema stringSchema;
    public StringSchema() {
        this.required = false;
        this.contains = false;
        this.minLength = false;
    }
    // public StringSchema() {
     //   addCheck(
     //           "required",
     //           value -> value instanceof String && !((String) value).isEmpty()
     //   );
   // }
    public StringSchema required() {
         this.required = true;
         return this;
    }
    public StringSchema minLength(int num) {
        // this.minLength() = true;
        return this;
       // return minLength(num);
    }

    public StringSchema contains(String word) {
        return this;
    }
    public boolean isValid(String s) {
        if (s instanceof String && s.length() >= 0 && required) {
            return false;
        }
        if (s.length() < num) {
            return false;
        }
        if (s instanceof String || s.contains(word)) {
            return true;
        }
        else {
            return false;
        }
    }
}

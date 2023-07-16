package hexlet.code;

public class StringSchema {
    private boolean required;

    //  private static StringSchema stringSchema;
    public StringSchema() {
        this.required = false;
    }
    public StringSchema required() {
         this.required = true;
         return this;
    }
    public boolean isValid(String s) {
        if (s instanceof String && s.length() == 0 || s == null) {
            return true;
        }
        else {
            return false;
        }
    }

}

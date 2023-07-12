package hexlet.code;

public class StringSchema {
    private static StringSchema stringSchema;
    public String required;
    public int minLength;
    public String contains;

    public StringSchema() {

    }

    public String getRequired() {
        return required;
    }

    public void setRequired(String required) {
        this.required = required;
    }

    public int getMinLength() {
        return minLength;
    }

    public void setMinLength(int minLength) {
        this.minLength = minLength;
    }

    public String getContains() {
        return contains;
    }

    public void setContains(String contains) {
        this.contains = contains;
    }

    public StringSchema(String required, int minLength, String contains) {
        this.required = required;
        this.minLength = minLength;
        this.contains = contains;
    }

    public void required() {
         stringSchema.required();
    }

    public boolean isValid(String s) {
        if (s.isEmpty()) {
            return true;
        }
        return false;

    }

    // public StringSchema minLength(int num) {
   //     return minLength();
   // }

}

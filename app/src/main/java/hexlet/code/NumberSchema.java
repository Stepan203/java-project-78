package hexlet.code;

public class NumberSchema {
    private boolean positive;
    private boolean required;
    private Object n;
    private boolean range;

    public NumberSchema() {
        this.required = false;
        this.positive = false;
        this.range = false;
    }
    public NumberSchema required() {
        this.required = true;
        return this;
    }
    public NumberSchema positive() {
        this.positive = true;
        return this;
    }
    public NumberSchema range(Integer numStart, Integer numEnd) {
        return this;
    }
    public boolean isValid(Object n) {

        if (!required && n == null) {
            return true;
        }
        if (positive && (n != null)) {
            return false;
        }
        else {
            return true;
        }
    }
}

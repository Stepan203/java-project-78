package hexlet.code;

public class NumberSchema {

    private boolean required;
    private boolean positive;

    public NumberSchema() {
        this.required = false;
        this.positive = false;
    }
    public NumberSchema required() {
        this.required = true;
        return this;
    }
    public NumberSchema positive() {
        this.positive = true;
        return this;
    }
}

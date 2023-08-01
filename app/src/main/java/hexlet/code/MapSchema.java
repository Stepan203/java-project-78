package hexlet.code;

import java.util.Map;

public class MapSchema {
    private boolean required;
    private boolean sizeof;

    public MapSchema() {
        this.required = false;
        this.sizeof = false;
    }
    public MapSchema required() {
        this.required = true;
        return this;
    }
    public MapSchema sizeof(Integer num) {
        return this;
    }
    public boolean isValid(Map<String, String> num) {
        if (!required && num == null) {
            return true;
        }
        return false;
    }

}

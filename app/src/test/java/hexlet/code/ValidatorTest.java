package hexlet.code;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;
import hexlet.code.StringSchema;
import hexlet.code.NumberSchema;

import javax.xml.validation.Schema;

public class ValidatorTest {
    // private static StringSchema stringSchema;

    @Test
     public void generateTest() {
        Validator v = new Validator();
        StringSchema stringSchema = v.string();
        assertTrue(stringSchema.isValid(""));
        //   assertTrue(stringSchema.isValid(null));
        stringSchema.required();
        assertFalse(stringSchema.isValid(""));
        assertFalse(stringSchema.isValid("5"));
        //  stringSchema.minLength(7);
        // assertThat(schema.isValid("what does the fox say")).isTrue();
        // assertThat(schema.isValid("hexlet")).isFalse();
        // stringSchema.minLength(5);
        assertFalse(stringSchema.minLength(5).isValid("what does the fox say"));
        //  stringSchema.contains("what");
        // assertFalse(stringSchema.minLength(5).isValid("what"));
        assertFalse(stringSchema.contains("").isValid("what does"));
        // stringSchema.contains("whats");
        //  assertFalse(stringSchema.contains("whats").isValid("what does"));
        //  assertTrue(stringSchema.isValid("what does"));
    }

    @Test
    public void numberTest() {
        Validator n = new Validator();
        NumberSchema numberSchema = n.number();
        assertTrue(numberSchema.isValid(null));
        assertTrue(numberSchema.positive().isValid(null));
        assertFalse(numberSchema.isValid("3"));
        numberSchema.required();
        //assertFalse(numberSchema.required().isValid(null));
        assertTrue(numberSchema.isValid(10));
        assertFalse(numberSchema.isValid(-10));
        //numberSchema.positive();
        assertFalse(numberSchema.positive().isValid(-10));
        assertTrue(numberSchema.positive().isValid(5));
    }

    @Test
    public void mapTest() {
        Validator m = new Validator();
        MapSchema mapSchema = m.map();
        assertTrue(mapSchema.isValid(null));
        mapSchema.required();
        assertFalse(mapSchema.isValid(null));
        Map<String, String> data = new HashMap<>();
        assertTrue(mapSchema.isValid(data));
        data.put("key1", "value1");
        assertTrue(mapSchema.isValid(data));
    }

}

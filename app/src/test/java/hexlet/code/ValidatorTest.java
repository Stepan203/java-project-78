package hexlet.code;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;
import hexlet.code.StringSchema;

public class ValidatorTest {
   // private static StringSchema stringSchema;

    @Test
    void generateTest() {
        Validator v = new Validator();
        StringSchema stringSchema = v.string();
        assertTrue(stringSchema.isValid(""));
        assertTrue(stringSchema.isValid(null));
        stringSchema.required();
        assertFalse(stringSchema.isValid("5"));
    }

}

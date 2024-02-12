package pl.touk.sputnik;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
 

public class SimpleGoLinterTest {
    @Test
    public void testIsLineStartingWithTabs() {
        SimpleGoLinter linter = new SimpleGoLinter();
        assertTrue(linter.isLineStartingWithTabs(""));
        assertTrue(linter.isLineStartingWithTabs("{"));
        assertTrue(linter.isLineStartingWithTabs("func main() {"));
        assertTrue(linter.isLineStartingWithTabs("\tif number > 5 {"));
        assertFalse(linter.isLineStartingWithTabs(" if number > 5 {"));
    }
    @Test
    public void testIsVariableNameStartingWithNumber() {
        SimpleGoLinter linter = new SimpleGoLinter();
        assertTrue(linter.isVariableNameStartingWithNumber("1phoneNumber"));
        assertFalse(linter.isVariableNameStartingWithNumber(""));
        assertFalse(linter.isVariableNameStartingWithNumber("phoneNumber"));
    }

    @Test
    public void testIsLineLengthValid() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 79; i++) {
            stringBuilder.append('a');
        }
        String stringWith79Chars = stringBuilder.toString();

        SimpleGoLinter linter = new SimpleGoLinter();
        assertTrue(linter.isLineLengthValid(""));
        assertTrue(linter.isLineLengthValid("func main() {"));
        assertTrue(linter.isLineLengthValid(stringWith79Chars));
        assertFalse(linter.isLineLengthValid(stringWith79Chars + "a"));
    }

}

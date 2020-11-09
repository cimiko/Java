package go.g2academy.RegexDay11;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class RegexTest {

    @Test
    public void testSingleCharacterRegexUsingIterativeCode() {

        Pattern pattern = Pattern.compile(".s"); //Single Character Test
        Matcher matcher = pattern.matcher("as");
        boolean actual = matcher.matches();
        assertTrue(actual);
    }

    @Test
    public void testSingleCharacterRegexUsingChainingCode() {
        assertTrue(Pattern.compile(".show").matcher("ashow").matches());
    }

    @Test
    public void testSingleCharacterRegexUsingPatternMatchesMethod() {
        assertTrue(Pattern.matches("..s", "mas"));
    }

    @Test
    public void testMatchOneCharacterInBracket() {
        // []= is exactly one character.
        assertTrue(Pattern.matches("[abc]", "a"));
        assertTrue(Pattern.matches("[abc]", "b"));
        assertTrue(Pattern.matches("[abc]", "c"));
    }

    @Test
    public void testMatchNullOrOneCharacterInBracket() {
        // ? = is one or none
        assertTrue(Pattern.matches("[abc]?", ""));
        assertTrue(Pattern.matches("[abc]?", "c"));
    }

    @Test
    public void testMatchOneOrManyCharacterInBracket() {
        // []* = is one or many character.
        // []+ = is one or many character.
        assertTrue(Pattern.matches("[abc]*", "baaaacccaaabbb"));
        assertTrue(Pattern.matches("[abc]+", "baaaacccaaabbb"));

    }

    // Test Validition Email
    @Test
    public void testValidationEmailUsingRegex() {
        assertTrue(
                Pattern.matches(
                        "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$",
                        "abc@gmail.com"
                )
        );
    }

    @Test
    public void testInvalidIdEmailValidation() {
        assertFalse(
                Pattern.matches(
                        "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$",
                        "abcmail.com"
                )
        );
    }
}
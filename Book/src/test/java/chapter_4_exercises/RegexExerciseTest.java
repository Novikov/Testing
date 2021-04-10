package chapter_4_exercises;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RegexExerciseTest {

    RegexExercise regexExercise = new RegexExercise();

    @Test
    public void MatherMethodShouldFindSequenceOfThreeDigits(){
        Assert.assertEquals("Test failed because findDigit method doesn't return substring of digit","123",regexExercise.findDigit("ldskfjas123"));
        Assert.assertEquals("Test failed because findDigit method doesn't return substring of digit","123, 456",regexExercise.findDigit("ldskfjas123dsafsdf456"));
    }

}
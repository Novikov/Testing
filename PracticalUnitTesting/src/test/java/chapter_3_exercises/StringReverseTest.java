package chapter_3_exercises;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)
public class StringReverseTest {

    @Test
    public void methodReverseShouldWorksWithPlainStrings(){
        assertEquals("olleH",StringReverse.reverse("Hello"));
        assertEquals("321",StringReverse.reverse("123"));
        assertEquals("+_)(*&^%$#@!~",StringReverse.reverse("~!@#$%^&*()_+"));
    }

    @Test(expected = IllegalArgumentException.class)
    @Parameters(method = "parametersToTestAdd")
    public void methodReverseShouldThrowIAEForInvalidString(String s){
        StringReverse.reverse(s);
    }

    private String[] parametersToTestAdd() {
        return new String[] {"",null};
    }





}
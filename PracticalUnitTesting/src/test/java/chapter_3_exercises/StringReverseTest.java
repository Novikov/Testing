package chapter_3_exercises;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)
public class StringReverseTest {

    public String[] testStrings(){
        return new String[]{"Hello","123","~!@#$%^&*()_+"};
    }

    @Test
    @Parameters(method = "testStrings")
    public void methodReverseShouldWorksWithPlainStrings(String s){
        assertEquals(s,StringReverse.reverse(new StringBuilder(s).reverse().toString()));
    }

    private String[] parametersToTestAdd() {
        return new String[] {"",null};
    }

    @Test(expected = IllegalArgumentException.class)
    @Parameters(method = "parametersToTestAdd")
    public void methodReverseShouldThrowIAEForInvalidString(String s){
        StringReverse.reverse(s);
    }







}
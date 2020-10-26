package chapter_4_exercises;

import junitparams.JUnitParamsRunner;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class PasswordValidatorTest {
    PasswordValidator passwordValidator = new PasswordValidator();

    @Test(expected = IllegalArgumentException.class)
    public void passWordIsNotNull(){
        passwordValidator.validate(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void passWordIsNotEmpty(){
        passwordValidator.validate("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void passwordDoesnotContainSpaces(){
        passwordValidator.validate(" ");
    }


    @Test
    public void passwordShouldBeLargerThanTenSymbols(){
        Assert.assertFalse("Password length should be larger or equals 10 symbols!",
                passwordValidator.validateLength(passwordsForLengthCheck[0]));

        Assert.assertTrue("Password length should be larger or equals 10 symbols!",
                passwordValidator.validateLength(passwordsForLengthCheck[1]));

        Assert.assertTrue("Password length should be larger or equals 10 symbols!",
                passwordValidator.validateLength(passwordsForLengthCheck[2]));
    }

    String[] passwordsForDigitContainCheck = new String[]{"Hello","Hello1"};

    @Test
    public void passwordShouldContainOneDigit(){

    }



}

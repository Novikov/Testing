package chapter_4_exercises;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class PasswordValidatorTest {
    PasswordValidator passwordValidator = new PasswordValidator();

    @Test(expected = IllegalArgumentException.class)
    public void passwordIsNotNull(){
        passwordValidator.validate(null);
    }

    @Test
    public void passwordIsNotEmpty(){
        Assert.assertFalse("Test failed because password cannot be empty",passwordValidator.validate(""));
    }

    @Test
    public void passwordDoesNotContainSpaces(){
        Assert.assertFalse("Test failed because password cannot contain spaces", passwordValidator.validate(" "));
    }

    @Test
    @Parameters(method = "validPasswords")
    public void passwordShouldBeMoreOrEqualEightSymbols(String s){
        Assert.assertTrue("Test failed because password less than eight symbols",passwordValidator.validate(s));
        Assert.assertFalse("Test failed because password less than eight symbols, but password validator method returns true"
                ,passwordValidator.validate("Ok1!_"));
    }
    private String[] validPasswords() {
        return new String[] {"Hello123!_","Hello_World1!"};
    }

    @Test
    @Parameters(method = "validPasswords")
    public void passwordShouldContainAtLeastOneDigit(String s){
        Assert.assertTrue("Test failed because password doesn't contain digits",passwordValidator.validate(s));
        Assert.assertFalse("Test failed because password doesn't contain digits, but password validator method returns true",
                passwordValidator.validate("Hello_World"));
    }

    @Test
    @Parameters(method = "validPasswords")
    public void passwordShouldContainUnderscore(String s){
        Assert.assertTrue("Test failed because password doesn't contain underscore", passwordValidator.validate(s));
        Assert.assertFalse("Test failed because password doesn't contain underscore, but password validator returns true",passwordValidator.validate("Hello123"));
    }

    @Test
    @Parameters(method = "validPasswords")
    public void passwordShouldContainSequenceOfLoverAndCapitalSymbols(String s){
        Assert.assertTrue("Test failed because password doesn't contain sequence of lover and capital symbols",passwordValidator.validate(s));
        Assert.assertFalse("Test failed because password doesn't contain sequence of lover and capital symbols, but password validator returns true",passwordValidator.validate("hello_123"));
    }






}

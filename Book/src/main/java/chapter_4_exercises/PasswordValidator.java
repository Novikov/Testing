package chapter_4_exercises;

import java.util.regex.Pattern;

public class PasswordValidator {

    public boolean validateLength(String password){
        return password.length()>=10;
    }

    public boolean validate(String str) {

        if (str == null){
            throw new IllegalArgumentException("Password can't be null");
        }

        if(str.equals("")){
            return false;
        }

        if(str.contains(" ")){
            return false;
        }

        if(!(str.length()>=8)){
            return false;
        }

        if(!Pattern.compile("[0-9]").matcher(str).find()){
            return false;
        }

        if(!Pattern.compile("[_]").matcher(str).find()){
            return false;
        }

        if(!Pattern.compile("([a-z][A-Z])|([A-Z][a-z])").matcher(str).find()){
            return false;
        }



        return true;
    }
}

package chapter_4_exercises;

public class PasswordValidator {

    public boolean validateLength(String password){
        return password.length()>=10;
    }

    public void validate(String str) {
        if (str == null){
            throw new IllegalArgumentException("Password can't be null");
        }

        if(str.equals("")){
            throw new IllegalArgumentException("Password can't be empty");
        }

        if(str.contains(" ")){
            throw new IllegalArgumentException("Password can't contain spaces");
        }
    }
}

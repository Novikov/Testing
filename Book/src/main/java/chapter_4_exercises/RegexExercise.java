package chapter_4_exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExercise {
//    public static void main(String[] args) {
//        RegexExercise regexExercise = new RegexExercise();
//        regexExercise.findDigit("123jhdfksjad");
//    }

    public String findDigit(String line) {
        List result = new ArrayList();
        String pattern = "(\\d\\d\\d)";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(line);
        for(int i=0;m.find();i++){
           result.add(m.group(i));
        }
        int lastIndex = result.toString().length() - 1;
        String formatResult = result.toString().substring(1,lastIndex);
        return formatResult;
    }
}



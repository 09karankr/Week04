package advanceproblems.repeatingwords;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RepeatingWords {
    public static List<String> getWords(String text){
        String regex = "\\b(\\w+)\\s+\\1\\b";
        Pattern pattern  = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        List<String> list = new ArrayList<>();
        while(matcher.find()){
            list.add(matcher.group(1));

        }
        return list;
    }
    public static void main(String[] args) {

        String text = "This is is a repeated repeated word test.";
        List<String> list = getWords(text);
        System.out.println("List of repeated words :"+list);
    }
}

package validatelicenseplate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateLicensePlate {
    public static void main(String[] args) {
        String regex = "^[A-Z]{2}[0-9]{4}$";
        Pattern pattern = Pattern.compile(regex);

        String input = "AB1234 AV123 vcf2123 BN6547";
        String[] number = input.split("\\s+");

        Boolean foundMatch = false;
        for(String num : number){
            Matcher matcher = pattern.matcher(num);
            if (matcher.matches()){
                System.out.println("Valid : " + num);
                foundMatch = true;
            }
        }
        if (!foundMatch){
            System.out.println("Invalid");
        }
    }
}

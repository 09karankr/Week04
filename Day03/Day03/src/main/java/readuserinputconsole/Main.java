package readuserinputconsole;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static readuserinputconsole.UserInfoToFile.saveUserInfo;

public class Main {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your name: ");
        try {
            String name = reader.readLine();

            System.out.print("Enter your age: ");
            String age = reader.readLine();

            System.out.print("Enter your favorite programming language: ");
            String language = reader.readLine();

            saveUserInfo(name, age, language, "D:\\Week04\\Day03\\Day03\\src\\main\\resources\\console.txt");
            System.out.println("User information saved to console.txt");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

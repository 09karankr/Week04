package checkedexception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckedException {
    public static void main(String[] args) {
        String filepath = "data.txt";
        String file = "D:\\Week04\\Day04\\src\\main\\resources\\data.txt";

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(filepath))) {
                String line ;
                while((line = bufferedReader.readLine()) != null){
                    System.out.println(line);
                }

        } catch (IOException e){
            System.out.println("File not found!!" + e.getMessage());
        }
    }
}

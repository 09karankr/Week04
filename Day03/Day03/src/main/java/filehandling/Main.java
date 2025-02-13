package filehandling;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileReadWrite.copyFile("D:\\Week04\\Day03\\Day03\\src\\main\\resources\\readme.txt", "D:\\Week04\\Day03\\Day03\\src\\main\\resources\\CopiedTo.txt");
            System.out.println("File copied successfully.");
        } catch (FileNotFoundException e) {
            System.out.println("Source file not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("An error occurred while reading or writing the file: " + e.getMessage());
        }
    }
}

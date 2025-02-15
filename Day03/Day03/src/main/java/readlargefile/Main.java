package readlargefile;

import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        String filePath = "D:\\Week04\\Day03\\Day03\\src\\main\\resources\\100mb-examplefile-com.txt";
        try {
            LargeFileReader.readErrorLines(filePath);
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
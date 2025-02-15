package countwordsinfile;

import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        String filePath = "D:\\Week04\\Day03\\Day03\\src\\main\\resources\\copyTo.txt";
        try {
            Map<String, Integer> wordCount = WordCounter.countWords(filePath);
            WordCounter.displayTopWords(wordCount, 5);
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
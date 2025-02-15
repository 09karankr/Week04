package filterstreams;


import java.io.IOException;

import static filterstreams.UpperToLowerCaseConverter.UppercaseToLowercaseConverter.convertToLowercase;
public class Main {

        public static void main(String[] args) {
            String inputFile = "D:\\Week04\\Day03\\Day03\\src\\main\\resources\\cpy.txt";
            String outputFile = "D:\\Week04\\Day03\\Day03\\src\\main\\resources\\kbc.txt";

            try {
                convertToLowercase(inputFile, outputFile);
                System.out.println("File converted to lowercase successfully.");
            } catch (IOException e) {
                System.err.println("An error occurred: " + e.getMessage());
            }
        }
    }


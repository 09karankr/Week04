package datastreamsstudent;

import java.io.*;

import static datastreamsstudent.StudentDataStream.saveStudentData;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(101, "John Doe", 3.75);
        String file = "D:\\Week04\\Day03\\Day03\\src\\main\\resources\\chick.txt";

        try {
            saveStudentData(file, student);
            System.out.println("Student data saved.");

            Student retrieved = StudentDataStream.readStudentData(file);
            System.out.println("Retrieved Student: Roll: " + retrieved.rollNumber + ", Name: " + retrieved.name + ", GPA: " + retrieved.gpa);

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
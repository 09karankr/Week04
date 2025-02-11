package multileveluniversitymanagementsystem;

import java.util.ArrayList;

public class UniversityCourseManagement {
    public static void main(String[] args) {
        Course<ExamCourse> examCourses = new Course<>(new ArrayList<>());
        examCourses.addCourse(new ExamCourse("Math", "Pankaj"));
        examCourses.addCourse(new ExamCourse("Physics", "Satish"));

        Course<AssignmentCourse> AssignmentCourses = new Course<>(new ArrayList<>());
        AssignmentCourses.addCourse(new AssignmentCourse("Ai ml", "Siddhu"));
        AssignmentCourses.addCourse(new AssignmentCourse("Data science", "pawan"));

        Course<ResearchCourse> researchCourses = new Course<>(new ArrayList<>());
        researchCourses.addCourse(new ResearchCourse("Blockchain wallet", "shriman"));
        researchCourses.addCourse(new ResearchCourse("Puberty", "Nitish"));

        System.out.println("Exam courses: ");
        examCourses.displayCourse();

        System.out.println("Assignment courses: ");
        AssignmentCourses.displayCourse();

        System.out.println("Research Course: ");
        researchCourses.displayCourse();





    }
}

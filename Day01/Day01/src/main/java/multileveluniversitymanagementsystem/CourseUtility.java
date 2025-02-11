package multileveluniversitymanagementsystem;

import java.util.List;

public class CourseUtility {
    public static void displayCourses(List<? extends CourseType> courses) {
        for (CourseType course : courses) {
            System.out.println("Course: " + course.getCourseName() +
                    ", Instructor: " + course.getInstructor() +
                    ", Evaluation: " + course.getEvaluationMethod());
        }
    }
}

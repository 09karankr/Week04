package multileveluniversitymanagementsystem;

import java.util.List;

public class Course<T extends  CourseType> {
    private List<T> courses;

    public Course(List<T> courses) {
        this.courses = courses;
    }
    public void addCourse(T course){
        courses.add(course);
    }
    public void displayCourse(){
        for(T course : courses){
            System.out.println("Course: " + course.getCourseName() + ", Instructor: " + course.getInstructor() + ", Evaluation: " + course.getEvaluationMethod());
        }
    }
}

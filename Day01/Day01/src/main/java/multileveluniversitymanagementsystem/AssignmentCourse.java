package multileveluniversitymanagementsystem;

public class AssignmentCourse extends CourseType {
    public AssignmentCourse(String courseName, String instructor) {
        super(courseName, instructor);
    }
    @Override
    public String getEvaluationMethod(){
        return "Assignment based evaluation";
    }
}

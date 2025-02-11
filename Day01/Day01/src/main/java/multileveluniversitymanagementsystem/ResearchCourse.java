package multileveluniversitymanagementsystem;

public class ResearchCourse extends CourseType {
    public ResearchCourse(String courseName, String instructor) {
        super(courseName, instructor);
    }

    @Override
    public String getEvaluationMethod() {
        return "ResearchCourse evaluation method";
    }
}

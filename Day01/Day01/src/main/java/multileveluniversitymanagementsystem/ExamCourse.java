package multileveluniversitymanagementsystem;

 public class ExamCourse extends CourseType{
     public ExamCourse(String courseName, String instructor) {
         super(courseName, instructor);
     }
     @Override
     public String getEvaluationMethod(){
         return "Exam course based evaluation";
     }

 }

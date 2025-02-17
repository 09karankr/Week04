package reflections.basiclevel;


import java.lang.reflect.Constructor;

class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }
    public void display(){
        System.out.println("Student name is : " + name);
    }
}
public class DynamicallyCreateObject {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Student.class;

        //get constructor
        Constructor<?> constructor = cls.getConstructor(String.class);

        //create instance dynamically
        Student student = (Student) constructor.newInstance("Karan");

        //call method
        student.display();
    }
}

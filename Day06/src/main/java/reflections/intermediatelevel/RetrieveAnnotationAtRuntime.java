package reflections.intermediatelevel;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Author {
    String name() default "Author Name";
}

class Test {
    @Author(name = "Karan")

    public void myAuthor(){
        System.out.println("Executing myAuthor()");
    }
}
public class RetrieveAnnotationAtRuntime {
    public static void main(String[] args) throws Exception {
        Test obj = new Test();
        Class<?> cls = obj.getClass();

        //access methods
        Method method = cls.getMethod("myAuthor");

        //check if annotations are present
        if(method.isAnnotationPresent(Author.class)){
            //retrieve details
            Author author = method.getAnnotation(Author.class);
            System.out.println("author is " + author.name());
        }

        //invoke method
        method.invoke(obj);
    }
}

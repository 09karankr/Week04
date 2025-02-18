package reflections.advancelevel.objectmapper;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, Object> properties =  new HashMap<>();
        properties.put("name","Karan Kumar");
        properties.put("age", 22);
        try{
            Person person = ObjectMapper.toObject(Person.class,properties);
            System.out.println(person);

        } catch (Exception e) {
            throw new RuntimeException(e);

        }
    }
}

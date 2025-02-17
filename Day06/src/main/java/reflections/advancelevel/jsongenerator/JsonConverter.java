package reflections.advancelevel.jsongenerator;

import java.lang.reflect.Field;

public class JsonConverter {
    public static String toJson(Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append("{");

        Field[] fields = obj.getClass().getDeclaredFields();
        for (int i = 0; i<fields.length;i++) {
            fields[i].setAccessible(true);


            try {
                sb.append("\"")
                        .append(fields[i].getName())
                        .append("\" : \"")
                        .append(fields[i].get(obj))
                        .append("\"");

                if(i< fields.length-1){
                    sb.append(", ");
                }
            }catch (IllegalAccessException e){
                e.printStackTrace();
            }
        }
        sb.append("}");
        return sb.toString();
    }



    public static void main(String[] args) {
        class Person {
            private String name;
            private int age;

            public Person(String name, int age) {
                this.name = name;
                this.age = age;
            }
        }

        Person person = new Person("Karan Kumar",22);

        String json = toJson(person);
        System.out.println(json);
    }


}

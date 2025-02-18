package annotations.basicexcercise.usedeprecated;

public class LegacyAPI {

    @Deprecated
    public void oldMethod(){
        String API = "123-45-KLJ-IU90";
        System.out.println(API);
    }

    public void newMethod(){
        String API = "123-KAU-8907-HJKL";
        System.out.println(API);
    }

}

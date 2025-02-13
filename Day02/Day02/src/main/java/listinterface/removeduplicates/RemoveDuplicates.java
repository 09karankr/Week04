package listinterface.removeduplicates;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(3,1,2,2,3,4));
        Set<Integer> set = new LinkedHashSet<>(list);
        System.out.println("All elements: "+list);
        System.out.println("Unique elements: "+set);



    }
}

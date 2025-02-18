package annotations.basicexcercise.suppresswarnings;

import java.util.ArrayList;

public class UncheckedWarnings {
    public static void main(String[] args) {
        @SuppressWarnings("unchecked")
        ArrayList arr = new ArrayList<>();
    }

}

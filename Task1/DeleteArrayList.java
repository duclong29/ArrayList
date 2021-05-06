package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class DeleteArrayList {
    public static void main(String[] args) {
        List<String> programming = new ArrayList<>();

        programming.add("C");
        programming.add("C++");
        programming.add("Java");
        programming.add("Kotlin");
        programming.add("Python");
        programming.add("Perl");
        programming.add("Rube");

        System.out.println(programming);

        programming.remove(2);
        System.out.println(programming);

        boolean isRemoved = programming.remove("Rube");
        System.out.println(programming);

        List<String> newProgramming = new ArrayList<>();
        newProgramming.add("Python");
        newProgramming.add("Rube");
        newProgramming.add("Perl");

        programming.removeAll(newProgramming);
        System.out.println(programming);

        programming.removeIf(s -> s.charAt(0) == 'K');
        System.out.println(programming);

        programming.clear();
        System.out.println(programming);

    }
}

package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class SearchArray {
    public static void main(String[] args) {
        List<String> name = new ArrayList<>();

        name.add("John");
        name.add("Alice");
        name.add("Bob");
        name.add("Steve");
        name.add("John");
        name.add("Steve");
        name.add("Maria");

        System.out.println(name.contains("Jojds"));
        System.out.println(name.indexOf("Bob"));
        System.out.println(name.indexOf("John"));
        System.out.println(name.lastIndexOf("Maria"));
        System.out.println(name.lastIndexOf("Steve"));

    }
}

package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class CreateArrayList {
    public static void main(String[] args) {
        List<String> animal = new ArrayList<>();

        animal.add("dog");
        animal.add("cat");
        animal.add("lion");
        animal.add("tiger");

        System.out.println(animal);
        System.out.println("------------------------");
        animal.add(2, "elephant");
        System.out.println(animal);
        animal.add(5, "cat");
        System.out.println(animal);


    }
}

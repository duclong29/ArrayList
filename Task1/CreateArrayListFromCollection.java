package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class CreateArrayListFromCollection {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();

        number.add(2);
        number.add(3);
        number.add(4);
        number.add(5);
        number.add(6);
        number.add(7);
        number.add(8);
        number.add(9);
        number.add(10);

        System.out.println(number);
        System.out.println("----------------------------");

        List<Integer> newNumber1 = new ArrayList<>(number);

        List<Integer> newNumber = new ArrayList<>();
        newNumber.add(11);
        newNumber.add(12);
        newNumber.add(13);
        newNumber.add(14);
        newNumber.add(15);

        newNumber1.addAll(newNumber);

        System.out.println(newNumber1);
        System.out.println(newNumber1.addAll(newNumber));

    }
}

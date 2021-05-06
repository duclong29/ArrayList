package ArrayList;

import java.util.*;

public class SortArrayList {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();

        number.add(3);
        number.add(2);
        number.add(1);
        number.add(13);
        number.add(15);
        number.add(12);
        number.add(18);

        System.out.println("fist : " + number);

        Collections.sort(number);
        System.out.println("Last : " + number);

        Iterator<Integer> numberIterator = number.iterator();
        while (numberIterator.hasNext()) {
            Integer num = numberIterator.next();
            if (num % 2 == 0) {
                numberIterator.remove();
            }
        }
        System.out.println(number);
    }
}

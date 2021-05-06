package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListIteratorDelete {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();

        number.add(12);
        number.add(13);
        number.add(15);
        number.add(18);
        number.add(20);
        number.add(25);

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

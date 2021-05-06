package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IterateOverArayList {
    public static void main(String[] args) {
        List<String> tvShow = new ArrayList<>();

        tvShow.add("Breaking");
        tvShow.add("Game of thrones");
        tvShow.add("Friends");
        tvShow.add("Prison break");

        tvShow.forEach(tvShow1 -> {
            System.out.println(tvShow1);
        });

        System.out.println("-----------------------------------------");
        Iterator<String> tvShowIterator = tvShow.iterator();
        while (tvShowIterator.hasNext()) {
            String tvShow1 = tvShowIterator.next();
            System.out.println(tvShow1);
        }

        System.out.println("-----------------------------------------");
        ListIterator<String>  listIterator = tvShow.listIterator(tvShow.size());
        while (listIterator.hasPrevious()) {
            String tvshow1 = listIterator.previous();
            System.out.println(tvshow1);
        }

        System.out.println("-----------------------------------------");
        for (String tvShow1 : tvShow) {
            System.out.println(tvShow1);
        }

        System.out.println("-----------------------------------------");
        for (int i = 0; i < tvShow.size(); i++) {
            System.out.println(tvShow.get(i));
        }
    }
}

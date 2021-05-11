package ArrayList.Ex_love;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ex_love_List {
    List<Ex_love> ex_loveList;

    public Ex_love_List () {
        ex_loveList = new ArrayList<>();
    }

    public void AddExlove (Ex_love ex_love) {
        ex_loveList.add(ex_love);
    }

    public boolean DeleteExLove (String name) {
        Ex_love EX = this.ex_loveList.stream().filter(ex_love -> ex_love.getName().
                equals(name)).findFirst().orElse(null);
        if (EX == null) {
            return false;
        }
        this.ex_loveList.remove(EX);
        return true;
    }

    public void SearchExLove (String name) {
        boolean search = false;
        for (Ex_love s : ex_loveList) {
            if (s.getName().contains(name)) {
                search = true;
                System.out.println(s.toString());
                break;
            }
        }
        if (!search) {
            System.out.println("Can't see my ex!!!");
        }
    }

    public void PrintExLove () {

        for (int i = 0; i < ex_loveList.size(); i++) {
            System.out.println((i + 1) + "." + this.ex_loveList.get(i).getName() + "  @  " +
                    this.ex_loveList.get(i).getAge() + "  @  " + this.ex_loveList.get(i).getAddress() +
                    "  @  " + this.ex_loveList.get(i).getAppearence());
        }
    }

    public void SortExLove () {
        Collections.sort(ex_loveList, Comparator.comparing(Ex_love :: getName));
        for (int i = 0; i < ex_loveList.size(); i++) {
            System.out.println((i + 1) + "." + this.ex_loveList.get(i).getName() + "  @  " +
                    this.ex_loveList.get(i).getAge() + "  @  " + this.ex_loveList.get(i).getAddress() +
                    "  @  " + this.ex_loveList.get(i).getAppearence());
        }
    }

}

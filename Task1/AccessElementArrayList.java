package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class AccessElementArrayList {
    public static void main(String[] args) {
        List<String> topCompanies = new ArrayList<>();

        System.out.println(topCompanies.isEmpty());
        topCompanies.add("Google");
        topCompanies.add("Apple ");
        topCompanies.add("Microsoft");
        topCompanies.add("Amazon");
        topCompanies.add("Facebook");

        System.out.println(topCompanies.size());
        System.out.println(topCompanies);

        System.out.println(topCompanies.get(0));
        System.out.println(topCompanies.get(1));
        System.out.println(topCompanies.get(topCompanies.size() - 1));

        topCompanies.set(4, "zalo");
        System.out.println(topCompanies);

    }
}

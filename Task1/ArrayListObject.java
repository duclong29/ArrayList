package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListObject {
    private String name;
    private int age;

    public ArrayListObject (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        List<ArrayListObject> listObjects = new ArrayList<>();

        listObjects.add(new ArrayListObject("long", 21));
        listObjects.add(new ArrayListObject("huong", 24));
        listObjects.add(new ArrayListObject("tuyen", 1));
        listObjects.add(new ArrayListObject("an thoi", 2));

        listObjects.forEach(listObjects1 -> {
            System.out.println(listObjects1.getName() + ", " + listObjects1.getAge());
        });


    }
}



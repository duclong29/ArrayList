package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Person {
    private String name;
    private int age;

    public Person () {}

    public Person (String name, int age) {
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

    public String toString () {
        return "name = " + name + ", age = " + age;
    }

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();

        personList.add(new Person("long", 21));
        personList.add(new Person("an", 2));
        personList.add(new Person("phong", 14));
        personList.add(new Person("bich", 15));

        System.out.println(personList);

        personList.sort((Person1, Person2) -> {
            return Person1.getAge() - Person2.getAge();
        });

        personList.sort(Comparator.comparingInt(Person::getAge));
        System.out.println(personList);

        Collections.sort(personList, Comparator.comparing(Person::getName));
        System.out.println(personList);

    }
}

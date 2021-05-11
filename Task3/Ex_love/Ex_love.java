package ArrayList.Ex_love;

public class Ex_love {
    private String name;
    private int age;
    private String address;
    private String appearence;

    public Ex_love (String name, int age, String address, String appearence) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.appearence = appearence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAppearence() {
        return appearence;
    }

    public void setAppearence(String appearence) {
        this.appearence = appearence;
    }

    public String toString () {
        return "Name Ex_Love : " + name + " Age Ex_Love : " + age + " Address Ex_Love : " + address
                + " Appearence Ex_Love : " + appearence;
    }
}

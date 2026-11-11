package collectionTest;

public class Dog {
    private int id;
    private String name;
    private int age;

    public Dog(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ID : " + id + " / 종 :  " + name + " / 나이 : " + age ;
    }
}

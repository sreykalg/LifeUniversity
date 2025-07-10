package object;

public class Dog1 {

    private String name;
    private int age;

    public Dog1(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

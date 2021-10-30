package task_1.dog;

public class TestDog {

    public static void main(String[] args) {

        Dog d1 = new Dog("Mike", 2);
        System.out.println(d1);
        d1.intoHumanAge();
        Dog d2 = new Dog();
        d2.setAge(23);
        d2.setName("Rain");
        System.out.println(d2);
        d2.intoHumanAge();
    }
}

package lesson3;

public class Dog extends Animal implements Swimable{

    public Dog(String name, String color) {
        super(name, color);
    }

    public void attack(Cat cat) {
        cat.sayHello();
    }
    public void swim(){
        System.out.println("Собака плывет");
    }
}

package lesson3;

public class Cat extends Animal implements Swimable{

    public Cat(String name, String color) {
        super(name, color);
    }

    public void protest(){
        System.out.println("I dont wanna be " + color);
    }

    public void swim() {
        System.out.println("Кошка поплыла");
    }
}

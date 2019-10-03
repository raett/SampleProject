package lesson3;

import com.github.javafaker.Faker;

import java.util.Locale;

public class Scenario {
    public static void main(String[] args) {
        Animal animal = new Animal("asd", "asd");
        Dog dog= new Dog("b","red");
        Cat cat=new Cat("a","blue");

        dog.attack(cat);
        Animal[] mas = new Animal[20];
        Faker faker = new Faker(new Locale("ru"));
        for (int i = 0; i < mas.length; i++) {
            mas[i] = new Cat(faker.name().firstName(), faker.chuckNorris().fact());
        }
        for (int i = 0; i < mas.length; i++) {
            mas[i].sayHello();
        }


    }
}

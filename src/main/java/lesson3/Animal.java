package lesson3;

public class Animal {
    protected String name = "";
    protected String color = "";
    public Animal(){};

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void sayHello(){
        System.out.println("I " + name + ". My color is " + color);
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
}

package zoo;

public class App {
    public static void main(String[] args) {
        Dog bicho = new Dog();
        Animal freddy = new Cat();
        bicho.makeSound();
        freddy.makeSound();
        ((Cat)freddy).scratch();
        System.out.println(freddy instanceof Cat);
    }
}

class Animal {
    protected void makeSound() {
        System.out.println("Unknown animal sound");
    }
}

class Dog extends Animal {
    protected void makeSound() {
        System.out.println("Woof");
    }
}

class Cat extends Animal {
    protected void makeSound() {
        System.out.println("Meaw");
    }
    protected void scratch() {
        System.out.println("scratching...");
    }
}

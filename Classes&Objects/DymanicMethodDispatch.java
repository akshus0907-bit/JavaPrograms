// Parent class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class 1
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Child class 2
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class DymanicMethodDispatch {
    public static void main(String[] args) {

        Animal a;   // parent reference

        a = new Dog();   // child object
        a.sound();       // Dog's method runs

        a = new Cat();   // another child object
        a.sound();       // Cat's method runs
    }
}
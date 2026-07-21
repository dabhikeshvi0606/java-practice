// Abstraction

abstract class Animal {
    abstract void makeSound();

    void sleep() {
        System.out.println("Zzz...");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof Woof!");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow!");
    }
}

public class Abstract {
    public static void main(String[] args) {
        
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.makeSound(); 
        myCat.makeSound(); 

        myDog.sleep();     
    }
}
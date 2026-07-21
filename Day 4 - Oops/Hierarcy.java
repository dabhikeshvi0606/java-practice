//Hierarchical inheritance

class Animal{
    void eat(){
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    
    void bark(){
        System.out.println("Dog is barking");
    }
 }
class Cat extends Dog{
    void meow(){
        System.out.println("Cat meows");
    }
}

public class Hierarcy {
    public static void main(String[] args){
        Cat c = new Cat();
        c.eat(); //inherited method
        c.bark(); //own method
        c.meow();
 
    }
}


//polymorphism

class Animal{
    
    void sound(){
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal{
     
    void sound(){
        System.out.println("Dog barks");
    }
}

class cat extends Animal{

    void sound(){
        System.out.println("Cat meows");
    }
}
public class Poly{    
    public static void main(String[] args){
       
        Dog d = new Dog();
        cat c = new cat();

        d.sound();
        c.sound();
    }
}



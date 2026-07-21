//multiple inheritance

interface Father{
    void house();
}

interface Mother{
    void jewellery();
}

public class Child implements Father, Mother{
    public void house(){
        System.out.println("Father's House");
    }
    public void jewellery(){
        System.out.println("Mother's jewellery");
    }
    public static void main(String[] args){
        Child c = new Child();
        c.house();
        c.jewellery();
    }
}

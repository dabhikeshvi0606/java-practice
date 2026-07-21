class student{

    private String name;

    public void setName(String name){
        this.name = name;
    }

    public void getName(){
        System.out.println(name);
    }
}

public class encap {
    
    public static void main(String[] args){
        student s = new student();
        s.setName("Priya");
        s.getName();
    }
    
}

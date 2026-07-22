class InvalidAgeException extends Exception{
    InvalidAgeException(String s){
        super(s);
    }
}

public class throwingexception {
     static void vote(int age) throws InvalidAgeException{

        if (age<18){
            throw new InvalidAgeException("Age must be 18");
        }
        System.out.println("Eligible");
        }
        public static void main(String[] args){
           
            try{
                vote(13);
            }
            catch(Exception e){
                System.out.println("Exception occured: "+ e);
            }
        }
    }


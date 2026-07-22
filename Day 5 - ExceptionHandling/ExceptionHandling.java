public class ExceptionHandling {
    public static void main(String[] args){
        
        int i = 0;
        int j = 20;

        try{
            i = j/0;
        }
        catch(Exception e){
            System.out.println("Error" + e);
        }
         finally{
            System.out.println("It will execute");
        }
       
        System.out.println(i);

        
    }
}

public class Arithmetic {
    public static void main(String[] args){
        int i = 0;
        int j = 20;

        try{
            
            String s = null;
            System.out.println(s.length());
            System.out.println(j = j/i);
        }
        catch(ArithmeticException e){
           System.out.println("ArithmeticException");
        }
        catch(NullPointerException e){
            System.out.println("NullPointerException");
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Done");
    }
 
}

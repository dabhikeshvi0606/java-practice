public class Array1d {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Array elements:");
        //for(int i=0; i<arr.length; i++) // for printing array
            for(int i=arr.length-1; i>=0; i--) // for printing reverse array
            {
            System.out.println(arr[i]);
            }
    }
}

public class Array2d {
    public static void main(String[] args){
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6}
        };
        System.out.println("2D Array elements:");
       // for(int i=0; i<arr.length; i++){
           // for(int j=0; j<arr[i].length; j++){  for printing array
       //for(int i=arr.length-1; i>=0; i--){
           //for(int j=arr[i].length-1; j>=0; j--)  for printing reverse array
           for(int i=arr.length-1; i>=0; i--){
            for(int j=0; j<arr[i].length; j++)
           
                System.out.print(arr[i][j] + " ");
            
            System.out.println();
        }
    }

}

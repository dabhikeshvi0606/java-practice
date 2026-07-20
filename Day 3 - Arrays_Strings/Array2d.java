public class Array2d {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6}
        };

        //Original Logic (Reverse Rows, Forward Columns)
        System.out.println(" Reverse Rows, Forward Columns");
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // Reverse (Reverse Rows & Reverse Columns)
        System.out.println("\ne Reverse (Bottom-Right to Top-Left)");
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = arr[i].length - 1; j >= 0; j--) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
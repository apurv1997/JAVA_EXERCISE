import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int m = sc.nextInt();    // taking rows as input.
        System.out.println("Enter the number of columns: ");
        int n = sc.nextInt();    // takinh column as input.
        int [][] array = new int[m][n];    // declaring the 2D- matrix.
        System.out.println("Enter the elements of array: ");
        for(int i=0; i<m; i++)
        for(int j=0; j<n; j++)
        array[i][j] = sc.nextInt();    // reading array elements from user.
        System.out.println("Elements of the Array are: ");
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++)
            System.out.print(array[i][j] + " ");   // print elements.
            System.out.println();
        }


    }
}
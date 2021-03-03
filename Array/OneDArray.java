import java.util.Scanner;

public class OneDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Elements: ");
        int n = sc.nextInt();           // taking number of elements as input.
        int[] array = new int[10];      // declaring 1D-Array
        System.out.println("Enter the elements of Array: ");
        for(int i=0; i<n; i++) {
            array[i] = sc.nextInt();    // reading array element from user.
        }
        System.out.println("Array elements are: ");
        for(int i=0; i<n; i++) {
            System.out.println(array[i]);
        }
    }
}
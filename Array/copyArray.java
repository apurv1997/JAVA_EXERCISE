// Program to copy all elements of one array into another array

public class copyArray {
    public static void main(String args[]) {
        
        // initialise array
        int arr1[] = new int[] {1,2,3,4,5};
        
        // initialise second array
        int arr2[] = new int[arr1.length];
        
        // copying arr1[i] to arr2[i]
        for(int i=0; i<arr1.length; i++) {
            arr2[i] = arr1[i];
        }
        
            // print the original array
        System.out.println("Elements of arr1: ");
        for(int i=0; i<arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

        System.out.println();
            
            //print the second array
        System.out.println("Elements of arr2: ");
        for(int i=0; i<arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

        System.out.println();
    }
}

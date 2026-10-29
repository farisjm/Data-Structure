import java.util.Scanner;

public class ArrayInsertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
    
        // Allocate space for n + 1 elements to accommodate the insertion
        int[] arr = new int[n + 1];
     
        System.out.println("Enter array elements: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
   
        System.out.print("Enter the element to insert: ");
        int element = sc.nextInt();
        
        System.out.print("Enter the position (0 to " + n + ") where you want to insert: ");
        int pos = sc.nextInt();
        
        // Validate position
        if(pos < 0 || pos > n) {
            System.out.println("Invalid position!");
        } else {
            // Shift elements to the right to create space
            for(int i = n; i > pos; i--) {
                arr[i] = arr[i - 1];
            }
            
            // Insert the element at the specified position
            arr[pos] = element;
            n++; // Increment the size count
            
            System.out.print("Array after insertion: ");
            for(int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}

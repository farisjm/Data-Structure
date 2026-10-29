import java.util.Scanner;

public class ArrayDeletion {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int[] arr = new int[20];
        
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        
        System.out.println("Enter Array elements: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Enter the position to delete: ");
        int pos = sc.nextInt();
        
        
        for(int i = pos; i < n - 1; i++){
            arr[i] = arr[i + 1];
        }
        n--;
        
        System.out.println("Array after deletion: ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        
       
    }
}
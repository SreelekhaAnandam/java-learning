package Arrays;
import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("No.of elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to search:");
        int key = sc.nextInt();
        boolean found = false;
        for(int i = 0; i < n; i++){
            if(arr[i] == key){
                System.out.println("element found");
            }else{
                System.out.println("element not found");
            }
        }
        sc.close();
    }
}

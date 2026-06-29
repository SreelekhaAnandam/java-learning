package DSA.Arrays;
import java.util.Scanner;
public class SortedArray{
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        System.out.println("Enter the elements:");
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        boolean isSorted = true;
        for(int i = 0; i<n - 1; i++){
            if(arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("array is sorted");
        }else{
            System.out.println("array is not sorted");
        }
        sc.close();
    }
}

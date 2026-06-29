package DSA.Arrays;
import java.util.Scanner;
public class EndZeros{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        System.out.println("Enter the elements of array:");
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int j = 0;
        for(int i = 0; i<n; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                j++;
            }
        }
        System.out.println("after moving zeros to end");
        for(int i = 0; i<n;i++){
            System.out.println(arr[i]+"");
        }
        sc.close();
    }
}
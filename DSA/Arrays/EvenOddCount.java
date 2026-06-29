package DSA.Arrays;
import java.util.Scanner;
public class EvenOddCount{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        System.out.println("Enter elements:");
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int evenCount = 0;
        int oddCount = 0;
        for(int i = 0; i<n; i++){
            if(arr[i] % 2 == 0){
                evenCount++;
            }else{
                oddCount++;
            }
        }
        System.out.println("no.of even numbers:"+evenCount);
        System.out.println("no.of odd numbers:" + oddCount);
        sc.close();
    }
}
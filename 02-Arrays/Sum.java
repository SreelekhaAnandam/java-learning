package Arrays;
import java.util.Scanner;
public class Sum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("No.of Elements:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i = 0; i <n; i++){
            sum = sum + arr[i];
        }
        System.out.println("sum is:"+sum);
        sc.close();
    }
}

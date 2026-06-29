import java.util.Scanner;
public class Palindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbe");
        int num = sc.nextInt();
        int Original = num;
        int reverse = 0;
        int rem;
        while(num!=0){
            rem = num % 10;
            reverse = reverse * 10 + num;
            num = num/10;
        }
        if(Original == reverse){
            System.out.println("It is a palindrome");
        }else{
            System.out.println("It is not a palindrome");
        }
        sc.close();
    }
}

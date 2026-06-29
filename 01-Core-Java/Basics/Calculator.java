import java.util.Scanner;
public class Calculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1:");
        double num1 = sc.nextDouble();
        System.out.println("Enter num2:");
        double num2 = sc.nextDouble();
        System.out.println("Enter operator(+,-,*,/):");
        char op = sc.next().charAt(0);
        switch(op){
            case '+':
                System.out.println("Result is:"+(num1 + num2));
                break;
            case '-':
                System.out.println("Result is:"+(num1 - num2));
                break;
            case '*':
                System.out.println("Result is:"+(num1 * num2));
                break;
            case '/':
                if(num2 != 0){
                    System.out.println("Result is:"+(num1/num2));
                }else{
                    System.out.println("Not possible with num2 as 0");
                }
                break;
            default:
                System.out.println("Enter the proper numbers");
        }
        sc.close();
    }
}

import java.util.Scanner;

public class scan {
    public static void main(String[] args) {
        System.out.println("Taking the Input from : ");
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int a = inp.nextInt();
        System.out.println("Enter the second number : ");
        int b = inp.nextInt();
        int sum = a + b;
        System.out.print("Sum is : ");
        System.out.println(sum);
    }
}

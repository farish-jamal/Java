import java.util.Scanner;

public class percentage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Name : ");
        String name = scan.nextLine();
        System.out.println("Enter Number In Science : ");
        int a = scan.nextInt();
        System.out.println("Enter Number In SST : ");
        int b = scan.nextInt();
        System.out.println("Enter Number In English : ");
        int c = scan.nextInt();
        System.out.println("Enter Number In Maths : ");
        int d = scan.nextInt();
        System.out.println("Enter Number In Hindi : ");
        int e = scan.nextInt();
        int total = a + b + c + d + e;
        System.out.print(name + " ");
        System.out.print("Your Total Marks is : ");
        System.out.println(total);
        int percent = total / 5;
        System.out.print(name + " ");
        System.out.print("Your Total % is : ");
        System.out.println(percent);
    }
}

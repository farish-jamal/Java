import java.util.Scanner;
public class oddeven {
    public static void main(String[] args) {
        System.out.print("Enter Your Number");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if(number%2 == 0){
            System.out.println(number + " Is a Even Number");
        }else{
            System.out.println(number + " Is a Odd Number");
        }
    }
}

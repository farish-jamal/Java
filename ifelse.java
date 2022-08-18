import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age : ");
        int a = sc.nextInt();
        if(a < 18){
            System.out.println("You are not eligible to vote");
        }else if(a == 18){
            System.out.println("Apply for your votar Id");
        }else{
            System.out.println("You can Vote!");
        }
    }
}

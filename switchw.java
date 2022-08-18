import java.util.Scanner;

public class switchw {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter The Button");
        int button = scan.nextInt();
        switch (button) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Bonjour");
                break;
            case 3:
                System.out.println("Namaste");
                break;
            default:
                System.out.println("Invalid Button");
                break;
        }
    }
}

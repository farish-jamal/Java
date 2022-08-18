import java.util.*;
public class game {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 0 for Rock \n 1 for Scissor \n 2 for Paper");
        System.out.println("Choose Your Option : ");
        int userInput = scan.nextInt();

        Random random = new Random();
        int computerInput = random.nextInt(3);

        if(userInput == computerInput){
            System.out.println("Draw!");
        }else if(userInput == 0 && computerInput == 1 || userInput == 1 && computerInput == 2 || userInput == 2 && computerInput == 0){
            System.out.println("You Win!");
        }else{
            System.out.println("Computer Win!");
        }
        System.out.println("Computer Input " + computerInput );
    }
}

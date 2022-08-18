public class patterns2 {
    public static void pattern1() {
        for(int i = 1; i<=4; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            for(int j = 1; j<=2*(4-i); j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 4; i>=1; i--){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            for(int j = 1; j<=2*(4-i); j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern2() {
        for(int i = 1; i<=4; i++){
            for(int j=i; j<4; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            for(int j =2; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 4; i>=1; i--){
            for(int j=i; j<4; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            for(int j =2; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // pattern1();
        pattern2();
    }
}

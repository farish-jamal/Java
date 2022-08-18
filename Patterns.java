
public class Patterns {
    public static void pattern1() {
        for(int i = 1; i<=4; i++){
            for(int j = 1; j<=5; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        
    }
    public static void pattern2() {
        for(int i = 1; i<=4; i++){
            for(int j = 1; j<=5; j++){
                if(i == 1 || i == 4 || j == 1 || j == 5){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public static void pattern3() {
        for(int i = 1; i<=4; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern4() {
        for(int i = 1; i<=4; i++){
            for(int j = 1; j<=(4 - i + 1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern5() {
        for(int i = 1; i<=4; i++){
            for(int j = 1; j<=4-i; j++){
                System.out.print(" ");
            }
            for(int k= 1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern6() {
        for(int i = 1; i<=5; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void pattern7() {
        for(int i = 1; i<=5; i++){
            for(int j = 1; j<=(5-i + 1); j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void pattern8() {
        int count = 1;
        for(int i = 1; i<=5; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }

    public static void pattern9() {
        int count = 0;
        for(int i = 1; i<=5; i++){
            for(int j = 1; j<=i; j++){
                if(count%2==0){
                    System.out.print(1);
                }else{
                    System.out.print(0);
                }
                count++;
            }
            System.out.println();
        }
    }

    public static void pattern10() {
        for(int i = 1; i<=5; i++){
            for(int j = 1; j<=5-i; j++){
                System.out.print("   ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print(" * ");
            }
            for(int j = 1; j<=5-i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void pattern11() {
        for(int i = 1; i<=9; i++){
            for(int j = 1; j<=9-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void pattern12() {
        for(int i = 1; i<=5; i++){
            for(int j = 1; j<=5-i; j++){
                System.out.print(" ");
            }
            for(int j = i; j>=1; j--){
                System.out.print(j);
            }
            for(int j = 2; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // pattern1(); 
        // pattern2();  
        // pattern3(); 
        // pattern4(); 
        // pattern5(); 
        // pattern6();
        // pattern7();
        // pattern8();
        // pattern9();
        // pattern10();
        pattern11();
        // pattern12();

    }
}

import java.util.*;

public class assesment {
    public static float avarge(Scanner sc){
        System.out.println("Enter the numbers");
        float b = sc.nextFloat();
        float a = sc.nextFloat();
        float c = sc.nextFloat();
        float sum = (a + b + c)/3;
        return sum;
    }

    public static int sumOfOdd(Scanner sc) {
        System.out.println("Enter The Value of n");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i<=n; i++){
            if(i%2 != 0){
                sum += i;
            }
        }
        return sum;
    }

    public static int gratestOfTwo(Scanner sc) {
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a > b){
            return a;
        }else{
            return b;
        }
    }

    public static float circumfrence(Scanner sc) {
        System.out.println("Emter The Radius : ");
        float r = sc.nextFloat();
        float circum = (2 * (22/7) * (r * r));
        return circum;
    }

    public static void countInt(Scanner sc) {
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        int neg = 0;
        int pos = 0;
        int zero = 0;
        for(int i = 0; i<n; i++){
           int a = sc.nextInt();
           if(a > 0){
             pos = pos + 1; 
           }else if(a < 0){
             neg = neg + 1;
           }else{
             zero = zero + 1;
           }
        }
        System.out.println("Total Number of Zeros : " + zero);
        System.out.println("Total Number of Positives : " + pos);
        System.out.println("Total Number of Negative : " + neg);
        return;
    }

    public static void fibbonanci(Scanner sc) {
        int a = 0;
        int b = 1;
        System.out.print(a + " ");
        System.out.print(b + " ");
        for(int i = 0; i<7; i++){
            int sum = a + b;
            int nextNumber = sum;
            a = b;
            b = nextNumber; 
            System.out.print(b + " ");
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println(avarge(sc)); 
        // System.out.println(sumOfOdd(sc));
        // System.out.println("Greatest Number is : " + gratestOfTwo(sc));
        // System.out.println("Circumerence is : " + circumfrence(sc));
        // do{
        //     System.out.println("hello");
        // }
        // while(true);
        // countInt(sc);
        fibbonanci(sc);
    }
}

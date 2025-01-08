import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base: ");
        int base = sc.nextInt();
        System.out.println("Enter the exponent: ");
        int exponent = sc.nextInt();
        System.out.println("Power: " + (Math.pow(base, exponent)));
        sc.close();
    }
    
}

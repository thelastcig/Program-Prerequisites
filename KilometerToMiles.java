import java.util.Scanner;
public class KilometerToMiles {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value in KM: ");
        float km = sc.nextFloat();
        System.out.println(km + " Kilometer = " + (km*0.621371) + " Miles");

    }
}

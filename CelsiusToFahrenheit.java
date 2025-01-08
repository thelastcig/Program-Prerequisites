import java.util.Scanner;
public class CelsiusToFahrenheit {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Temperature in Celsius: ");
		int temp = sc.nextInt();
		int fahrenheit = (temp * 9/5) + 32;
		System.out.println("Fahrenheit: " + fahrenheit);
	}	
    
}

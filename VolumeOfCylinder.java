import java.util.*;
public class VolumeOfCylinder {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of cylinder: ");
        int radius = sc.nextInt();
        System.out.println("Enter the height of the cylinder: ");
        int height = sc.nextInt();
        double volume = Math.PI * Math.pow(radius, 2) * height;
        System.out.println("Volume of Cylinder: " + volume);
    }
    
}

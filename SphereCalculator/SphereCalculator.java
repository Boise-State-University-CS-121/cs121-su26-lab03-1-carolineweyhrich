import java.util.Random;
import java.util.Scanner;

public class SphereCalculator {

    
    public static void main(String[] args)
    {
        Scanner kbd = new Scanner(System.in);    
        Random myGen = new Random();

        System.out.print("Enter the sphere's radius: ");
        String userRadius = kbd.nextLine();
    
        double radius = Double.parseDouble(userRadius);

        double volume = (radius) * (radius) * (radius) * (Math.PI) * (4.0 /3.0 );
        double surfaceArea = 4 * Math.PI * (radius) * (radius);

        
        System.out.printf("Volume: %.4f\n", volume);
        System.out.printf("Surface area: %.4f\n", surfaceArea);

        kbd.close();
}
}

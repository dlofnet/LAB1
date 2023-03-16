//Program by STACEY ANDREW GONZAGA
import java.util.*;

public class AreaCircumferenceCircle {
    public static void main(String[] args) throws Exception {
        System.out.println("Program by STACEY ANDREW GONZAGA");
        
        //pi constant
        final float pi = (float) 3.14;
        Scanner sc = new Scanner(System.in);

            //float r from user input
            System.out.print("Enter value of r: ");
            float r = sc.nextFloat();

            //solving for area and circumference
            float area = pi * (r * r);
            float circumference = 2 * pi * r;

            //result
            System.out.println("The area is " + area + " and the circumference is " + circumference);
    }
}

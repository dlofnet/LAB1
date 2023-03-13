import java.util.*;

public class AreaCircumferenceCircle {
    public static void main(String[] args) throws Exception {
        //pi constant
        final float pi = (float) 3.14;

        try (Scanner sc = new Scanner(System.in)) {
            //float r from user input
            System.out.println("Enter value of r: ");
            float r = sc.nextFloat();
            
            //solving for area and circumference
            float area = pi * (r * r);
            float circumference = 2 * pi * r;

            //result
            System.out.println("The are is " + area + " and the circumference is " + circumference);
        }
    }
}

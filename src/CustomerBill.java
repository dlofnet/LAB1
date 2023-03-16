//Program by STACEY ANDREW GONZAGA
import java.text.DecimalFormat;
import java.util.Scanner;

public class CustomerBill {
    public static void main(String[] args) throws Exception {
        System.out.println("Program by STACEY ANDREW GONZAGA");

        DecimalFormat df = new DecimalFormat("0.00");
        DecimalFormat df2 = new DecimalFormat("0");
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter phone brand: ");
        String brand = sc.next();
        System.out.print("Enter phone color: ");
        String color = sc.next();
        System.out.print("Enter phone price: ");
        float price = sc.nextFloat();
        System.out.print("Enter item quantity: ");
        float quantity = sc.nextFloat();

        float grossValue = price * quantity;
        float vat = (float) (grossValue * .038);
        float netValue = grossValue + vat;

        System.out.println("\nPhone brand: " + brand);
        System.out.println("Phone color: " + color);
        System.out.println("Phone price: " + df.format(price));
        System.out.println("Item quantity: " + df2.format(quantity));
        System.out.println("Gross Value: " + df.format(grossValue));
        System.out.println("VAT: " + df.format(vat));
        System.out.println("Net Value: " + df.format(netValue) + "\n");

        System.out.println("Amount tendered: ");
        float change = sc.nextFloat() - netValue;
        
        System.out.println("\nCustomer change: " + df.format(change));
    }
}

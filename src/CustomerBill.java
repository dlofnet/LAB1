import java.util.Scanner;

public class CustomerBill {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter phone brand: ");
        String brand = sc.next();
        System.out.println("Enter phone color: ");
        String color = sc.next();
        System.out.println("Enter phone price: ");
        float price = sc.nextFloat();
        System.out.println("Enter item quantity: ");
        float quantity = sc.nextFloat();

        float grossValue = price * quantity;
        float vat = (float) (grossValue * .038);
        float netValue = grossValue + vat;

        System.out.println("\nPhone brand: " + brand);
        System.out.println("Phone color: " + color);
        System.out.println("Phone price: " + price);
        System.out.println("Item quantity: " + quantity);
        System.out.println("Gross Value: " + grossValue);
        System.out.println("VAT: " + vat);
        System.out.println("Net Value: " + netValue + "\n");

        System.out.println("Amount tendered: ");
        float change = sc.nextFloat() - netValue;
        
        System.out.println("\nCustomer change: " + change);
    }
}

import java.util.Scanner;

public class EnterCalculatedDiscount {
    public static double CalcuateDiscount(double SalesAmount) {

        double discount = 0;

        if (SalesAmount > 50000) {
            discount = SalesAmount * 0.1;
        } else if (SalesAmount >= 1000) {
            discount = SalesAmount * 0.05;
        }
        return discount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the sale Amount: ");
        double SalesAmount = scanner.nextDouble();
        double discount = CalcuateDiscount(SalesAmount);
        System.out.println("Discount: " + discount);
        System.out.println("Final Price: " + (SalesAmount - discount));

        scanner.close();
    }
}

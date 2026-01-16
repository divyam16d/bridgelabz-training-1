import java.util.*;

public class Uni {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double fee = sc.nextDouble();

        double discountRate = 0.10; 
        double discountAmount = fee * discountRate;
        double discountedPrice = fee - discountAmount;

        System.out.println("Discount Amount: " + discountAmount);
        System.out.println(" Price to Pay: " + discountedPrice);

    }
}

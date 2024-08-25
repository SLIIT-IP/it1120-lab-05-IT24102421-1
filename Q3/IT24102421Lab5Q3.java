import java.util.Scanner;

public class IT24102421Lab5Q3 {

    
    public static final double ROOM_CHARGE_PER_DAY = 48000.0;
    public static final int DISCOUNT_3_TO_4_DAYS = 10;
    public static final int DISCOUNT_5_OR_MORE_DAYS = 20;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter Start Date (1-31): ");
        int startDate = scanner.nextInt(); 

        System.out.print("Enter End Date (1-31): ");
        int endDate = scanner.nextInt();

        
        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Dates must be between 1 and 31.");
        } else if (startDate >= endDate) {
            System.out.println("Error: Start Date must be less than End Date.");
        } else {
            
            int daysReserved = endDate - startDate;

            
            double discountRate = 0.0;
            if (daysReserved >= 3 && daysReserved <= 4) {
                discountRate = DISCOUNT_3_TO_4_DAYS;
            } else if (daysReserved >= 5) {
                discountRate = DISCOUNT_5_OR_MORE_DAYS;
            }

            
            double totalAmount = ROOM_CHARGE_PER_DAY * daysReserved;
            totalAmount -= totalAmount * (discountRate / 100);

            
            System.out.println("Room Charge Per Day: Rs. " + ROOM_CHARGE_PER_DAY);
            System.out.println("Number of Days Reserved: " + daysReserved);
            System.out.println("Total Amount to be Paid: " + totalAmount);
        }
    }
}

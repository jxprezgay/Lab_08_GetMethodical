import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double item;
        double total = 0;
        boolean moreItems;
        do {
            item = SafeInput.getRangedDouble(in, "Enter the price of your item", .50, 9.99);
            total += item;
            moreItems = SafeInput.getYNConfirm(in, "Are you done entering items");
        } while(!moreItems);

        System.out.print("Your total is: ");
        System.out.printf("%.2f",total);
    }
}

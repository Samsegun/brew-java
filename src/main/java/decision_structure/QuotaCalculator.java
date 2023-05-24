package decision_structure;

import java.util.Scanner;

public class QuotaCalculator {
    public static void main(String[] args) {
        int quota = 10;

        System.out.println("How many sales did you make this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        if(sales >= quota) {
            System.out.println("Congratulations, you made the quota!");
        }else {
            int salesShort = quota - sales;
            System.out.println("You're short of " + salesShort + " sales");
        }
    }
}

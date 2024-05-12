//https://codeforces.com/problemset/problem/546/A
import java.util.Scanner;

public class SoldierAndBananas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        int n = scanner.nextInt(); // Number of bananas
        int k = scanner.nextInt(); // Initial amount of money the soldier has
        int w = scanner.nextInt(); // Number of bananas he wants to buy

        int costs = 0;

        // Calculate total cost
        for (int i = 1; i <= w; i++) {
            costs += i * n;
        }

        // Calculate the amount he needs to borrow or 0 if he has enough money
        int result = Math.max(0, costs - k);

        // Print the result
        System.out.println(result);

        scanner.close();
    }
}

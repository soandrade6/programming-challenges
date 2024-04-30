//  https://codeforces.com/problemset/problem/791/A

import java.util.Scanner;

public class BearAndBigBrother {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int limakWeight = scanner.nextInt();
        int bobWeight = scanner.nextInt();
        
        boolean band = true;
        int years = 0;
        
        while (band) {
            years++;
            limakWeight *= 3;
            bobWeight *= 2;
            if (limakWeight > bobWeight) {
                band = false;
            }
        }
        System.out.println(years);
    }
}

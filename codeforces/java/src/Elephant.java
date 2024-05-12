import java.util.Scanner;

public class Elephant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        scanner.close();

        int steps = (int) Math.ceil((double) x / 5);
        System.out.println(steps);
    }
}

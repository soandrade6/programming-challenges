import java.text.DecimalFormat;
import java.util.*;

public class PlusMinus {
    public static void plusMinus(List<Integer> arr) {
        int negative = 0, positive = 0, zero = 0;

        for (int i : arr) {
            if (i > 0) {
                positive++;
            } else if (i < 0) {
                negative++;
            } else {
                zero++;
            }
        }

        DecimalFormat df = new DecimalFormat("0.000000");

        System.out.println(df.format((double) positive / arr.size()));
        System.out.println(df.format((double) negative / arr.size()));
        System.out.println(df.format((double) zero / arr.size()));

    }

    public static void main(String[] args) {

        List<Integer> arr = List.of(-4, 3, -9, 0,4,1);
        plusMinus(arr);
    }
}
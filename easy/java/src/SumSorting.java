// https://codeforces.com/problemset/problem/339/A

import java.util.Arrays;
import java.util.Scanner;

public class SumSorting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Leer la entrada y dividirla en una matriz de strings utilizando el operador de suma como separador
        String[] inputArray = scanner.nextLine().split("\\+");
        
        // Convertir los strings en la matriz en enteros
        int[] numbers = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            numbers[i] = Integer.parseInt(inputArray[i]);
        }
        
        // Ordenar los números
        Arrays.sort(numbers);
        
        // Imprimir los números ordenados como una cadena, separados por "+"
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
            result.append(numbers[i]);
            if (i < numbers.length - 1) {
                result.append("+");
            }
        }
        System.out.println(result.toString());
        
        scanner.close();
    }
}

package math.problems;

import java.util.Scanner;

public class Factorial {

    static int factRecursive(int number) {
        if (number == 1)
            return 1;

        return number * factRecursive(number - 1);
    }

    private static int factIterative(int number) {

        int factorial = 1;
        for (int iNumber = 1; iNumber <= number; iNumber++) {
            factorial = factorial * iNumber;
        }
        return factorial;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println(" Enter input number : ");
            int number = scanner.nextInt();

            int factNumber = factRecursive(number);
            System.out.printf("factorial(%d) - Recursive method: %d\n",number,factNumber);

            factNumber = factIterative(number);
            System.out.printf("factorial(%d) - Iterative method: %d\n",number,factNumber);
        }
    }
}
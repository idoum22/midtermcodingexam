package math.problems;

import org.junit.Assert;import org.junit.Test;import java.io.FileWriter;
import java.io.IOException;import java.sql.Connection;import java.sql.DriverManager;
import java.sql.SQLException;import java.util.ArrayList;import java.util.Arrays;
import java.util.Scanner;import static math.problems.Factorial.factRecursive;
import static math.problems.FindMissingNumber.findMissingNumber;
import static math.problems.PrimeNumber.checkPrime;

public class UnitTestingMath {
    @Test
    public int test0() {
        int number = 0;
        if (number == 1)
            return 1;
        return 0;
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
            System.out.print(" Enter input number : ");
            int number = scanner.nextInt();
            int factNumber = factRecursive(number);
            System.out.printf("factorial(%d) - Recursive method: %d\n", number, factNumber);
            factNumber = factIterative(number);
            System.out.printf("factorial(%d) - Iterative method: %d\n", number, factNumber);
            Assert.assertEquals(number, factNumber);
            System.out.println("test 0 passed");
        }
    }

    @Test
    public int test1() {
        int dp[] = new int[21];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= 20; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        for (int i = 0; i <= 20; i++) {
            System.out.println("Fibonacci Number for n = " + i + " is " + dp[i]);
            Assert.assertEquals(dp, i);
            System.out.println("test 1 passed");
        }


    @Test
    public int test2() {
        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};
        int m = 8, n = 8;
        Arrays.sort(array1);
        Arrays.sort(array2);
        int a = 0, b = 0, res = Integer.MAX_VALUE;
        while (a < m && b < n) {
            if ((array1[a] - array2[b]) < res) {
                res = (array1[a] - array2[b]);
            }
            if (array1[a] < array2[b]) {
                a++;
            } else {
                b++;
            }
        }
        System.out.println("Lowest Difference = " + res);
        Assert.assertEquals(array1, array2);
        System.out.println("test 2 passed");


    @Test
    public int test3() {
                int[] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};

                public static int findMissingNumber int missingNumber = findMissingNumber(array);
                System.out.println(missingNumber);


                ( int array[]){
                    int i;
                    int n = 10;
                    int totalSum = n * (n + 1) / 2;
                    int arraySum = 0;
                    for (i = 0; i < array.length; i++) {
                        arraySum = arraySum + array[i];
                    }
                    int missingNumber = totalSum - arraySum;
                    return missingNumber;
                    Assert.assertEquals(missingNumber, findMissingNumber());
                    System.out.println("test 3 passed");
                }

                @Test
                public int test4() {
                    int[] initializedArray
                            = new int[]{25, 110, 74, 75, 5};
                    System.out.println("Random array");
                    for (int i = 0; i < initializedArray.length; i++) {
                        System.out.println(initializedArray[i]);
                    }
                    int minValue = initializedArray[0];
                    for (int i = 0; i < initializedArray.length; i++) {
                        if (initializedArray[i] < minValue)
                            minValue = initializedArray[i];
                    }
                    System.out.println(
                            "Smallest element present in given array: "
                                    + minValue);


                    @Test
                    public int test5() {
                        int n = 6;
                        for (int i = 0; i < n; i++) {
                            for (int j = n - i; j > 1; j--) {
                                System.out.print(" ");
                            }
                            for (int j = 0; j <= i; j++) {
                                System.out.print("* ");
                            }
                            System.out.println();
                            Assert.assertEquals(n, i);
                            System.out.println("test 5 passed");
                        }
                    }

                    @Test
                    public int test6() {

                        for (int i = 100; i >= 0; i--) {
                            System.out.print(String.valueOf(i) + " ");
                        }
                        System.out.println();
                        Assert.assertEquals(n, i);
                        System.out.println("test 6 passed");
                    }

                    @Test
                    public int test7() {
                        static boolean checkPrime ( int n)
                        {
                            boolean isPrime = true;
                            for (int i = 2; i <= Math.sqrt(n); i++) {
                                if (n % i == 0) {
                                    isPrime = false;
                                    break;
                                }
                            }
                            if (isPrime) {
                                return true;
                            } else {
                                return false;
                            }
                        }
                        public static void main (String[]args){
                            int numberOfPrimes = 0;
                            ArrayList<Integer> arrList = new ArrayList<>();
                            for (int i = 2; i <= 1000000; i++) {
                                if (checkPrime(i)) {
                                    arrList.add(i);
                                    numberOfPrimes++;
                                }
                            }
                            System.out.println(numberOfPrimes);
                            try {
                                FileWriter writer = new FileWriter("primeNumbers.txt");
                                for (int i = 0; i < arrList.size(); i++) {
                                    writer.write(arrList.get(i) + ", ");
                                    if ((i + 1) % 10 == 0) {
                                        writer.write("\n");
                                    }
                                }
                                writer.close();
                                System.out.println("Data successfully wrote to the file!");
                            } catch (IOException e) {
                                System.out.println("An error occurred.");
                                e.printStackTrace();
                                Assert.assertEquals(checkPrime, numberOfPrimes);
                                System.out.println("test 7 passed");


                            }
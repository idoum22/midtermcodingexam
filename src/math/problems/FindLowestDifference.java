package math.problems;


import java.util.*;

public class FindLowestDifference{

    public static void main(String []args){
        int [] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int [] array2 = {18, 25, 41, 47, 17, 36, 14, 19};
// m and n stores the sizes of array1 and array2 respectively
        int m = 8, n = 8;

// sorting both the arrays using sort() function
        Arrays.sort(array1);
        Arrays.sort(array2);

        int a = 0, b = 0, res = Integer.MAX_VALUE;

// Scanning both the arrays upto their sizes
        while(a < m && b < n) {
            if (Math.abs(array1[a] - array2[b]) < res) {
                res = Math.abs(array1[a] - array2[b]);
            }

// moving the smaller value
            if (array1[a] < array2[b]) {
                a++;
            }
            else {
                b++;
            }
        }

        System.out.println("Lowest Difference = " + res);
    }
}

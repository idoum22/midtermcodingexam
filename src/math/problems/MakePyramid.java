package math.problems;

public class MakePyramid {
    public static void main(String[] args) {

        // height of pyramid
        int n = 6;

        // code for making pyramid
        for (int i = 0; i < n; i++) {
            for (int j = n - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}

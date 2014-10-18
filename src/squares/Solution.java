package squares;

import java.util.Scanner;

/**
 * Solution for https://www.hackerrank.com/challenges/sherlock-and-squares
 *
 * @author Jingming Niu
 * @since  2014-10-18
 */
public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tests = scanner.nextInt();
        for (int i = 0; i < tests; i++) {
            long a = scanner.nextLong();
            long b = scanner.nextLong();

            boolean foundSquare = false;
            int count = 0;
            long j = a;
            while (j <= b) {
                long sqrt = (long)(Math.sqrt(j));
                if (!foundSquare && sqrt * sqrt == j) {
                    foundSquare = true;
                    j = j + 2 * sqrt + 1;
                    count++;
                } else if (foundSquare) {
                    count++;
                    j = j + 2 * sqrt + 1;
                } else {
                    j++;
                }
            }

            System.out.println(count);
        }
    }
}

package fillingjars;

import java.util.Scanner;

/**
 * Solution for https://www.hackerrank.com/challenges/filling-jars
 *
 * @author Jingming Niu
 * @since  2014-10-18
 */
public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long jars = scanner.nextInt();
        scanner.nextInt();

        long sum = 0;
        while (scanner.hasNextLong()) {
            sum += -1 * (scanner.nextLong() - scanner.nextLong() - 1) * scanner.nextLong();
        }

        System.out.println(sum / jars);
    }
}

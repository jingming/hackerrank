package halloweenparty;

import java.util.Scanner;

/**
 * Solution for https://www.hackerrank.com/challenges/halloween-party
 *
 * @author Jingming Niu
 * @since  2014-10-18
 */
public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        while (scanner.hasNextInt()) {
            long slices = scanner.nextInt();

            System.out.println((slices / 2) * (slices - slices / 2));
        }
    }
}

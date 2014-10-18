package loveletter;

import java.util.Scanner;

/**
 * Solution for https://www.hackerrank.com/challenges/the-love-letter-mystery
 *
 * @author Jingming Niu
 * @since  2014-10-18
 */
public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        while (scanner.hasNext()) {
            System.out.println(getWork(scanner.nextLine()));
        }
    }

    public static int getWork(String line) {
        if (line.length() <= 1) {
            return 0;
        }

        return Math.abs(line.charAt(0) - line.charAt(line.length() - 1)) + getWork(line.substring(1, line.length() - 1));
    }
}

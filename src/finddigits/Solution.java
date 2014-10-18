package finddigits;

import java.util.*;

/**
 * Solution for https://www.hackerrank.com/challenges/find-digits
 *
 * @author Jingming Niu
 * @since  2014-10-18
 */
public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        while (scanner.hasNextLong()) {
            int count = 0;
            long number = scanner.nextLong();
            String numberAsString = Long.toString(number);

            for (int i = 0; i < numberAsString.length(); i++) {
                int value = Character.getNumericValue(numberAsString.charAt(i));
                if (value != 0 && number % value == 0) {
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}

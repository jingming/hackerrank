package stones;

import java.io.*;
import java.util.*;

/**
 * Solution for https://www.hackerrank.com/challenges/manasa-and-stones
 *
 * @author Jingming Niu
 * @since  2014-10-18
 */
public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tests = scanner.nextInt();
        for (int i = 0; i < tests; i++) {
            int stones = scanner.nextInt();
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            List<Integer> values = new ArrayList<>();
            int lastValue = -1;
            for (int j = 0; j < stones; j++) {
                int possibleValue = (stones - j - 1) * a + (j) * b;
                if (lastValue != possibleValue) {
                    values.add(possibleValue);
                    lastValue = possibleValue;
                }
            }

            Collections.sort(values);
            for (Integer value : values) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}

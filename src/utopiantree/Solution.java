package utopiantree;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Solution for https://www.hackerrank.com/challenges/utopian-tree
 *
 * @author Jingming Niu
 * @since  2014-10-18
 */
public class Solution {

    private static Map<Integer, Integer> values = new HashMap<Integer, Integer>();

    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        key.nextLine(); // Kill first line

        while (key.hasNext()) {
            System.out.println(calculate(key.nextInt()));
        }
    }

    public static int calculate(int n) {
        if (values.containsKey(n)) {
            return values.get(n);
        }

        if (n == 0) {
            values.put(n, 1);
            return 1;
        }

        int value = n % 2 == 0 ? calculate(n - 1) + 1 : calculate(n - 1) * 2;
        values.put(n, value);

        return value;
    }
}

package isfibo;

import java.util.*;

/**
 * Solution for https://www.hackerrank.com/challenges/is-fibo0 
 *
 * @author Jingming Niu
 * @since  2014-10-18
 */
public class Solution {

    private static Map<Long, Long> fibo = new HashMap<Long, Long>();
    static {
        fibo.put(0L, 0L);
        fibo.put(1L, 1L);
    }

    private static long highestFibo = 1L;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        while (scanner.hasNextLong()) {
            long test = scanner.nextLong();
            computeFibo(test);

            if (!fibo.values().contains(test)) {
                System.out.println("IsNotFibo");
            } else {
                System.out.println("IsFibo");
            }
        }
    }

    private static void computeFibo(long max) {
        if (fibo.get(highestFibo) > max) {
            return;
        }

        while (fibo.get(highestFibo) < max) {
            fibo.put(highestFibo + 1L, fibo.get(highestFibo) + fibo.get(highestFibo - 1));
            highestFibo++;
        }
    }

}

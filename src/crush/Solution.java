package crush;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Solution for https://www.hackerrank.com/challenges/crush
 *
 * @author Jingming Niu
 * @since  2014-10-18
 */
public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long size = scanner.nextLong();

        Map<Long, Long> map = new HashMap<>();
        long operations = scanner.nextLong();

        for (long i = 0; i < operations; i++) {
            long start = scanner.nextLong();
            long end = scanner.nextLong();
            long value = scanner.nextLong();

            map.put(start, (map.containsKey(start) ? map.get(start) : 0) + value);
            map.put(end + 1, (map.containsKey(end + 1) ? map.get(end + 1) : 0) - value);
        }

        long max = 0;
        long value = 0;
        for (long i = 0; i < size; i++) {
            value += (map.containsKey(i + 1) ? map.get(i + 1) : 0);
            max = Math.max(max, value);
        }

        System.out.println(max);
    }
}

package eventree;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * Solution for https://www.hackerrank.com/challenges/even-tree
 *
 * @author Jingming Niu
 * @since  2014-11-30
 */
public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int nodes = scanner.nextInt();
        int edges = scanner.nextInt();

        Map<Integer, Set<Integer>> map = new HashMap<>();
        for (int i = 0; i < edges; i++) {

            int a = scanner.nextInt();
            int b = scanner.nextInt();

            if (!map.containsKey(b)) {
                map.put(b, new HashSet<>());
            }

            map.get(b).add(a);
        }

        int count = 0;
        Map<Integer, Integer> sizeMap = new HashMap<>();
        for (int node : map.keySet()) {

            int size = getSize(node, map, sizeMap);
            if (size != nodes && size % 2 == 0) {
                count++;
            }

        }

        System.out.println(count);

    }

    private static int getSize(int start, Map<Integer, Set<Integer>> map, Map<Integer, Integer> sizeMap) {

        if (sizeMap.containsKey(start)) {
            return sizeMap.get(start);
        }

        int count = 1;
        if (!map.containsKey(start) || map.get(start) == null) {
            sizeMap.put(start, count);
            return count;
        }

        for (int children : map.get(start)) {
            count += getSize(children, map, sizeMap);
        }

        sizeMap.put(start, count);
        return count;
    }


}

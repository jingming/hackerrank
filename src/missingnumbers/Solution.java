package missingnumbers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * Solution for https://www.hackerrank.com/challenges/missing-numbers
 *
 * @author Jingming Niu
 * @since  2014-10-20
 */
public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<Integer, Integer> aMap = populateMap(scanner);
        Map<Integer, Integer> bMap = populateMap(scanner);

        List<Integer> values = new ArrayList<>(bMap.keySet());
        Collections.sort(values);

        for (Integer value : values) {
            if (!aMap.containsKey(value) || !aMap.get(value).equals(bMap.get(value))) {
                System.out.print(value + " ");
            }
        }
        System.out.println();
    }

    public static Map<Integer, Integer> populateMap(Scanner scanner) {
        Map<Integer, Integer> map = new HashMap<>();

        int length = scanner.nextInt();
        for (int i = 0; i < length; i++) {

            int value = scanner.nextInt();
            if (map.containsKey(value)) {
                map.put(value, map.get(value) + 1);
            } else {
                map.put(value, 1);
            }
        }

        return map;
    }
}

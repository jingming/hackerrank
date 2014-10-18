package got;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Solution for https://www.hackerrank.com/challenges/game-of-thrones
 *
 * @author Jingming Niu
 * @since  2014-10-18
 */
public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String test = scanner.nextLine();

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < test.length(); i++) {

            if (map.containsKey(test.charAt(i))) {
                map.put(test.charAt(i), map.get(test.charAt(i)) + 1);
            } else {
                map.put(test.charAt(i), 1);
            }
        }


        boolean foundOdd = false;
        for (Integer count : map.values()) {
            if (count % 2 == 1) {
                if (foundOdd) {
                    System.out.println("NO");
                    return;
                }

                foundOdd = true;
            }
        }

        System.out.println("YES");
    }
}

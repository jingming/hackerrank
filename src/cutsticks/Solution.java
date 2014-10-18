package cutsticks;


import java.util.*;

/**
 * Solution for https://www.hackerrank.com/challenges/cut-the-sticks
 *
 * @author Jingming Niu
 * @since  2014-10-18
 */
public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numSticks = scanner.nextInt();

        Map<Integer, Integer> sticks = new HashMap<>();
        for (int i = 0; i < numSticks; i++) {
            int stick = scanner.nextInt();
            if (sticks.containsKey(stick)) {
                sticks.put(stick, sticks.get(stick) + 1);
            } else {
                sticks.put(stick, 1);
            }
        }

        List<Integer> stickLengths = new ArrayList<>(sticks.keySet());
        Collections.sort(stickLengths);

        System.out.println(numSticks);
        for (Integer stickLength : stickLengths) {
            numSticks -= sticks.get(stickLength);

            if (numSticks > 0) {
                System.out.println(numSticks);
            }
        }
    }
}

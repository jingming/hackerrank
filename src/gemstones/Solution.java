package gemstones;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Solution for https://www.hackerrank.com/challenges/gem-stones
 *
 * @author Jingming Niu
 * @since  2014-10-18
 */
public class Solution {

    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        key.nextLine(); // Kill the number line

        Set<Character> gems = new HashSet<Character>();
        String gem = key.nextLine();
        for (int i = 0; i < gem.length(); i++) {
            gems.add(gem.charAt(i));
        }

        Set<Character> temp = new HashSet<Character>();
        while (key.hasNext()) {
            String nextGem = key.nextLine();
            for (int j = 0; j < nextGem.length(); j++) {
                temp.add(nextGem.charAt(j));
            }

            gems.retainAll(temp);
            temp.clear();
        }

        System.out.println(gems.size());
    }
}

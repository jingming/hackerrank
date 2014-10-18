package panagram;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Solution for https://www.hackerrank.com/challenges/pangrams 
 *
 * @author Jingming Niu
 * @since  2014-10-18
 */
public class Solution {

    public static void main(String[] args) {

        Set<Character> set = new HashSet<>();
        String line = new Scanner(System.in).nextLine().toLowerCase();

        for (int i = 0; i < line.length(); i++) {
            if (Character.isLetter(line.charAt(i))) {
                set.add(line.charAt(i));
            }
        }

        if (set.size() == 26) {
            System.out.println("pangram");
        } else {
            System.out.println("not pangram");
        }
    }
}

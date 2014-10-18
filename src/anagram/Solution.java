package anagram;

import java.io.*;
import java.util.*;

/**
 * Solution for https://www.hackerrank.com/challenges/make-it-anagram
 *
 * @author Jingming Niu
 * @since  2014-10-18
 */
public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] string1 = scanner.nextLine().toCharArray();
        char[] string2 = scanner.nextLine().toCharArray();

        Arrays.sort(string1);
        Arrays.sort(string2);

        int i = 0;
        int j = 0;
        int count = 0;  // Total number of characters to be deleted
        while (i < string1.length && j < string2.length) {

            // Both strings contain the same character 
            // Move on to the next character
            if (string1[i] == string2[j]) {
                i++;
                j++;
                continue;
            }

            // Found a unmatching character
            // Move the pointer of the first string
            if (string1[i] < string2[j]) {
                i++;
                count++;
                continue;
            }

            // Found a unmatching character
            // Move the pointer of the second string
            if (string1[i] > string2[j]) {
                j++;
                count++;
                continue;
            }
        }

        // Add whatever is left on either string to the number of characters to be deleted
        count += string2.length - j + string1.length - i;
        System.out.println(count);
    }
}

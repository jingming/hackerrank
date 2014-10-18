package angrychildren;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


/**
 * Solution for https://www.hackerrank.com/challenges/angry-children
 *
 * @author Jingming Niu
 * @since  2014-10-18
 */
public class Solution {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws NumberFormatException, IOException {
        int numPackets = Integer.parseInt(in.readLine());
        int numKids = Integer.parseInt(in.readLine());
        int[] packets = new int[numPackets];

        for(int i = 0; i < numPackets; i ++) {
            packets[i] = Integer.parseInt(in.readLine());
        }

        Arrays.sort(packets);
        int unfairness = Integer.MAX_VALUE;

        for (int i = 0; i < numPackets - numKids; i++) {
            unfairness = Math.min(unfairness, packets[numKids - 1 + i] - packets[i]);
        }

        System.out.println(unfairness);
    }
}


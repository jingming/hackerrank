package cavitymap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Solution for https://www.hackerrank.com/challenges/cavity-map
 *
 * @author Jingming Niu
 * @since  2014-10-29
 */
public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        scanner.nextLine(); // Kill the line

        int[][] map = new int[size][size];
        char[][] outputMap = new char[size][size];
        for (int i = 0; i < size; i++) {

            String line = scanner.nextLine();
            for (int j = 0; j < size; j++) {

                map[i][j] = Integer.valueOf(line.charAt(j));
                outputMap[i][j] = line.charAt(j);

            }

        }

        List<Pair<Integer, Integer>> cavities = new ArrayList<>();
        for (int i = 1; i < size - 1; i++) {

            for (int j = 1; j < size - 1; j++) {

                int currentValue = map[i][j];
                if (map[i - 1][j] < currentValue && map[i + 1][j] < currentValue &&
                    map[i][j - 1] < currentValue && map[i][j + 1] < currentValue) {
                    cavities.add(new Pair<>(i, j));
                }

            }

        }

        for (Pair<Integer, Integer> cavity : cavities) {
            outputMap[cavity.getA()][cavity.getB()] = 'X';
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(outputMap[i][j]);
            }
            System.out.println();
        }

    }

    public static class Pair<A, B> {

        final A a;
        final B b;

        public Pair(A a, B b) {
            this.a = a;
            this.b = b;
        }

        public A getA() {
            return a;
        }

        public B getB() {
            return b;
        }

    }

}

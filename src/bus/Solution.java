package bus;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * Solution for https://www.hackerrank.com/challenges/bus-station
 *
 * @author Jingming Niu
 * @since  2014-10-20
 */
public class Solution {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        long min = Integer.MAX_VALUE;
        long sum = 0;

        List<Long> numbers = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            long value = scanner.nextLong();

            numbers.add(value);
            min = Math.min(min, value);
            sum += value;
        }

        List<Long> factors = getFactors(sum, min);
        Collections.sort(factors);

        Set<Long> falsePositives = checkFactors(factors, numbers);

        for (Long factor : factors) {
            if (!falsePositives.contains(factor)) {
                System.out.print(factor + " ");
            }
        }

        System.out.println();
    }

    public static Set<Long> checkFactors(List<Long> factors, List<Long> numbers) {
        Set<Long> falsePositives = new HashSet<>();
        for (Long factor : factors) {

            long occupants = 0;
            for (Long number : numbers) {
                occupants += number;

                if (occupants == factor) {
                    occupants = 0;
                }

                if (occupants > factor) {
                    falsePositives.add(factor);
                    break;
                }
            }
        }

        return falsePositives;
    }

    public static List<Long> getFactors(long number, long min) {
        List<Long> factors = new ArrayList<>();

        for (long i = 1; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {

                if (i >= min) {
                    factors.add(i);
                }

                if (number / i >= min && number / i != i) {
                    factors.add(number / i);
                }
            }
        }

        return factors;
    }
}

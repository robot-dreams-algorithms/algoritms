package L02.tasks;

import L02.common.TestRunnable;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.IntStream;

import static com.google.common.truth.Truth.assertThat;

/**
 * Вам дана матриця MxN цілих чисел - accounts. Де accounts[i][j] зберігає
 * кількість грошей які ith клієнт має на jth рахунку.
 * Поверніть стан найбагатшого клієнта.
 *
 * Стан клієнта це сума всіх його коштів на всіх рахунках.
 *
 * Приклад:
 * Input: accounts = [[1,5],[7,3],[3,5]]
 * Output: 10
 */
public class T02 implements TestRunnable {

    private int solve(int[][] accounts) {
        return -1;
    }

    public boolean isReady() {
        // SET TO TRUE TO ENABLE TESTS
        return false;
    }

    @Override
    public String toString() {
        return "02 Richest customer";
    }

    @Override
    public void runTest() {
        Map<int[][], Integer> testCases = Map.of(
                new int[][] { { 1, 2, 3 }, { 3, 2, 1 } }, 6,
                new int[][] { { 1, 5 }, { 7, 3 }, { 3, 5 } }, 10,
                new int[][] { { 2, 8, 7 }, { 7, 1, 3 }, { 1, 9, 5 } }, 17,
                new int[][] { { 2, 6, 7 }, { 7, 1, 3 }, { 1, 9, 5 } }, 15,
                new int[][] { { 8 }, { 1, 2, 3 }, { 10, -1 } }, 9);

        testCases.forEach((input, expected) -> assertThat(this.solve(input)).isEqualTo(expected));
    }
}

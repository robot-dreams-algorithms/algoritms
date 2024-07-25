package L02.tasks;

import L02.common.TestRunnable;

import java.util.Map;

import static com.google.common.truth.Truth.assertThat;

/**
 * Вам дано масив цілих чисел nums.
 * Поверніть мінімальну кількість операцій необхідних для того, щоб зробити nums
 * строго зростаючим.
 *
 * Одна операція – це збільшення будь-якого елемента в масиві на 1.
 *
 * Масив nums буде строго зростаючим якщо
 * nums[i] < nums[i+1] для всіх 0 <= i < nums.length - 1
 * Масив з одним елементом вважається строго зростаючим.
 *
 * Приклад:
 * Input: nums = [1,1,1]
 * Output: 3
 *
 * Пояснення: строго зростаючим буде масив [1,2,3], тому необхідно збільшити
 * nums[1] рівно 1 раз, а nums[2] 2 разу.
 */
public class T03 implements TestRunnable {

    private int solve(int[] nums) {
        return -1;
    }

    public boolean isReady() {
        // SET TO TRUE TO ENABLE TESTS
        return false;
    }

    @Override
    public String toString() {
        return "03 Min number of changes to make array increasing";
    }

    @Override
    public void runTest() {
        Map<int[], Integer> testCases = Map.of(
                new int[] { 1, 1, 1 }, 3,
                new int[] { 1, 2, 1 }, 2,
                new int[] { -3 }, 0,
                new int[] { -3, -2, 10 }, 0,
                new int[] { -3, -2, -5 }, 4,
                new int[] { 1, 5, 90, 0 }, 91,
                new int[] { 1, 0, 5, 4, 90, 0 }, 95);

        testCases.forEach((input, expected) -> assertThat(this.solve(input)).isEqualTo(expected));
    }
}

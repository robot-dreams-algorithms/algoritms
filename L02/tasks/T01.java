package L02.tasks;

import L02.common.TestRunnable;

import java.util.Map;

import static com.google.common.truth.Truth.assertThat;

/**
 * Даний масив чисел nums.
 * Running sum для елемента 'i' заданий як сума елементів [0..i], тобто
 * runningSum[i] = nums[0] + nums[1] + .. + nums[i]
 * Обчисліть та поверніть масив running sum.
 * 
 * Додаткові умови:
 * 1. Не змінюйте вхідний масив
 * 2. Старайтеся використати O(1) додаткової пам'яті (без урахування вихідного масиву)
 * 
 * Приклад:
 * Input: nums = [1, 2, 3]
 * Output: [1, 3, 6], бо [1, 1+2, 1+2+3]
 */
public class T01 implements TestRunnable {

    private int[] solve(int[] nums) {
      
        return new int[] {-1};
    }

    public boolean isReady() {
        // SET TO TRUE TO ENABLE TESTS
        return false;
    }

    @Override
    public String toString() {
        return "01 Running sum";
    }

    @Override
    public void runTest() {
        Map<int[], int[]> testCases = Map.of(
                new int[] { 1, 2, 3, 4, 5 }, new int[] { 1, 3, 6, 10, 15 },
                new int[] { 1, 2, 3, 4, 6 }, new int[] { 1, 3, 6, 10, 16 },
                new int[] { 1, 1, 1, 1 }, new int[] { 1, 2, 3, 4 },
                new int[] { 1, 2, -3, 4, 6 }, new int[] { 1, 3, 0, 4, 10 },
                new int[] { -1, -1, -2, 4, 0 }, new int[] { -1, -2, -4, 0, 0 });
        testCases.forEach((input, expected) -> assertThat(this.solve(input)).isEqualTo(expected));
    }
}

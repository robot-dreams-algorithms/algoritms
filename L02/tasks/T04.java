package L02.tasks;

import L02.common.TestRunnable;

import java.util.Map;

import static com.google.common.truth.Truth.assertThat;

/**
 * Вам дана матриця MxN. Поверніть true якщо це Toeplitz матриця. Інакше
 * поверніть false.
 * 
 * Toeplitz матриця -- це матриця в якій кожна діагональ
 * (з верхнього лівого елемента до нижнього правого елемента) має однакові
 * значення.
 * 
 * Приклад Toeplitz матриці:
 * 1,2,3,4
 * 5,1,2,3
 * 9,5,1,2
 * Діагоналями є: "[9]", "[5, 5]", "[1, 1, 1]", "[2, 2, 2]", "[3, 3]", "[4] ".
 */
public class T04 implements TestRunnable {

    private boolean solve(int[][] matrix) {
        return false;
    }

    public boolean isReady() {
        // SET TO TRUE TO ENABLE TESTS
        return false;
    }

    @Override
    public String toString() {
        return "04 Is Toeplitz matrix";
    }

    @Override
    public void runTest() {
        Map<int[][], Boolean> testCases = Map.of(
                new int[][] { { 1, 2, 3, 4 }, { 5, 1, 2, 3 }, { 9, 5, 1, 2 } }, true,
                new int[][] { { 1, 2, 3, 4 }, { 5, 1, 3, 3 }, { 9, 5, 1, 2 } }, false,
                new int[][] { { 1, 2 }, { 1, 2 } }, false,
                new int[][] { { 1 } }, true,
                new int[][] { { 1, 1, 1, 11 }, { 1, 1, 1, 1 }, { 10, 1, 1, 1 } }, true);

        testCases.forEach((input, expected) -> assertThat(this.solve(input)).isEqualTo(expected));
    }
}

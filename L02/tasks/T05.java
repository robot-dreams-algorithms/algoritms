package L02.tasks;

import L02.common.TestRunnable;

import java.util.Map;

import static com.google.common.truth.Truth.assertThat;

/**
 * Вам дано список (масив) слів words, та два слова word1, word2.
 * Порахуйте найкоротшу дистанцію між цими двома словами в масиві.
 * 
 * word1 і word2 не збігаються і обидва присутні в масиві.
 * 
 * Приклад:
 * Input: words = ["practice", "makes", "perfect", "coding", "makes"], 
 * word1 = "coding", word2 = "practice"
 * Output: 3
 */
public class T05 implements TestRunnable {

    private int solve(String[] words, String word1, String word2) {
        return -1;
    }

    public boolean isReady() {
        // SET TO TRUE TO ENABLE TESTS
        return false;
    }

    @Override
    public String toString() {
        return "05 Shortest word distance";
    }

    @Override
    public void runTest() {
        Map<Object[], Integer> testCases = Map.of(
                new Object[] { new String[] { "practice", "makes", "perfect", "coding", "makes" }, "coding",
                        "practice" },
                3,
                new Object[] { new String[] { "practice", "makes", "perfect", "coding", "makes" }, "makes", "coding" },
                1,
                new Object[] { new String[] { "coding", "practice", "makes", "perfect", "coding", "makes" }, "makes",
                        "coding" },
                1,
                new Object[] { new String[] { "a", "b", "c", "d", "b", "q" }, "a", "q" }, 5);

        testCases.forEach(
                (input, expected) -> assertThat(this.solve((String[]) input[0], (String) input[1], (String) input[2]))
                        .isEqualTo(expected));
    }
}

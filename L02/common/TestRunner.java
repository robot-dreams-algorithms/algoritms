package L02.common;

import java.util.List;

public class TestRunner {
    public static void run(TestRunnable... tasks) {
        for (TestRunnable task : tasks) {
            System.out.println("➡ Executing: " + task.toString());
            if (!task.isReady()) {
                System.out.println("◁ Run skipped");
            } else {
                task.runTest();
                System.out.println("✅ Tests passed! Great job!");
            }
        }
    }
}

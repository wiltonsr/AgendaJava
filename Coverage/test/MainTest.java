

import coverage.Main;
import junit.framework.TestCase;

public class MainTest extends TestCase {

    public MainTest(String testName) {
        super(testName);
    }

    public void testOne() {
        Main m = new Main();
        m.testMethod();
    }
}
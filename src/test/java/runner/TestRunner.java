package runner;


import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.ExampleTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({ExampleTest.class})
public class TestRunner {

    @BeforeClass
    public static void setup() {
        System.out.println("Setting");
    }
}

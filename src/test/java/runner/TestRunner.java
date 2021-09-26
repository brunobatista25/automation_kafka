package runner;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.KafkaTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({KafkaTest.class})
public class TestRunner {

}

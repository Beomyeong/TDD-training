import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.*;

public class mainTest {
    @BeforeAll
    static void initAll(){

    }
    @BeforeEach
    void init(){

    }
    @Test
    void succeedingTest(){

    }
    @Test
    void failingTest()
    {
        fail("a failing test" );
    }
    @Test
    @Disabled("for demonstration purpose")
    void skippedTest(){
        // not executed
    }
    @Test
    void abortedTest() {
        assumeTrue("abc".contains("Z"));
        fail("Test should have been aborted");
    }
    @AfterEach
    void tearDown(){

    }
    @AfterAll
    static void tearDownAll(){

    }
    @Test
    public void testMultiplication()
    {
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10,five.amount);
    }


}

import static org.junit.Assert.*;
import java.io.*;
import org.junit.*;
public class Tests{
    private final InputStream systemIn = System.in;
    private final PrintStream systemOut = System.out;

    private ByteArrayInputStream testIn;
    private ByteArrayOutputStream testOut;

    @Before
    public void setUpOutput() {
        testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));
    }

    private void provideInput(String data) {
        testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }

    private String getOutput() {
        return testOut.toString();
    }

    @After
    public void restoreSystemInputOutput() {
        System.setIn(systemIn);
        System.setOut(systemOut);
    }


    @Test
    public void test(){
        final String testInputString = "5\n1 2 3 4 5";
        final String testOutputString="no\r\n";
        provideInput(testInputString);

        Main.main(new String[0]);

        assertEquals(testOutputString, getOutput());
    }
    @Test
    public void test2(){
        final String testInputString = "5\n1 2 4 3 5";
        final String testOutputString="yes\r\n";
        provideInput(testInputString);

        Main.main(new String[0]);

        assertEquals(testOutputString, getOutput());
    }


}
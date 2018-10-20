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
        final String testInputString = "4\n0 3\n2 5\n4 2\n4 0";
        final String testOutputString="6";
        provideInput(testInputString);

        Main.main(new String[0]);

        assertEquals(testOutputString, getOutput());
    }



}
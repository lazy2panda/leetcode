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
        final String testInputString = "3\n" +
                "61 62 100 120\n" +
                "80 80 120 100\n" +
                "55 90 130 130";
        final String testOutputString="Zifei\r\n" +
                "Gongfei\r\n" +
                "Fail\r\n";
        provideInput(testInputString);

        Main.main(new String[0]);

        assertEquals(testOutputString, getOutput());
    }



}
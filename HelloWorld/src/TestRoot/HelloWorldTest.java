package TestRoot;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloWorldTest
{
    @Test
    public void HelloWorld()
    {
        //arranges
        String expect = "Hello World";
        String result = "Hello World";

        assertEquals(expect,result);
    }
}
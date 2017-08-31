package TestRoot;
import com.company.Main;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NameResponseTest {
    @Test
    public void NameResponse()
    {
        //arrange
        String input = "David";
        String expect =  "Hi, David. How are you?";

        //act
        String result = Main.NameResponse(input);

        //assert
        assertEquals(expect, result);

    }
}
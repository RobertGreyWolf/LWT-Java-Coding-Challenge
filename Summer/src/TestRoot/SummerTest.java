package TestRoot;
import com.company.Main;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SummerTest {
    @Test
    public void Summer()
    {
        //arrange
        int input =5;
        int expect =15;

        //act
        int result = Main.Summer(input);

        //assert
        assertEquals(expect,result);

    }

}
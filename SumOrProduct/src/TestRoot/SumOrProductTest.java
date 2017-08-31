package TestRoot;
import com.company.Main;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class SumOrProductTest {
    @Test
    public void SumOrProduct1()
    {
        //arrange
        int input =5;
        int mode = 1;
        int expect =15;

        //act
        int result = Main.SumOrProduct(input,mode);

        //assert
        assertEquals(expect,result);
    }
    @Test
    public void SumOrProduct2()
    {
        //arrange
        int input =5;
        int mode = 2;
        int expect =120;

        //act
        int result = Main.SumOrProduct(input,mode);

        //assert
        assertEquals(expect,result);
    }
}
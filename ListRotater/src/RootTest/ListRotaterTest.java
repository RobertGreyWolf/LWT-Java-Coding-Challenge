package RootTest;
import com.company.Main;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class ListRotaterTest {
    @Test
    public void ListRotater()
    {
        //arrange
        ArrayList<Integer> InputList=new ArrayList<Integer>();
        InputList.add(1);
        InputList.add(2);
        InputList.add(3);
        InputList.add(4);
        InputList.add(5);
        ArrayList<Integer> ExpectedList=new ArrayList<Integer>();
        ExpectedList.add(4);
        ExpectedList.add(5);
        ExpectedList.add(1);
        ExpectedList.add(2);
        ExpectedList.add(3);
        int inputRotation = 3;

        //act
        ArrayList<Integer> result = Main.ListRotater(InputList, inputRotation);

        //Assert
        assertEquals(ExpectedList, result);

    }
}
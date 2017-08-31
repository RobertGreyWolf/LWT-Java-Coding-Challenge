package RootTest;
import com.company.Main;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ListCombinerTest {
    @Test
    public void CombinerTest()
    {
        //arrange
        ArrayList<Integer> InputList1=new ArrayList<Integer>();
        InputList1.add(2);
        InputList1.add(4);
        InputList1.add(6);
        InputList1.add(8);
        ArrayList<Integer> InputList2=new ArrayList<Integer>();
        InputList2.add(1);
        InputList2.add(3);
        InputList2.add(5);
        InputList2.add(7);
        ArrayList<Integer> ExpectedList=new ArrayList<Integer>();
        ExpectedList.add(1);
        ExpectedList.add(2);
        ExpectedList.add(3);
        ExpectedList.add(4);
        ExpectedList.add(5);
        ExpectedList.add(6);
        ExpectedList.add(7);
        ExpectedList.add(8);


        //act
        ArrayList<Integer> result = Main.ListCombiner(InputList1,InputList2);

        //Assert
        assertEquals(ExpectedList,result);
    }
}
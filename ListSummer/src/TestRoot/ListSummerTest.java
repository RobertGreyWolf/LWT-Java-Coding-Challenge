package TestRoot;
import com.company.Main;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListSummerTest {
    @Test
    public void ForList()
    {
        //arrange
        ArrayList<Integer> InputList=new ArrayList<Integer>();
        InputList.add(1);
        InputList.add(2);
        InputList.add(3);
        InputList.add(4);
        InputList.add(5);
        int expect = 15;

        //act 1
        int result = Main.ForLoop(InputList);

        //Assert 1
        assertEquals(expect,result);
    }

    @Test
    public void WhileList()
    {
        //arrange
        ArrayList<Integer> InputList=new ArrayList<Integer>();
        InputList.add(1);
        InputList.add(2);
        InputList.add(3);
        InputList.add(4);
        InputList.add(5);
        int expect = 15;

        //act 1
        int result = Main.WhileLoop(InputList);

        //Assert 1
        assertEquals(expect,result);
    }

    @Test
    public void RecursionList()
    {
        //arrange
        ArrayList<Integer> InputList=new ArrayList<Integer>();
        InputList.add(1);
        InputList.add(2);
        InputList.add(3);
        InputList.add(4);
        InputList.add(5);
        int expect = 15;

        //act 1
        int result = Main.Recursion(InputList,0);

        //Assert 1
        assertEquals(expect,result);
    }
}
package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args)
    {
        Scanner user_input = new Scanner( System.in );
        boolean end = false;
        ArrayList<Integer> NumList=new ArrayList<Integer>();
        String x;
        while(!end)
        {
            System.out.print("Please enter the numbers that will populate the list. Please press enter between every number. Enter 'end' to finish the list ");
            x = user_input.next( );
            if(x.equals("end"))
            {
                end = true;
            }
            else
            {
               NumList.add(Integer.parseInt(x));
            }
        }
        System.out.print("The List that has been entered is (" );
        for(int i=0;i<NumList.size();i++)
        {
            if(i!=NumList.size()-1)
            {
                System.out.print(NumList.get(i) + ", ");
            }
            else
            {
                System.out.print(NumList.get(i) + ")\n");
            }
        }

        System.out.println("The ForLoop says the sum is "+ForLoop(NumList));
        System.out.println("The WhileLoop say the sum is "+WhileLoop(NumList));
        System.out.println("The Recursion function says the sum is "+Recursion(NumList,0));
    }

    public static int ForLoop(ArrayList<Integer> NumList)
    {
        int sum = 0;
        for(int x = 0; x < NumList.size(); x++)
        {
            sum += NumList.get(x);
        }
        return sum;
    }
    public static int WhileLoop(ArrayList<Integer> NumList)
    {
        int sum = 0;
        int x = 0;
        while(x < NumList.size())
        {
            sum += NumList.get(x);
            x++;
        }
        return sum;

    }
    public static int Recursion(ArrayList<Integer> NumList, int sum)
    {
        if(NumList.size() != 0)
        {
            sum += NumList.get(0);
            NumList.remove(0);
            sum = Recursion(NumList, sum);
        }
        return sum;
    }

}

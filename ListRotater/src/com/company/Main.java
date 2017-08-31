package com.company;

import java.util.ArrayList;
import java.util.Scanner;

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
        int k;
        System.out.print("How much do you want this list to rotate\n");
        k = Integer.parseInt(user_input.next( ));
        NumList = ListRotater(NumList,k);
        for(int i=0;i<NumList.size();i++)
        {
            System.out.println(NumList.get(i));
        }
        System.out.print("The new list after rotation is (" );
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
    }

    public static ArrayList<Integer> ListRotater(ArrayList<Integer> NumList, int k)
    {
        while (k > 0 )
        {
            int temp = NumList.get(NumList.size()-1);
            NumList.set(NumList.size()-1, NumList.get(0));
            for(int x = 1; x < NumList.size()-1; x++)
            {
                NumList.set(x-1,NumList.get(x));
            }
            NumList.set(NumList.size()-2,temp);
            k--;
        }
        return NumList;
    }
}

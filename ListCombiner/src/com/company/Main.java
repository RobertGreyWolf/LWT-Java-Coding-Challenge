package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {

        Scanner user_input = new Scanner( System.in );
        boolean end = false;
        ArrayList<Integer> NumList1=new ArrayList<Integer>();
        String x;
        while(!end)
        {
            System.out.print("Please enter the numbers that will populate the first list. Please press enter between every number. Enter 'end' to finish the list ");
            x = user_input.next( );
            if(x.equals("end"))
            {
                end = true;
            }
            else
            {
                NumList1.add(Integer.parseInt(x));
            }
        }
        System.out.print("The first list that has been entered is (" );
        for(int i=0;i<NumList1.size();i++)
        {
            if(i!=NumList1.size()-1)
            {
                System.out.print(NumList1.get(i) + ", ");
            }
            else
            {
                System.out.print(NumList1.get(i) + ")\n");
            }
        }

        end = false;
        ArrayList<Integer> NumList2=new ArrayList<Integer>();
        while(!end)
        {
            System.out.print("Please enter the numbers that will populate the second list. Please press enter between every number. Enter 'end' to finish the list ");
            x = user_input.next( );
            if(x.equals("end"))
            {
                end = true;
            }
            else
            {
                NumList2.add(Integer.parseInt(x));
            }
        }
        System.out.print("The second list that has been entered is (" );
        for(int i=0;i<NumList2.size();i++)
        {
            if(i!=NumList2.size()-1)
            {
                System.out.print(NumList2.get(i) + ", ");
            }
            else
            {
                System.out.print(NumList2.get(i) + ")\n");
            }
        }

        ArrayList<Integer> CombineList = ListCombiner(NumList1,NumList2);
        System.out.print("These two list combined are (" );
        for(int i=0;i<CombineList.size();i++)
        {
            if(i!=CombineList.size()-1)
            {
                System.out.print(CombineList.get(i) + ", ");
            }
            else
            {
                System.out.print(CombineList.get(i) + ")\n");
            }
        }

    }

    public static ArrayList<Integer> ListCombiner(ArrayList<Integer> NumList1, ArrayList<Integer>NumList2)
    {
        ArrayList<Integer> CombineList=new ArrayList<Integer>();
        int x = 0;
        int y = 0;
        while(x < NumList1.size() || y < NumList2.size())
        {

            if(x == NumList1.size())
            {
                CombineList.add(NumList2.get(y));
                y++;
            }
            else if(y == NumList2.size())
            {
                CombineList.add(NumList1.get(x));
                x++;
            }
            else
            {
                if(NumList1.get(x)>NumList2.get(y))
                {
                    CombineList.add(NumList2.get(y));
                    y++;
                }
                else if(NumList1.get(x)<NumList2.get(y))
                {
                    CombineList.add(NumList1.get(x));
                    x++;
                }
                else {
                    CombineList.add(NumList1.get(x));
                    x++;
                    y++;
                }

            }
        }

        return CombineList;
    }

}

package com.company;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner user_input = new Scanner( System.in );
        int x;
        System.out.print("Please enter a number: ");
        x = Integer.parseInt(user_input.next());
        int flag;
        System.out.print("Please enter 1 if you want to sum this number and enter 2 if you want to product this number: ");
        flag = Integer.parseInt(user_input.next());
        int sum = SumOrProduct(x,flag);
        System.out.println("The factorial sum of this number is "+sum);
    }


    public static int SumOrProduct(int x, int flag)
    {
        int sum=0;
        if(flag == 2)
        {
            sum = 1;
        }

        while (x > 0)
        {
            if(flag == 1)
            {
                sum += x;
            }
            else if(flag == 2)
            {
                sum *= x;
            }
            x--;
        }
        return sum;
    }
}



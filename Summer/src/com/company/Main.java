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
        x = Summer(x);
        System.out.println("The factorial sum of this number is "+x);
    }

    public static int Summer(int x)
    {
        int sum=0;
        while (x > 0)
        {
            sum += x;
            x--;
        }
       return sum;
    }

}

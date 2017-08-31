package com.company;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner user_input = new Scanner( System.in );
        String first_name;
        System.out.print("Please enter your name: ");
        first_name = user_input.next( );
        System.out.println(NameResponse(first_name));
    }

    public static String NameResponse(String name)
    {
       return("Hi, " + name + ". How are you?");
    }
}

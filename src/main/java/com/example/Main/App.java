/*
 *  UCF COP3330 Fall 2021 Assignment 7 Solution
 *  Copyright 2021 Andrew Hicks
 */


package com.example.Main;
import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.print( "What is the length of the room in feet? " );
        int length = input.nextInt();
        System.out.print("What is the width of the room in feet? ");
        int width = input.nextInt();
        System.out.println("You entered dimensions of " + length + " feet by " + width + " feet.");
        System.out.println("The area is");
        int area = length * width;
        double areas = area * 0.09290304;
        System.out.println(area + " square feet");
        System.out.println(areas + " square meters");
    }
}

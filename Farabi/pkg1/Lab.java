package pkg1;

import java.util.*;
import java.io.*;
import java.util.*;
import java.util.Calendar;

public class Lab
{
    public String facility;
    public int lab_cost;
    public void new_faci()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("facility:-");
        facility = input.nextLine();
        System.out.print("cost:-");
        lab_cost = input.nextInt();

    }
    public void faci_list()
    {
        System.out.println(facility + "\t\t" + lab_cost);
    }
}
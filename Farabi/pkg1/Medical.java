package pkg1;

import java.io.*;
import java.util.*;
import java.util.Calendar;

public class Medical
{
    public String med_name;
    public String med_comp;
    public String exp_date;
    public int med_cost;
    public int count;
    public void new_medi()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("name:-");
        med_name = input.nextLine();
        System.out.print("comp:-");
        med_comp = input.nextLine();
        System.out.print("exp_date:-");
        exp_date = input.nextLine();
        System.out.print("cost:-");
        med_cost = input.nextInt();
        System.out.print("no of unit:-");
        count = input.nextInt();
    }
    public void find_medi()
    {
        System.out.println(med_name + "  \t" + med_comp + "    \t" + exp_date + "     \t" + med_cost);
    }
}
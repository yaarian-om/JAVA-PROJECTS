package pkg1;

import java.io.*;
import java.util.*;
import java.util.Calendar;

public class Facility 
{
    public int no_of_fac;
    public int fac_no;
    public String fac_name;
    public int fac_contact;
    public int fac_cost;
    public void add_faci()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("numberOfFacility:-");
        no_of_fac = input.nextInt();
        System.out.print("serialNumber:-");
        fac_no = input.nextInt();
        System.out.print("facility:-");
        fac_name = input.nextLine();
        System.out.print("contact:-");
        fac_contact = input.nextInt();
        System.out.print("cost:-");
        fac_cost = input.nextInt();
    }
    public void show_faci()
    {
        System.out.println(no_of_fac + "\t\t" + fac_no + "\t\t" + fac_name + "\t\t" + fac_contact + "\t\t" + fac_cost);
    }
}
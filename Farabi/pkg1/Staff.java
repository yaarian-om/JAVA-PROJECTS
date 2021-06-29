package pkg1;

import java.io.*;
import java.util.*;
import java.util.Calendar;

public class Staff
{
    public String sid;
    public String sname;  //
    public String  desg; 
    public String  sex;
    public int salary;
    public void new_staff()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("id:-");
        sid = input.nextLine();
        System.out.print("name:-");
        sname = input.nextLine();
        System.out.print("desigination:-");
        desg = input.nextLine();
        System.out.print("sex:-");
        sex = input.nextLine();
        System.out.print("salary:-");
        salary = input.nextInt();
    }
   public void staff_info()
    {
        System.out.println(sid + "\t" + sname + "\t" + sex + "\t" + salary);
    }
}
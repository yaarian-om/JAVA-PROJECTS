package pkg1;

import java.io.*;
import java.util.*;
import java.util.Calendar;

public class Patient implements IPerson
{
    public String pid;  
    private String pname; //
    public String disease; 
    public String sex; 
    public String admit_status;
    public int age;
    public void new_patient()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("id:-");
        pid = input.nextLine();
        System.out.print("name:-");
        pname = input.nextLine();
        System.out.print("disease:-");
        disease = input.nextLine();
        System.out.print("sex:-");
        sex = input.nextLine();
        System.out.print("admit_status:-");
        admit_status = input.nextLine();
        System.out.print("age:-");
        age = input.nextInt();
    }
    public void patient_info()
    {
        System.out.println(pid + "\t" + pname + " \t" + disease + "     \t" + sex + "      \t" + admit_status + "\t" + age);
    }


    public void setName(String name) {
        pname = name;
    }

    @Override
    public String getName() {
        return pname;
    }
}
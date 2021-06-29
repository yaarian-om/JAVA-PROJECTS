
import java.io.*;
import java.util.*;
import java.util.Calendar;

import pkg1.*;


public class HospitalManagement extends Utility // Inheritance
{
    public static void main(String args[])
    {

        Utility.greetings();
        int count1 = 4, count2 = 4, count3 = 4, count4 = 4, count5 = 4, count6 = 4;


        Doctor[] d = new Doctor[25];
        Patient[] p = new Patient[100];
        Lab[] l = new Lab[20];
        Facility[] f = new Facility[20];
        Medical[] m = new Medical[100];
        Staff[] s = new Staff[100];

        int i;
        for (i = 0; i < 25; i++)
            d[i] = new Doctor();
        for (i = 0; i < 100; i++)
            p[i] = new Patient();
        for (i = 0; i < 20; i++)
            l[i] = new Lab();
        for (i = 0; i < 20; i++)
            f[i] = new Facility();
        for (i = 0; i < 100; i++)
            m[i] = new Medical();
        for (i = 0; i < 100; i++)
            s[i] = new Staff();

        d[0].setDid("21");
        d[0].setName("Dr.Shirin Sharmim");
        d[0].setSpecilist("ENT");
        d[0].setAppoint("5-11AM");
        d[0].setDoc_qual("MBBS,MD");
        d[0].setDroom(20);
        d[1].setDid("32");
        d[1].setName("Dr.Reza Ul Karim");
        d[1].setSpecilist("Physician");
        d[1].setAppoint("10-3AM");
        d[1].setDoc_qual("MBBS,MD");
        d[1].setDroom(25);
        d[2].setDid("17");
        d[2].setName("Dr.Jahangir Alam");
        d[2].setSpecilist("Surgeon");
        d[2].setAppoint("8-2AM");
        d[2].setDoc_qual("BDM");
        d[2].setDroom(3);
        d[3].setDid("33");
        d[3].setName("Dr.Nurul Alam");
        d[3].setSpecilist("Artho");
        d[3].setAppoint("10-4PM");
        d[3].setDoc_qual("MBBS,MS");
        d[3].setDroom(10);

        p[0].pid = "12";
        p[0].setName("Khdija Begum");
        p[0].disease = "Cancer";
        p[0].sex = "Female";
        p[0].admit_status = "y";
        p[0].age = 25;
        p[1].pid = "13";
        p[1].setName("Rifat Hossain");
        p[1].disease = "Cold";
        p[1].sex = "Male";
        p[1].admit_status = "y";
        p[1].age = 21;
        p[2].pid = "14";
        p[2].setName("Minto Das");
        p[2].disease = "Maleriya";
        p[2].sex = "Male";
        p[2].admit_status = "y";
        p[2].age = 36;
        p[3].pid = "15";
        p[3].setName("Shariful Islam");
        p[3].disease = "Diabetes";
        p[3].sex = "Male";
        p[3].admit_status = "y";
        p[3].age = 23;

        m[0].med_name = "Corex";
        m[0].med_comp = "Cino pvt";
        m[0].exp_date = "9-5-21";
        m[0].med_cost = 55;
        m[0].count = 8;
        m[1].med_name = "Nytra";
        m[1].med_comp = "Ace pvt";
        m[1].exp_date = "4-6-21";
        m[1].med_cost = 500;
        m[1].count = 5;
        m[2].med_name = "Brufa";
        m[2].med_comp = "Reckitt";
        m[2].exp_date = "21-7-21";
        m[2].med_cost = 50;
        m[2].count = 56;
        m[3].med_name = "Pride";
        m[3].med_comp = "DDF pvt";
        m[3].exp_date = "10-6-21";
        m[3].med_cost = 1100;
        m[3].count = 100;

        l[0].facility = "X-ray     ";
        l[0].lab_cost = 800;
        l[1].facility = "CT Scan   ";
        l[1].lab_cost = 1200;
        l[2].facility = "OR Scan   ";
        l[2].lab_cost = 500;
        l[3].facility = "Blood Bank";
        l[3].lab_cost = 50;

        f[0].no_of_fac = 4;
        f[0].fac_no = 1;
        f[0].fac_name = "Ambulance";
        f[0].fac_contact = 101;
        f[0].fac_cost = 1000;
        f[1].no_of_fac = 20;
        f[1].fac_no = 2;
        f[1].fac_name = "Admit Facility ";
        f[1].fac_contact = 100;
        f[1].fac_cost = 2000;
        f[2].no_of_fac = 1;
        f[2].fac_no = 3;
        f[2].fac_name = "Canteen";
        f[2].fac_contact = 102;
        f[2].fac_cost = 50;
        f[3].no_of_fac = 5;
        f[3].fac_no = 4;
        f[3].fac_name = "Emergency";
        f[3].fac_contact = 103;
        f[3].fac_cost = 500;

        s[0].sid = "22";
        s[0].sname = "Sarwar Hossain";
        s[0].desg = "Worker";
        s[0].sex = "Male";
        s[0].salary = 5000;
        s[1].sid = "23";
        s[1].sname = "Farah Ahmed";
        s[1].desg = "Nurse";
        s[1].sex = "Female";
        s[1].salary = 2000;
        s[2].sid = "24";
        s[2].sname = "Morshed Hossain";
        s[2].desg = "Worker";
        s[2].sex = "Male";
        s[2].salary = 5000;
        s[3].sid = "25";
        s[3].sname = "Mainul Haque";
        s[3].desg = "Security";
        s[3].sex = "Male";
        s[3].salary = 20000;

        Scanner input = new Scanner(System.in);
        int choice, j, c1, status = 1, s1 = 1, s2 = 1, s3 = 1, s4 = 1, s5 = 1, s6 = 1;
        while (status == 1)
        {
            System.out.println("\n                                    MAIN MENU");
            System.out.println("-----------------------------------------------------------------------------------");
            System.out.println("1.Doctos  2. Patients  3. Medicines  4. Labratory  5. Facility  6. Staff ");
            System.out.println("-----------------------------------------------------------------------------------");
            choice = input.nextInt();
            switch (choice)
            {
                case 1:
                    {
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("                             **DOCTOR SECTION**");
                        System.out.println("--------------------------------------------------------------------------------");
                        s1 = 1;
                        while (s1 == 1)
                        {
                            System.out.println("1.Add New Entry\n2.Existing Doctors List");
                            c1 = input.nextInt();
                            switch (c1)
                            {
                                case 1:
                                    {
                                        d[count1].new_doctor();count1++;
                                        break;
                                    }
                                case 2:
                                    {
                                        System.out.println("--------------------------------------------------------------------------------");
                                        System.out.println("id \t Name\t Specilist \t Timing \t Qualification \t Room No.");
                                        System.out.println("--------------------------------------------------------------------------------");
                                        for (j = 0; j < count1; j++)
                                        {
                                            d[j].doctor_info();
                                        }
                                        break;
                                    }
                            }
                            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                            s1 = input.nextInt();
                        }
                        break;
                    }
                case 2:
                    {
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("                          **PATIENT SECTION**");
                        System.out.println("--------------------------------------------------------------------------------");
                        s2 = 1;
                        while (s2 == 1)
                        {
                            System.out.println("1.Add New Entry\n2.Existing Patients List");
                            c1 = input.nextInt();
                            switch (c1)
                            {
                                case 1:
                                    {
                                        p[count2].new_patient();count2++;
                                        break;
                                    }
                                case 2:
                                    {
                                        System.out.println("--------------------------------------------------------------------------------");
                                        System.out.println("id \t Name \t Disease \t Gender \t Admit Status \t Age");
                                        System.out.println("--------------------------------------------------------------------------------");
                                        for (j = 0; j < count2; j++) {
                                            p[j].patient_info();
                                        }
                                        break;
                                    }
                            }
                            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                            s2 = input.nextInt();
                        }
                        break;
                    }
                case 3:
                    {
                        s3 = 1;
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("                           **MEDICINE SECTION**");
                        System.out.println("--------------------------------------------------------------------------------");
                        while (s3 == 1)
                        {
                            System.out.println("1.Add New Entry\n2. Existing Medicines List");
                            c1 = input.nextInt();
                            switch (c1)
                            {
                                case 1:
                                    {
                                        m[count3].new_medi();count3++;
                                        break;
                                    }
                                case 2:
                                    {
                                        System.out.println("--------------------------------------------------------------------------------");
                                        System.out.println("Name \t Company \t Expiry Date \t Cost");
                                        System.out.println("--------------------------------------------------------------------------------");
                                        for (j = 0; j < count3; j++) {
                                            m[j].find_medi();
                                        }
                                        break;
                                    }
                            }
                            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                            s3 = input.nextInt();
                        }
                        break;
                    }
                case 4:
                    {
                        s4 = 1;
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("                            **LABORATORY SECTION**");
                        System.out.println("--------------------------------------------------------------------------------");
                        while (s4 == 1)
                        {
                            System.out.println("1.Add New Entry \n2.Existing Laboratories List");
                            c1 = input.nextInt();
                            switch (c1)
                            {
                                case 1:
                                    {
                                        l[count4].new_faci();count4++;
                                        break;
                                    }
                                case 2:
                                    {
                                        System.out.println("--------------------------------------------------------------------------------");
                                        System.out.println("Facilities\t\t Cost");
                                        System.out.println("--------------------------------------------------------------------------------");
                                        for (j = 0; j < count4; j++) {
                                            l[j].faci_list();
                                        }
                                        break;
                                    }
                            }
                            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                            s4 = input.nextInt();
                        }
                        break;
                    }
                case 5:
                    {
                        s5 = 1;
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("                      **HOSPITAL FACILITY SECTION**");
                        System.out.println("--------------------------------------------------------------------------------");
                        while (s5 == 1)
                        {
                            System.out.println("1.Add New Facility\n2.Existing Facilities List");
                            c1 = input.nextInt();
                            switch (c1)
                            {
                                case 1:
                                    {
                                        f[count5].add_faci();count5++;
                                        break;
                                    }
                                case 2:
                                    {
                                        System.out.println("--------------------------------------------------------------------------------");
                                        System.out.println("numberOfFacility \t serialNumber \t Facility \t Contact \t Cost");
                                        System.out.println("--------------------------------------------------------------------------------");
                                        for (j = 0; j < count5; j++) {
                                            f[j].show_faci();
                                        }
                                        break;
                                    }
                            }
                            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                            s5 = input.nextInt();
                        }
                        break;
                    }
                case 6:
                    {
                        
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("                            **STAFF SECTION**");
                        System.out.println("--------------------------------------------------------------------------------");
                        s6 = 1;
                        while (s6 == 1)
                        {

                            System.out.println("1.Add New Entry \n2.Existing Staffs List");
                            c1 = input.nextInt();
                            switch (c1)
                            {
                                case 1:
                                    {
                                        s[count6].new_staff();count6++;
                                        break;
                                    }
                                case 2:
                                    {
                                        System.out.println("--------------------------------------------------------------------------------");
                                        System.out.println("id \t Name \t Gender \t Salary");
                                        System.out.println("--------------------------------------------------------------------------------");
                                        for (j = 0; j < count6; j++)
                                        {
                                             
                                                s[j].staff_info();
                                        }
                                        break;
                                    }
                                
                            }
                            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                            s6 = input.nextInt();
                        }
                        break;
                    }
                default:
                    {
                        System.out.println(" You Have Enter Wrong Choice!!!");
                    }
            }
            System.out.println("\nReturn to MAIN MENU Press 1");
            status = input.nextInt();
        }
    }
}
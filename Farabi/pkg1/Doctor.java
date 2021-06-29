package pkg1;

import java.io.*;
import java.util.*;
import java.util.Calendar;

public class Doctor implements IPerson  // Encapsulation + Interface + Abstraction + polymorphism
{

    private String did;
    private String dname;
    private String specilist;
    private String appoint;
    private String doc_qual;
    private int droom;
    public void new_doctor()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("id:-");
        did = input.nextLine();
        System.out.print("name:-");
        dname = input.nextLine();
        System.out.print("specilization:-");
        specilist = input.nextLine();
        System.out.print("work time:-");
        appoint = input.nextLine();
        System.out.print("qualification:-");
        doc_qual = input.nextLine();
        System.out.print("room no.:-");
        droom = input.nextInt();
    }
    public void doctor_info()
    {
        System.out.println(did + "\t" + dname + "  \t" + specilist + "     \t" + appoint + "    \t" + doc_qual + "       \t" + droom);
    }



    public void setName(String name) { // Polymorphism

        dname = name;
    }


    public String getName() {
        return dname;
    } // Polymorphism


    public String getDid() {
        return did;
    }

    public void setDid(String did) {
        this.did = did;
    }




    public String getSpecilist() {
        return specilist;
    }

    public void setSpecilist(String specilist) {
        this.specilist = specilist;
    }

    public String getAppoint() {
        return appoint;
    }

    public void setAppoint(String appoint) {
        this.appoint = appoint;
    }

    public String getDoc_qual() {
        return doc_qual;
    }

    public void setDoc_qual(String doc_qual) {
        this.doc_qual = doc_qual;
    }

    public int getDroom() {
        return droom;
    }

    public void setDroom(int droom) {
        this.droom = droom;
    }
}
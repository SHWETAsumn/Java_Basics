import java.io.*;
import java.util.*;
//import  java.lang.System;
class Academic
{
    public Academic()
    {
        System.out.printf("Welcome on this Platform");

    }
    
    
}

class Achievement
{
    public Achievement()
    {
        System.out.printf("Welcome on this Platform");

    }
    
}

public class Students {

    public void studentDetail() 
    {
        System.out.println("Welcome on this Platform");
        System.out.println("Hi");

    }
    
    public void studentDetail(int roll, String name, int age)
    {
       System.out.println("Roll No:- " +roll+ "\n"+"Name:- " +name+ "\n"+"Age:- "+age);

    } 

    public static void main(String[] args)
    {
       // int roll=12;
        //String name= "Suman";
        //int age= 23;

        Academic a=new Academic();

        Students s=new Students();
        s.studentDetail();
        s.studentDetail(12, "Suman", 23);
    }
}

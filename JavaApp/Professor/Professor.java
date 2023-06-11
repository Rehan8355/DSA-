package JavaApp.Professor;
import java.util.*;

import JavaApp.Employee.Employee;
public class Professor extends Employee{
    public Professor()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Basic pay of     Professor:-");
        double BP=sc.nextFloat();

    }
    public void get_Display(){
        System.out.println("_________________________________________________________"+"\n                    Professor pay slip"+"\n"+"___________________________________________________________"+"\n");
    }
    
}

package JavaApp.AssistanceProfessor;
import java.util.*;

import JavaApp.Employee.Employee;

public class AssistanceProfessor extends Employee{
    public AssistanceProfessor(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Basic pay of  Assistance Professor:-");
        double BP=sc.nextFloat();

    }
    public void get_Display(){
        System.out.println("________________________________________________________"+"\n                  Assistance Professor pay slip"+"\n"+"___________________________________________________________"+"\n");
    }







}

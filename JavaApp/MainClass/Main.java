package JavaApp.MainClass;

import java.util.Scanner;

import JavaApp.AssistanceProfessor.AssistanceProfessor;
import JavaApp.AssociativeProfessor.AssociativeProffessor;
import JavaApp.Employee.Employee;
import JavaApp.Professor.Professor;
import JavaApp.Programmer.Programmer;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n1.Programmer  \n2.Assistant_Professor   \n3.Associate_Professor \n14.Professor");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an integer:");
        int ch=sc.nextInt();
        switch(ch){
    case 1:
        Employee p1=new Programmer();
        p1. get_data();
        p1.get_Display();
        p1.calculation();
        break;
    case 2:
            AssistanceProfessor Ap1=new AssistanceProfessor ();
            Ap1.get_data();
            Ap1.get_Display();
            Ap1.calculation();
            break;

    case 3:

           AssociativeProffessor ASP1=new AssociativeProffessor();
           ASP1.get_data();
           ASP1.get_Display();
           ASP1.calculation();

    case 4:
           Professor pro1=new Professor();
           pro1. get_data();
           pro1.get_Display();
           pro1.calculation();
           break;
    }
}
}
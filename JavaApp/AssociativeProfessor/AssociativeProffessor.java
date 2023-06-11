package JavaApp.AssociativeProfessor;
import java.util.*;

import JavaApp.Employee.Employee;
public class AssociativeProffessor extends Employee{
    public AssociativeProffessor ()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Basic pay of    Associative Professor:-");
        double BP=sc.nextFloat();

    }
    public void get_Display(){
        System.out.println("________________________________________________________"+"\n                      Associative Professor pay slip"+"\n"+"___________________________________________________________"+"\n");
    }
}

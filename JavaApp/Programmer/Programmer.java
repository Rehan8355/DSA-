package JavaApp.Programmer;

import JavaApp.Employee.Employee;
import java.util.*;
public class Programmer extends Employee {
    public Programmer(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Basic pay of the programmer:-");
        double BP=sc.nextFloat();

    }
    public void get_Display(){
        System.out.println("_________________________________________________________________"+"\nProgrammer pay slip"+"\n"+"___________________________________________________________"+"\n");
    }
    
}

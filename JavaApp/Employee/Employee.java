package JavaApp.Employee;
import java.util.*;

public class Employee {
    String Emp_name,Emp_id,Address,Mail_id;
    int mobile_no;
    double BP,GP,NP,DA,HRA,PF,CF;

    public void get_data(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Emp_id:-");
        Emp_id=sc.nextLine();   
        System.out.println("Employee Name:-");
        Emp_name=sc.nextLine();
        System.out.println("Address:-");
        Address=sc.nextLine();
        System.out.println("Mail ID:-");
        Mail_id=sc.nextLine();
        System.out.println("Mobile No:-");
        mobile_no=sc.nextInt();
    }
    public void get_Display(){
        System.out.println("Emp_id:-"+Emp_id);     
        System.out.println("Employee Name:-"+Emp_name); 
        System.out.println("Address:-"+Address);
        System.out.println("Mail ID:-"+Mail_id);
        System.out.println("Mobile No:-"+mobile_no);
       
       
    }
    public void calculation(){
        //  Scanner sc=new Scanner(System.in);
        //  System.out.println("Enter the Basic pay :-");
        //  double BP=sc.nextFloat();
        DA=BP*0.97;
        HRA=BP*0.10;
        PF=BP*0.12;
        CF=BP*0.01;
        GP=BP+DA+HRA+PF;
        NP=GP-PF-CF;
        System.out.println("> Basic pay:-"+BP);
        System.out.println("> Dearness Allowance:-"+DA);
        System.out.println("> House Resnt Allowance:-"+HRA);
        System.out.println("> Provident Fund:-"+PF);
        System.out.println("> Cloun Fund:-"+CF);
        System.out.println("> Gross pay:-"+GP);
        System.out.println("> Net Pay:-"+NP);
    }
}

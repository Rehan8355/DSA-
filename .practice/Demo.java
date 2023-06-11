import java.rmi.server.SocketSecurityException;
import java.util.ArrayList;
import java.util.Scanner;
class Run1 implements Runnable{

    @Override
    public void run() {
        try{
        System.out.print("welcome!");
        System.out.print(" ");
        System.out.print("How");
        Thread.sleep(1000);
        System.out.print(" ");
        System.out.print("are ");
        Thread.sleep(1000);
        System.out.print(" ");
        System.out.println("you?");
    }
    catch(Exception e){
        System.out.println(e);
    }

}


public static class Demo  {
    public static void main(String[] args) {
       
   Run1 r=new Run1();
   r.run();

}
}
}
        
    
class Thread1 extends Thread{
        public void run(){
                
                 try {
                         Thread1.sleep(200);
                } catch (InterruptedException e) {
                         // TODO Auto-generated catch block
                         e.printStackTrace();
                 }
                 System.out.println("Good moarning");
        }
}
class Thread2 extends Thread{
        public void run(){
                System.out.println("Welcome");
        }
}
public class Threadd2 {
        public static void main(String[] args) throws Exception
        {
                Thread1 t1=new Thread1();
                Thread2 t2=new Thread2();
                System.out.println(t1.isAlive());
                t1.start();
                System.out.println(t1.isAlive());
                
                t2.start();
                t2.join();
              System.out.println( Thread.currentThread());
                System.out.println(t1.getState());
                System.out.println(t2.getState());

            
        }
}

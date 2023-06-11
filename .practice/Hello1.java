class TestA {

    public void start() { 
    
    System.out.println("TestA"); }
    
    }
    
    public class Hello1 extends TestA {
    
    public void start() { 
    
    System.out.println("TestB"); }//overridden method
    
    public static void main(String[] args) {
    
    ((TestA)new Hello1()).start();
    
    }
    
    
    
}

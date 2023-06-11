package DSA.AssingmentLL4;

public class ElementPresent {
    Node Head;
    class Node{
        int data;
        Node next;
        //constructor
        Node(int d){
            data=d;
            next=null;
        }
    }
    //implementation of insertion of at node at the end
    public void insertionAtEnd(int newData){
        Node newNode=new Node(newData);
        //if linked is empty
        if(Head==null){
            Head=new Node(newData);
            return;
        }
        //linkedlist not empty
        newNode.next=null;
        Node temp=Head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        return;
     }
     public void display(){
        Node temp=Head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
            
        }
     }
     //implementation of to check x is npresent or not
     public void CheckElement(int x){
        Node temp=Head;
        int flag=0;
        while(temp!=null){
            if(temp.data==x){
                flag=1;
            }
                temp=temp.next;
            }
         
         if(flag==1){
            System.out.println("YES");

         }
         else{
            System.out.println("NO");
         }
     }
    public static void main(String[] args) {
        ElementPresent list= new ElementPresent();
        System.out.print("Input:");
        list.insertionAtEnd(14);
        list.insertionAtEnd(21);
        list.insertionAtEnd(11);
        list.insertionAtEnd(30);
        list.insertionAtEnd(10);
        list.display();
        System.out.println();
        System.out.print("Output:");
        list.CheckElement(14);

         System.out.print( "Input: ");
         list.insertionAtEnd(6);
         list.insertionAtEnd(21);
         list.insertionAtEnd(17);
         list.insertionAtEnd(30);
         list.insertionAtEnd(10);
         list.insertionAtEnd(8);
         list.display();
         System.out.println();
        System.out.print("Output:");
          list.CheckElement(13);
        
    }
}

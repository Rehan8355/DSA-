package DSA.LinkedList;

public class ReverseIteratively {
    Node Head;
    class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    //implementation of insertrion
    public void insertionAtTheEnd(int newData){
        Node newNode =new Node(newData);
        //if list is empty 
        if(Head==null){
            Head=new Node(newData);
            return;
        }
        //list not empty
        newNode.next=null;
        Node temp=Head;
        while (temp.next!=null) {
            temp=temp.next;
            }
            temp.next=newNode;
            return;
    }
    //implementation insertion at the begning
    public void insertionAtBegnning(int newData){
        Node newNode= new Node(newData);
        newNode.next=Head;
        Head=newNode;
    }
    //implementation of insertion at Any point
    public void insertionAtanyPoint(Node prev_node, int newdata){
        if(prev_node==null){
            System.out.println("The previous node cannot contain Null Values");
            return;
        }
        Node newNode=new Node(newdata);
        newNode.next=prev_node.next;
        prev_node.next=newNode;
    }
    
    //reverse a linkedList iteratively
    public void ReverseLL(){
        Node Curr=Head;
        Node prev=null;
        Node nextptr=null;
        while(Curr!=null){
            nextptr=Curr.next;
            Curr.next=prev;
            prev=Curr;
            Curr=nextptr;
        }
        Head=prev;
    }
    public void display(){
        Node temp=Head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ReverseIteratively list= new ReverseIteratively();
        System.out.println("Insertion At begnning");
        list.insertionAtBegnning(10);
        list.insertionAtBegnning(9);
        list.display();
        System.out.println("Insertion at the end");
        list.insertionAtTheEnd(12);
        list.insertionAtTheEnd(14);
        list.display();
        System.out.println("Insertion at any point");
        list.insertionAtanyPoint(list.Head.next.next, 13);
        list.display();
        System.out.println("After reversal");
        list.ReverseLL();             
        list.display();
        
    }
    public void middle() {
    }
}

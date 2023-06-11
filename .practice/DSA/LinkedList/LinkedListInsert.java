package DSA.LinkedList;

public class LinkedListInsert {
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
     //insert at beginning
     public void insertAtBeginning(int newData){
        Node newNode= new Node(newData);
        newNode.next=Head;
        Head=newNode;
     }

     //insert After any node in a linked list
     public void insertAtAnyPoint(Node prev_node,int newData){
        if(prev_node==null){
            System.out.println("The previous node cannot contain null values");
            return;
        }
        Node newNode=new Node(newData);
        newNode.next= prev_node.next;
        prev_node.next=newNode;


     }
    //display a linkedlist
    public void display(){
        Node temp=Head;
        while(temp!=null){
        System.out.print(temp.data+ " ");
        temp=temp.next;
    }
    System.out.println();
    }
    public static void main(String[] args) {
        LinkedListInsert list=new LinkedListInsert();
        System.out.println("Adding at the end");
        list.insertionAtEnd(10);
        list.insertionAtEnd(5);
        list.insertionAtEnd(2);
        list.display();
        System.out.println("After Adding Beginning");
        list.insertAtBeginning(1);
        list.insertAtBeginning(2);
        list.display();
        System.out.println("After Adding At particular point");
        list.insertAtAnyPoint(list.Head.next.next,6);
        list.display();
        list.insertAtAnyPoint(list.Head.next.next.next.next.next, 5);
        list.display();
        
    }
}

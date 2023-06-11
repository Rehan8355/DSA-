package DSA.LinkedList;

public class LinkedListDeletion {
    Node Head;

    class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }

    }
    //implementation of insertion 
    public void insertionAtEnd(int newData){
        Node newNode=new Node(newData);
        //linkedList is empty
        if(Head==null){
            Head=new Node(newData);
            return;
        }
        //linked list not empty
        newNode.next=null;
        Node temp = Head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        return;
    }
    //display a linkedlist
    public void display(){
        Node temp= Head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
        System.out.println();
    }
    public void deletion(int position)
    {
        //linkedlist is empty
        if(Head==null){
            return;
        }
        Node temp=Head;
        //deletion is in the begnning of the node
        if(position==0){
            Head=temp;
            return;
        }
        //deletion is not in the begnning of the node
        for(int i=0; temp!=null && i<position-1; i++){
            temp=temp.next;
        }
        if(temp==null && temp.next==null){
            return;
        }
        temp.next=temp.next.next;
    }
    public static void main(String[] args) {
        
        
        LinkedListDeletion list= new LinkedListDeletion();
        list.insertionAtEnd(10);
        list.insertionAtEnd(12);
        list.insertionAtEnd(11);
        list.insertionAtEnd(19);
        list.display(); 
        list.deletion(2);  
        list.deletion(1);
        list.deletion(0);
        list.deletion(4);
        list.display();     
    }
}

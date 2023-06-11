package DSA.AssingmentLL4;

public class InsertAtAnyPoint {
    Node Head;
    class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
        //insertion at the end
        public void insertAtEnd(int newData){
            Node newNode=new Node(newData);
            //if Llist is empty
            if(Head==null){
                Head=new Node(newData);
                return;
            }
            //linkedList not empty
            newNode.next=null;
            Node temp=Head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
            return;

        }
        //insert at any position
        public void insertAtanyPosition(Node prev_node,int newData){
            if(prev_node==null){
                System.out.println("The previous node cannot contain null values");
            return;
            }
            Node newNode=new Node(newData);
            newNode.next=prev_node.next;
            prev_node.next=newNode;
            return;
        }
        //display
        public void display(){
            Node temp=Head;
            while(temp.next!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }

    
    public static void main(String[] args) {
        InsertAtAnyPoint list=new InsertAtAnyPoint();
        System.out.println("Example:1");
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(4);
        list.insertAtEnd(5);
        list.insertAtEnd(6);
        System.out.print("LinkedList Before Insertion:");
        list.display();
        System.out.println("After Insertion");
        list.insertAtanyPosition(list.Head.next,3);
        list.display();
        // System.out.println("Example:2");
        // list.insertAtEnd(1);
        // list.insertAtEnd(2);
        // list.insertAtEnd(4);
        // list.insertAtEnd(5);
        // list.insertAtEnd(6);
        // System.out.print("LinkedList Before Insertion:");
        // list.display();
        // System.out.println("After Insertion");
        // list.insertAtanyPosition(list.Head.next.next.next.next.,7);
        // list.display();
        
        
    }
}

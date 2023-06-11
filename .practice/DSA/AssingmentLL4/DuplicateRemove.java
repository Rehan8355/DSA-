package DSA.AssingmentLL4;

public class DuplicateRemove {
    Node Head;
    class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    //insertion of the linkedlist
    public void insertionAtTheend(int newData){
        Node newNode=new Node(newData);
        if(Head==null){
            Head=new Node(newData);
            return;
        }
        //LL not Empty
        newNode.next=null;
        Node temp=Head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        return;
    }
    
//delete Duplicates
   public void deleteDuplicates() {
    if(Head == null || Head.next == null)
        return ;
    Node temp = Head;
    
    while( temp != null && temp.next != null){
       
        if(temp.data == temp.next.data){
            temp.next = temp.next.next;
        }
        else{
            temp = temp.next; 
        }
    }
    return;
}
    //display LL
    public void display(){
        Node temp=Head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        DuplicateRemove list=new DuplicateRemove();
        System.out.println("Example:1");
        list.insertionAtTheend(1);
        list.insertionAtTheend(1);
        list.insertionAtTheend(2);
        list.display();
        list.deleteDuplicates();
        list.display();
        System.out.println("Example:2");
        // list.insertionAtTheend(1);
        // list.insertionAtTheend(1);
        // list.insertionAtTheend(2);
        list.insertionAtTheend(3);
        list.insertionAtTheend(3);
        list.display();
        list.deleteDuplicates();
        list.display();
    }
}

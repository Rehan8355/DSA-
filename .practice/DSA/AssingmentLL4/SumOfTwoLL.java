package DSA.AssingmentLL4;

public class SumOfTwoLL {
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
              //linkedlist not empty
        newNode.next=null;
        Node temp=Head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        return;

        }
        public void Display(){
            Node temp=Head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    
       public  void addTwoNumbers(Node l1 , Node l2) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
            Node dummy = new Node(0); // creating an dummy list
            Node curr = dummy; // intialising an pointer
            int carry = 0; // intialising our carry with 0 intiall
            // while loop will run, until l1 OR l2 not reaches null OR if they both reaches null. But our carry has some value in it. 
            // We will add that as well into our list
            while(l1 != null || l2 != null || carry == 1){
                int sum = 0; // intialising our sum
                if(l1 != null){ // adding l1 to our sum & moving l1
                    sum += l1.data;
                    l1 = l1.next;
                }
                if(l2 != null){ // adding l2 to our sum & moving l2
                    sum += l2.data;
                    l2 = l2.next;
                }
                sum += carry; // if we have carry then add it into our sum
                carry = sum/10; // if we get carry, then divide it by 10 to get the carry
                Node node = new Node(sum % 10); // the value we'll get by moduloing it, will become as new node so. add it to our list
                curr.next = node; // curr will point to that new node if we get
                curr = curr.next; // update the current every time
            }
           
           Head=dummy.next;
        }
    
           
             
    
    public static void main(String[] args) {
        SumOfTwoLL l1=new SumOfTwoLL();
        l1.insertAtEnd(2);
        l1.insertAtEnd(4);
        l1.insertAtEnd(3);
        System.out.print("LList l1: ");
        l1.Display();

        SumOfTwoLL l2=new SumOfTwoLL();
        l2.insertAtEnd(5);
        l2.insertAtEnd(6);
        l2.insertAtEnd(4);
        System.out.print("LList l2: ");
        l2.Display();

        SumOfTwoLL l3 = new SumOfTwoLL();
        l3.addTwoNumbers(l1.Head, l2.Head);
        System.out.print("Sum:      ");
        l3.Display();


    }
}

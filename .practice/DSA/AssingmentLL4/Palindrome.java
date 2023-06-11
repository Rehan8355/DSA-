package DSA.AssingmentLL4;

public class Palindrome {
    Node Head;
    Node second_half;
    class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    //Insertion a LL
    public void insertionAtEnd(int newData){
        Node newNode= new Node(newData);
        if(Head==null){
            Head=new Node(newData);
            return;
        }
        newNode.next=null;
        Node temp=Head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        return;
    }
    boolean isPalindrome(Node head)	{
		Node slow_ptr = head;
		Node fast_ptr = head;
		Node prev_of_slow_ptr = head;
		Node midnode = null; // To handle odd size list
		boolean res = true; // initialize result

		if (head != null && head.next != null) {
		
			while (fast_ptr != null && fast_ptr.next != null) {
				fast_ptr = fast_ptr.next.next;
				prev_of_slow_ptr = slow_ptr;
				slow_ptr = slow_ptr.next;
			}

			if (fast_ptr != null) {
				midnode = slow_ptr;
				slow_ptr = slow_ptr.next;
			}
			second_half = slow_ptr;
			prev_of_slow_ptr.next = null; 
			reverse(); 
			res = compareLists(head , second_half); 
			reverse(); 

			if (midnode != null) {
				prev_of_slow_ptr.next = midnode;
				midnode.next = second_half;
			}
			else
				prev_of_slow_ptr.next = second_half;
		}
		return res;
	}
	void reverse(){
		Node prev = null;
		Node current = second_half;
		Node next;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		second_half = prev;
	}

	boolean compareLists(Node head1, Node head2)
	{
		Node temp1 = head1;
		Node temp2 = head2;

		while (temp1 != null && temp2 != null) {
			if (temp1.data == temp2.data) {
				temp1 = temp1.next;
				temp2 = temp2.next;
			}
			else
				return false;
		}

		if (temp1 == null && temp2 == null)
			return true;
    
		return false;
    }
    //reverse a LL
    public void reverseLL(){
        Node curr=Head;
        Node prev=null;
        Node next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Head=prev;
    }

    //Display a LL
    public void display(){
        Node temp=Head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Palindrome list = new Palindrome();
        list.insertionAtEnd(1);
        list.insertionAtEnd(1);
        list.insertionAtEnd(2);
        list.insertionAtEnd(1);
        list.display();
        list.reverseLL();
     //   list.display();
        if (list.isPalindrome(list.Head) != false) {
			System.out.println("Is Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
    }
}

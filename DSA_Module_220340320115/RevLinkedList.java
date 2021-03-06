import java.util.*;
class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
	}
}

class LinkedList{
	Node head;
	void insert(int data){
		Node n = new Node(data);
		if(head==null){
			head = n;
			return;
		}
		Node temp = head;
		while(temp.next != null){
			temp = temp.next;
		}
		temp.next = n;
	}
	
	void rev(){
		rev(head);
	}

	void rev(Node head){
		if (head==null);
		return;
		rev(head.next);
		System.out.print(head.data+" ");
	}
	
	void display(){
		Node temp = head;
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
}
	
public class RevLinkedList{
	
	public static void main(String[] args){
		
	LinkedList list = new LinkedList();
	Scanner sc= new Scanner (System.in);
	System.out.print("Enter no. of elements:");
	int n = sc.nextInt();
	System.out.print("Enter no. in linkedlist : ");
	for(int i = 0; i<n; i++){
		list.insert(sc.nextInt());
	}
	System.out.print("Reversed LinkedList is : ");
	list.rev();
	}
	
}

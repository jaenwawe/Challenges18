package tester;

/*Write code to remove duplicates from an usorted linked list cTc 2.1*
 * 
 * 
 */

public class LinkedList extends Node {
	
	public LinkedList(int data) {
		super(data);
		// TODO Auto-generated constructor stub
	}

	public static void main(String args []) 
	{
	//start at head and traverse the link
	Node head = new Node(17);	
	System.out.print(head.data);
	head.next = new Node (1);
	
	Node listNode = head;
	while(listNode.next != null){
		System.out.println(listNode.data);
		listNode	 = listNode.next;
		}		
	}
}

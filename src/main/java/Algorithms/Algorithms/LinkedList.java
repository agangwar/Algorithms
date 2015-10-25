package Algorithms.Algorithms;

public class LinkedList 
{
	private int size;
	LinkedListNode head;
	
	LinkedList(){
		head=null;
		size=0;
	}
	public void insertFirst(int data){
		LinkedListNode newNode;
		try{
			newNode = new LinkedListNode(data);
			this.size++;
			if(head==null){
				head = newNode;	
				return;
			}
			newNode.setNext(head);
			head = newNode;
		}catch(OutOfMemoryError E){
			System.out.println(E.getMessage());
		}		
	}
	public void printList(){
		LinkedListNode temp = head;
		while(temp!=null){
			System.out.print(temp.getData()+"->");
			temp = temp.getNext();
		}
		System.out.println();
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public void reverse1(){
		LinkedListNode prev = null;
		LinkedListNode curr = this.head;
		LinkedListNode next = this.head;
		while(curr!=null){
			next = curr.getNext();
			curr.setNext(prev);
			prev = curr;
			curr = next;
		}
		this.head = prev;
	}
	public void reverse2(LinkedListNode head){
		LinkedListNode first;
		LinkedListNode rest;
		if(head==null)
			return;
		first = head;
		rest = first.getNext();
		if(rest==null)
			return;
		reverse2(rest);
		first.getNext().setNext(first);
	    first.setNext(null);          
	    this.head = rest;
	}
}

package com.dsa;

public class LinkedList {
	Node head,start,ptr,prev;
	public void insertAtEnd(int val) {
		Node data=new Node(val);
		
		if(head==null)
		{   
		  head=data;
		  //data.next=null;
		}
		else
		{
			start=head;
			System.out.println(start.next);
			while(start.next!=null)
			{  start=start.next;
			}
			start.next=data;
			data.next=null;
		}
	}
	public void insertABeg(int val) {
		Node data=new Node(val);
	if(head==null)
		head=data;
	else
	{   start.next=head;
	    head=data;
	    start=head;
	    while(start.next!=null)
	    {
	    	start=start.next;
	    }
	    
		
	}
		
	}
	public void display() {
		if(head==null)
			System.out.println("List is empty .");
		else
		{
			start=head;
			 while(start!=null)			
			{
				System.out.println(start);
				start=start.next;
			}
		}
		
	

}
}
class Node
{   
Node head,next,start,ptr;
    int data;
    public Node(int val) {
		this.data=val;
	}
	@Override
	public String toString() {
		return "" + data + "";
	}
	
}

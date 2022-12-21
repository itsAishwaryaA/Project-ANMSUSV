package com.dsa;

import java.util.Scanner;

public class LinkedListImplementation {
  
	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		  int i;
		  int val;
		  Scanner sc=new Scanner(System.in);
		  do {
	System.out.println("******************8Menu***************************");
	System.out.println("\n1.Insert In End");
	 System.out.println("\n2.Insert In Beg");
	 System.out.println("\n3.Insert At A  Particular Pos");
	 System.out.println("\n4.Delete At a Pos");
	 System.out.println("\n5.Length");
	 System.out.println("\n6.Reverse");
	 System.out.println("\n7.Display");
	 System.out.println("\n8.EXIT");
	 System.out.println("\nenter ur choice : ");
	 i=sc.nextInt();
	 switch(i)
	 {
	 case 1:
		  System.out.println("\nEnter the value to insert:");
		  val=sc.nextInt();
	      list.insertAtEnd(val);
	      break;
	 case 2:
		 System.out.println("\nEnter the value to insert:");
		  val=sc.nextInt();
	      list.insertABeg(val);
	 case 7:
          list.display();
          break;
	 }
	 System.out.println("Do you want to continue:");
	 	}while(sc.nextInt()==1);
	}
}

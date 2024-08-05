package com.java;
class Node1{
	int data;
	Node1 next;
	Node1(int d){
		data=d;
		next=null;
	}
}
public class LinkedList {
	static Node1 head;
	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		
		list.addFront(10);
		list.addFront(20);
		list.addLast(89);
		list.display();
		System.out.println();
		Node1 current=head;
		swap(20,89);
		list.display();
		//list.display();
//		reverse(current);
//		System.out.println();
//		list.display();
//		head =revList(current);
//		System.out.println();
//		list.display();
//		list.deleteFirst();
//		System.out.println();
//		list.display();
//		list.deleteLast();
//		System.out.println();
//		list.display();
	}
	public void addFront(int data) {
		Node1 newNode=new Node1(data);
		if(head==null) {
			head=newNode;
		}
		else {
			newNode.next=head;
			head=newNode;
		}
	}
	public void addLast(int data) {
		Node1 newNode=new Node1(data);
		if(head==null) {
			head=newNode;
		}
		else {
			Node1 current=head;
			while(current.next!=null) {
				current=current.next;
			}
			current.next=newNode;
		}
	}
	public static void reverse(Node1 current) {
		if(current==null)
			return;
		reverse(current.next);
		System.out.print(current.data+" ");
	}
	public void deleteFirst() {
		if(head==null) {
			System.out.println("Empty List");
			return;
		}
		else {
			head=head.next;
		}
	}
	public void deleteLast() {
		if(head==null) {
			System.out.println("Empty");
		}
		else {
			Node1 current=head;
			Node1 prev=null;
			while(current.next!=null) {
				prev=current;
				current=current.next;
			}
			prev.next=null;
		}
	}
	public void delete(int p)
	{
		Node1 current=head;
		Node1 prev=null;
		int n=0;
		while(p!=n&&current!=null) {
			prev=current;
			current=current.next;
			n++;
		}
		prev.next=current.next;
	}
	public void display() {
		Node1 current=head;
		while(current!=null) {
			System.out.print(current.data+"->");
			current=current.next;
		}
		
	}
	public static Node1 revList(Node1 h) {
		Node1 safe=null,newNext=null,curr=null;
		curr=h;
		while(curr!=null) {
			safe=curr.next;
			curr.next=newNext;
			newNext=curr;
			curr=safe;
		}
		return newNext;
	}
	public static void swap(int n1,int n2) {
		Node1 curr=head;
		Node1 f=null,l=null;
		Node1 temp=null;
		while(curr!=null) {
			if(curr.data==n1) {
				f=curr;
			}
			if(curr.next.data==n2) {
				l=curr;
				System.out.println("f:"+f.data+" l:"+l.data);
				temp=l.next;
				l.next=f;
				temp.next=l;
				head=temp;
				f.next=null;
				break;
			}
			curr=curr.next;
		}
	}
}

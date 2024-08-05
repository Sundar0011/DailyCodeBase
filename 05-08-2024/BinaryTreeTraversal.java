package com.java;
class Node4{
	int data;
	Node4 left;
	Node4 right;
	Node4(int d){
		data=d;
		left=right=null;
	}
}
public class BinaryTree {
static Node4 root;
	public static void main(String[] args) {
		BinaryTree b=new BinaryTree();
		Node4 curr=root;
		curr=b.insert(curr,50);
		curr=b.insert(curr,30);
		curr=b.insert(curr,30);
		curr=b.insert(curr,40);
		curr=b.insert(curr,70);
		curr=b.insert(curr,60);
		curr=b.insert(curr,80);
		curr=b.insert(curr,100);
		curr=b.insert(curr,200);
		display(root);
		int h=b.height(root);
		System.out.println(h);
	}
	public static Node4 insert(Node4 curr,int data) {
		if(root==null) {
			Node4 newNode=new Node4(data);
			root=newNode;
			return root;
		}
		if(curr==null) {
			Node4 newNode=new Node4(data);
			curr=newNode;
			return curr;
		}
		if(data<curr.data) {
			curr.left=insert(curr.left,data);
		}
		if(data>curr.data)
			curr.right=insert(curr.right,data);
		
		return curr;
	}
	public static void display(Node4 curr) {
		if(curr==null)
			return;
		System.out.println(curr.data+" ");
		display(curr.left);
		display(curr.right);
	}
	public static int  height(Node4 curr) {
		if(curr==null)return 0;
		int leftHeight=height(curr.left);
		int rightHeight=height(curr.right);
		
		return rightHeight+1;		
		
		
	}

}

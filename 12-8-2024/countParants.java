package Tree;
import java.util.*;
class Node5{
	int data;
	Node5 left;
	Node5 right;
	Node5(int d){
		data=d;
		left=null;
		right=null;
	}
}
public class FindParant {
	static Node5 root;
	static int  c=0;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
			int v=sc.nextInt();
			if(v==-1)
				break;
			else
				insert(v);
		}
		count(root);
		System.out.println(c);

	}
	public static void insert(int data) {
		Node5 newNode=new Node5(data);
		Node5 curr=root;
		if(root==null) {
			root=newNode;
		}
		else {
			while(true) {
				if(data<curr.data) {
					if(curr.left==null) {
						curr.left=newNode;
						break;
					}
					else
						curr=curr.left;
				}
				else {
					if(data>curr.data) {
						if(curr.right==null) {
							curr.right=newNode;
							break;
						}
						else {
							curr=curr.right;
						}
							
					}
				}
			}
		}
	}
	public static void count(Node5 curr) {
		if(curr==null)
			return;
		if(!(curr.left==null&&curr.right==null))
			c++;
		count(curr.left);
		count(curr.right);
		
	}
}

package Graph;
import java.util.*;
public class Graph {
	static List<ArrayList<Integer>> list;
	public static void main(String[] args) {
		addVertex(6);
		addEdge(1,2);
		addEdge(1,3);
		addEdge(3,4);
		addEdge(4,5);
		addEdge(2,5);
		display();

	}
	public static void addVertex(int n){
		list=new ArrayList<>();
		for(int i=0;i<n;i++) {
			list.add(new ArrayList<Integer>());
		}
	}
	public static void addEdge(int source,int des) {
		list.get(source).add(des);
		list.get(des).add(source);
	}
	public static void display() {
		for(int i=0;i<6;i++) {
			System.out.print(i+"connected to:");
			for(int v:list.get(i)) {
				System.out.print(v+" ");
			}
			System.out.println();
		}
	}

}

/*You are given a string "ABCDXYZ" and an integer representing the number of rows in a zigzag pattern.

For example, for numRows = 3, the zigzag pattern would appear like this (using a fixed-width font for clarity):

AXBDYCZ

And then read line by line: "AXBDYCZ"

Write the code that will take a string and make this conversion given a number of rows

Test Cases

Input: input = "ABCDXYZ", n = 3 Output: "AXBDYCZ"

In java*/
package com.movies;
import java.util.Scanner;
public class String_zig_zag {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String s=scanner.next();
		int n=scanner.nextInt();
		int v=0;
		int f=0;
		String sarr[]= {"","",""};
		for(int i=0;i<s.length();i++)
		{
			sarr[v]+=s.charAt(i)+"";
			if(v==n-1||v==0)
			{
				f++;
			}
			if(f%2==0)
			{
				v--;
			}
			else {
				v++;
			}
		}
		String string="";
		for(int i=0;i<sarr.length;i++)
		{
			string+=sarr[i];
		}
		System.out.println(string);
	}

}

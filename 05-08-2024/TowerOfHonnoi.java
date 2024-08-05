package com.java;

public class TowerOfHonnoi {
	public static void main(String args[]) {
	int size=4;
	int source[]=new int[size+1];
	int temp[]=new int[size+1];
	int des[]=new int[size+1];
	source[0]=temp[0]=des[0]=200;
	int sTop=size,tTop=0,dTop=0;
	for(int i=1;i<=size;i++) {
		source[i]=size-i+1;
		temp[i]=-1;
		des[i]=-1;
	}
	while(true) {
	if(source[sTop]<des[dTop]) {
		dTop++;
		des[dTop]=source[sTop];
		source[sTop]=-1;
		sTop--;
	}
	
	else {
		sTop++;
		source[sTop]=des[dTop];
		des[dTop]=-1;
		dTop--;
	}
	if(dTop==size) {
		break;
	}
	if(source[sTop]<temp[tTop]) {
		tTop++;
		temp[tTop]=source[sTop];
		source[sTop]=-1;
		sTop--;
	}
	else {
		sTop++;
		source[sTop]=temp[tTop];
		temp[tTop]=-1;
		tTop--;
	}
	if(tTop==size) {
		break;
	}
	if(temp[tTop]<des[dTop]) {
		dTop++;
		des[dTop]=temp[tTop];
		temp[tTop]=-1;
		tTop--;
	}

	else {
		tTop++;
		temp[tTop]=des[dTop];
		des[dTop]=-1;
		dTop--;
	}
	if(dTop==size) {
		break;
	}
	if(tTop==size) {
		break;
	}
	
	}
	for(int i=size;i>=0;i--) {
		System.out.println(source[i]+"  "+temp[i]+"  "+des[i]);
	}
}
}

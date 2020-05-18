package DataTypes;

import java.util.Scanner;
public class ArrayConcept {

	public static void main(String[] args) {
		// Array Data Types: int, char,String, double, Boolean
		//1-D Array
		int x[]= new int[4];
		x[0]=10;
		x[1]=20;
		x[2]=30;
		x[3]=40;
		System.out.println(x[2]);
		System.out.println(x.length);
		for(int y=0;y < x.length; y++)
			System.out.println(x[y]);
			
			
		//2-D Array
		
		int a[][]= new int[3][3];
		a[0][0]=1;
		a[0][1]=2;
		a[0][2]=3;
		
		a[1][0]=4;
		a[1][1]=5;
		a[1][2]=6;
		
		a[2][0]=7;
		a[2][1]=8;
		a[2][2]=9;
		
		int b = a[2][1]*a[1][1];
		System.out.println(b);
		
		System.out.println(a.length*b);
		
		for(int c=0;c<a.length;c++)
			for(int d=0;d<a.length;d++)
			System.out.println(a[c][d]);
	
		
		
		

	}

}

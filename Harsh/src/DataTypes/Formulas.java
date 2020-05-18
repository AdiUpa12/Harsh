package DataTypes;

import java.util.Scanner;

public class Formulas {

	public static void main(String[] args) {
		//Mathematical formula's
				
		Scanner val1 = new Scanner(System.in);
		System.out.println("Enter value of a:");
		int c = val1.nextInt();
		
		Scanner val2 = new Scanner(System.in);
		System.out.println("Enter value of b:");
		int d = val2.nextInt();
		
		int a= c*c + 2*(c*d) + d*d;  //(a+b)squ
		int b= c*c - 2*(c*d) + d*d;  //(a-b)squ
		int e= (c+d)*(c*c -(c*d) + d*d);  //(a+b) cube = (a+b)(a squ - ab + b squ)
		int f= (c-d)*(c*c +(c*d) + d*d); //(a-b) cube = (a-b)(a squ + ab + b squ)
		System.out.println("Value of a+b square is:" + a);
		System.out.println("Value of a-b square is:" + b);
		System.out.println("Value of a+b cube is:" + e);
		System.out.println("Value of a-b cube is:" + f);
	
	
		
		
		
		

	}

}

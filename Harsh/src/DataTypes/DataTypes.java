package DataTypes;

public class DataTypes {

	public static void main(String[] args) {
		// Primitve Data Types: Int, double, char, boolean
		
		int a = 10;
		System.out.println(a);

		double b = 11.24;
		System.out.println(b);
		
		char c = 'a';
		System.out.println(c);
		
		boolean d = true;
		System.out.println(d);

		//String
		String e = "Hello World";
		System.out.println(e);
		
		int a1=10;
		int b1=20;
		int c1=25;
		
		int d1= a1*b1;
		int d2= a1+b1+c1;
		int d3= a1-b1;
		int d4= a1/b1;
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		
		
		int a2=100;
		int b2=200;
		int c2=300;
		
		if(a2>b2)
		{
			System.out.println("The value of a2 is greated then b2");
		}
		else;
		{
			System.out.println("The value of b2 is greater then a2");
		
		}
		
		System.out.println("The value of Sum of 3 Integers is:" +(a2+b2+c2));
		
	
		int e2=40;
		int f2=50;
		int g2=60;
		int h2=80;
		int i2= (e2+f2+g2+h2)/4;
		
		System.out.println("The average of 4 Integers is:" + i2);
		
	if (i2<33)
		System.out.println("Result is Fail");
	else
		System.out.println("Result is Pass");
	
	//Operators <,>, <=, >=, =, ==, != &,&&,||
	
	if (e2<f2 && f2<g2)
		System.out.println("G2 is the greatest from 3 Integers:" +g2);
	
	if (e2==f2)
		System.out.println("Both Integers are equal");
	else
		System.out.println("Integers are not equal");
	
	if (e2>f2 || f2>g2)
		System.out.println("E2 is greatest integer");
	else 
		System.out.println("E2 is not greatest");
	
	//40,50,60
	if ((e2>=30 && f2!=50) || e2>h2)
		System.out.println("True");
	
	else
		System.out.println("False");
	
	if (e2<30 || f2>g2 || g2==60 && g2!=60)
		System.out.println("Function is correct");
	else
		System.out.println("Function is incorrect");
		
	
		
		
				
		
		
			
		
	}

}

package DataTypes;

public class LoopingConcepts 
{
	public static void main(String[] args) 
	{	
		//Looping: While, For
		
		int i = 1;
		while (i <= 10) 
		{
		System.out.println(i);
		i++;
		}
		
		System.out.println("-------------------------------");
	
		for(int a=10;a>=0;a--)
		System.out.println(a);
		
		System.out.println("-------------------------------");
		
		int j=2;
		while(j<=20)
		{
			System.out.println(j);
			j=j+2;
		}
		
		System.out.println("-------------------------------");
		
		
		for(int m=1;m<=5;m++)
		{
			
			for(int n=1;n<=m;n++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
			
		
		for(int k=0;k<=5;k++)
		{			
			
			for(int l=k+1;l<=5;l++)
				
			System.out.print("*");
			System.out.println("*");
				
				
			
		}
	
			
	}
	
}



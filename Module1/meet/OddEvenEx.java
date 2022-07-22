import java.util.Scanner;

public class OddEvenEx 
{
	
	//=,-,*,/,%
	
	public static void main(String[] args) 
	{
		//int num=18517;
		
			System.out.println("Enetr your Number");
			//classname objectname =new classname();
			Scanner sc =new Scanner(System.in);
			int num=sc.nextInt();
			
		if(num%2==0)
		{
			System.out.println("Number is even");
		}
		else
		{
			System.out.println("Number is Odd");
		}
	}
}

package ExceptionTest;
import java.util.Scanner;

public class DevideMain {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the dividend: ");
		int x=sc.nextInt();
		
		System.out.println("Enter the divisor: ");
		int y=sc.nextInt();
	
		DivideEx div=new DivideEx();
		
		System.out.println("Quotient: "+div.divide(x, y)); // printing result with divide method

	sc.close();
	}
}
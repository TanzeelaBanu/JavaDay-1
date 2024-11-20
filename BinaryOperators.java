package tanzeela;

public class BinaryOperators 
{
	public static void main(String[] args) 
	{
		//Arithmetic operators
		
		int num1 = 5;
		int num2 = 10;
		int sum = num1 + num2;
		
		System.out.println("Sum - " + sum);
		System.out.println("Diff - " + (num1 - 2));
		System.out.println("Div - " + (num2/num1));
		System.out.println("Mul - "+ (num1*num2));
		System.out.println("Remain - " +(num2%num1));
		
		System.out.println("===================");
		
		//Assignment operators
		
		int x = 10;
		System.out.println("x - " + x);
		x+=20; //x = x+20;
		System.out.println("x - " + x);
		x-=2; //x = x - 2
		System.out.println("x - " + x);
		x*=2; // x = x*2
		System.out.println("x - " + x);
	}
}



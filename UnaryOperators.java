package tanzeela;

public class UnaryOperators 
{
	public static void main(String[] args) 
	{	
		int x = 5;
		int y = x++  +  --x  +  x--  +  x++  +  x--  -  ++x ;
		
		System.out.println("x " + x);
		System.out.println("y "+ y);
	}
}



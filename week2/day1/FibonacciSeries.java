package week2.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
	int n = 20;
	int n1 = 0;
	int n2 = 1;
	System.out.println("Fibonnaci series is:");

		for (int i=1;i<=n;++i)
			
		{
			System.out.print(n1 + ",");
			int n3 = n1+n2;
			n1 = n2;
			n2 = n3;
		    
		}
	}
	

}

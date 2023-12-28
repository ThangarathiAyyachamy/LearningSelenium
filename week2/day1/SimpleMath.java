package week2.day1;

public class SimpleMath {

	public static void main(String[] args) {
	 SimpleMath answer = new SimpleMath();
	 answer.evenNumbers(100, 120);
	 answer.oddNumbers(75, 100);

	}

	 public void evenNumbers(int x,int  y)
	 {
		 System.out.println("The even numbers from" +x+ "to " +y);
		 for (int i =x; i<=y; i++)
		 {
			 if (i%2 == 0)
			 {
				System.out.println(i);
			 }
				 
		 }
	 }
	public void oddNumbers(int x, int y)
	{
		System.out.println("The odd numbers from" +x+ "to " +y);
		for (int i=x ; i<=y; i++ )
		{
			if (i%2 !=0)
			{
				System.out.println(i);
			}
			}
		}
	}


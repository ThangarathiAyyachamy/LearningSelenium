package week2.day1;

public class FindOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxRange = 14;
		System.out.println("The odd numbers withing the given Range is:");
		for (int i=1;i<=maxRange;i++)
		{
			if (i%2 !=0) {
				System.out.println(i);
				
			}
		}

	}

}

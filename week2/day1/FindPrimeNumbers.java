package week2.day1;

public class FindPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 113;
      for (int i=2;i<=n-1;i++)
       {
	    if (n%i==0)
	    {
	    	System.out.println("The given number is not a prime number");
	    }
	    else 
	    {
	    	System.out.println("This given number is a prime number");
	    }
	   
	    }
       }
	}



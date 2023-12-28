package week2.day1;
import java.util.Arrays;

public class LearningArrayOperations {

	public static void main(String[] args) {
		LearningArrayOperations arrays = new LearningArrayOperations();
		arrays.findDuplicates();
		arrays.findMatch();
		arrays.findMissingElement();
	}
// Finding duplicate numbers in an Array//
// Sort the Array//
// condition should be Array length -1//
	public void findDuplicates()
	{
		int num[]= {2,5,7,7,5,9,2,9};
		Arrays.sort(num);
		System.out.println("The duplicate numbers are :");
		int length = num.length;
		for (int i =0;i<length-1;i++)
		{
			if(num[i]==num[i+1])
			{
				System.out.println(num[i]);
			}
		}
	}
	public void findMatch()
	
	{
		int a[] = {3,2,11,4,6,7};
		int b[] = {1,2,8,4,9,7};
		System.out.println("The common values in two arrays are: ");
		for(int i=0;i<a.length;i++)
		{
			for(int m=0;m<b.length;m++)
			{
				if(a[i]==b[m])
				{
					System.out.println(a[i]);
					
				}
			}
		}
		
	
	}
	public void findMissingElement()
	{
		int num[]= {1,4,3,2,8,6,7};
		Arrays.sort(num);
		for(int i = 0;i<num.length;i++)
		{
			if(num[i]!=i+1)
			{
				System.out.println("The missing number is :" +(i+1) );
				//To end the loop//
				break;
			}
		}
		
	}
		
	}


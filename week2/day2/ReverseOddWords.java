package week2.day2;

public class ReverseOddWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "I am a new software tester";
		String[] result =text.split("\\W+");
		//System.out.print(result.length);
		for(int i =0;i<result.length;i++)
		{
			if (i%2==1)
			{
				char[] wordArray = result[i].toCharArray();
				for(int j =(wordArray.length)-1;j>=0;j--)
				{
					System.out.print(wordArray[j]);
				}
			}else
			{
				System.out.print(" "+result[i]+" ");
				
			}
		}
		

	}

}

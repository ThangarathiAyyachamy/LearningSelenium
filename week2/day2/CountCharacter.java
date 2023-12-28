package week2.day2;

public class CountCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "TestLeaf";
		//char[] a = s.toCharArray();
		int count = 0;
		//char value = 'e';
		for(int i =0;i<s.length();i++)
		{
			if(s.charAt(i)=='e')
			{
				count++;				
		}			
		}
		System.out.print("The occurance of 'e' in the given word is: " +count);
	}

}

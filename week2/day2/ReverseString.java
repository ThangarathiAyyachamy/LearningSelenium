package week2.day2;

public class ReverseString {

	public static void main(String[] args) {
		
		String s = "Testleaf";
		int l = s.length();
		char[] textChar = s.toCharArray();
		for(int i=l-1;i>=0;i--)
		{
			System.out.print(textChar[i]);
		}
		

	}

}

package week2.day1;

public class SimpleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleArray classRoom = new SimpleArray();
		classRoom.printNames();
		classRoom.printRollNo();

	}

	public  void printNames()
	{
		String names[] = new String[5];
		names[0] = "Rathi";
		names[1] = "Rajan";
		names[2] = "Deeshu";
		names[3] = "Priya";
		names[4] = "Kishore";
		int length = names.length;
		System.out.println("Length of the array is: " +length);
		System.out.println("Name of the student is:");
		for(int i=0;i<=length-1;i++)
		{
			System.out.println(names[i]);
		}
	}
	public void printRollNo()
	{
		int number[]= {101,102,103,104,105};
		System.out.println("The roll number is :");
		for (int i=0;i<=number.length-1;i++)
		{
			System.out.println(number[i]);
			
		}
		
	}
}

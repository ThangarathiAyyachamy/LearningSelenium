package week2.day2;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn Java basics as part of java sessions in java week1";
        String[] text1 = text.split("\\W+");
        System.out.println(text1.length);
        int count=0;
        String result ="";
        //int l = text1[].length();
        for (int i =0; i<(text1.length)-1; i++) {
        	for (int j =1; i<text1.length-1;i++) {
        		if(text1[i].equals(text1[j]))
        				{
        			text1[i]=text1[i]+text1[j].replaceAll("[^0-9]", "");
        			count++;
        		}
        		
        	}
        	if(count!=0)
        	{
        	System.out.println("The modified sentence is" +text1[i]);
        }
        	else
        	{
        	System.out.println("There is no duplicate words in the sentence.");
        	}
	}

}
}


package week2.day2;

public class ChangeOddIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s = "changeme";
      char[] a = s.toCharArray();
      
      for(int i =0;i<=(s.length()-1);i++)
      {
    	 
    	  if (i%2==1)
    	  {
    		  a[i] = Character.toUpperCase(a[i]);
    	  }
    	  System.out.print(""+a[i]);
      }
      
      
	}
	}



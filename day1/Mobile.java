package week1.day1;

public class Mobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile First = new Mobile();
		First.makeCall();
		First.sendMsg();

	}
	  public void makeCall()
	  
	  {
		  String mobileModel = "Samsung S10";
		  Float mobileWeight = 250.50f;
		  System.out.println("My first mobile model is :" +mobileModel);
		  System.out.println("My mobile weight is :" +mobileWeight);
		  
	  }
	  
     public void sendMsg()
     {
    	 boolean isFullCharged = true;
    	 int mobileCost = 15000;
    	 System.out.println("My first mobile is fully charged :" +isFullCharged);
    	 System.out.println("My first mobile price is : " +mobileCost);	 
     }
}

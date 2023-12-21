package week1.day2;

public class Browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Browser launch = new Browser();
		
		launch.launchBrowser("launch");
		launch.loadUrl();

	}
	   public String launchBrowser(String browserName)
	   {
		    System.out.println("Browser launched successfully");
		    return browserName;
		
	   }
	   public void loadUrl() 
	   {
		    System.out.println("Application URL loaded successfully");
	    	
	   }
	

}

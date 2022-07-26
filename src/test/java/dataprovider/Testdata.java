package dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Guice;


public class Testdata {
	
	
	@DataProvider
	public static Object[][] loginData(){
		
		
		Object[][] tdata = {{"mngr425507","jahEjEt"}, {" ", "jahEjEt"}, {"mngr425507", " "}, {"iyuyiuyiy", "gjjgj"}, {" ", ""}};
		return tdata;
	}
	
	

}

package sprint;

import static org.junit.Assert.*;

import org.junit.Test;

public class Addresstest {
	AddressConsole ac1=new AddressConsole();
	@Test
	public void Testcity(){
		assertEquals(false,ac1.validateCity("gvhb123"));
	}
	public void Teststate(){
		assertEquals(false,ac1.validateState("74uttar pradesh"));
	}
	public void Testcountry(){
		assertEquals(false,ac1.validateCountry("india528"));
	}
	
	


}

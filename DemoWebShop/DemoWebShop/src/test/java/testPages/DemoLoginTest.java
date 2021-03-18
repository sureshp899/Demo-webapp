package testPages;



import java.io.IOException;

import org.testng.annotations.Test;
import pageObjects.LoginPage;

public class DemoLoginTest extends LoginPage {


	@Test
	public void validateOrderItem() throws InterruptedException, IOException {
		
		palcetheOrder();
	}

		
}
		


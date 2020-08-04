package testpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class Checkout {

	WebDriver driver;
	public Checkout(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy
	(how = How.CLASS_NAME, using = "action-block")
	WebElement Clickchkout;
	
	@FindBy
	(how = How.CLASS_NAME, using = "product-name")
	WebElement Productname;
	
	@FindBy
	(how = How.CLASS_NAME, using = "product-price")
	WebElement ProductPrice;
	
	@FindBy
	(how = How.CLASS_NAME, using = "amount")
	WebElement ProductAmount;
	
	@FindBy
	(how = How.CLASS_NAME, using = "quantity")
	WebElement ProdM;
	
	public void Proceed_Checkout() {
		Clickchkout.click();
	}
	
	public void Compare_Cart() {
		String Nameprod = Productname.getText();
		if(Nameprod == "Beetroot - 1 Kg") {
			Assert.assertSame(Nameprod, "Beetroot - 1 Kg");
		}
		else {
			Assert.assertNotSame(ProdM, "Beetroot - 1 Kg");
		}
	}

}

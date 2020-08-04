package testpages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class AddToCart {


	WebDriver driver;
	public AddToCart(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy
	(how = How.XPATH, using = "//button[text() = 'ADD TO CART']")
	WebElement Addbtn;
	
	@FindBy
	(how = How.CLASS_NAME, using = "cart-icon")
	WebElement cart;
	
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
	
	public void Addtocart() throws Exception {
		Addbtn.click();
		Thread.sleep(2000);
		cart.click();	
	}
	
	public void CompareCart() {
		String name = Productname.getText();
		Assert.assertEquals(name, "Beetroot - 1 Kg");
		if(name.equals("Beetroot - 1 Kg")) {
			System.out.println("Product name Correct!!: "+name);
		}else {
			System.out.println("Product name Wrong!!");
		}

		String nos = ProdM.getText();
		assertEquals("3 Nos.", nos);
		if(nos.equalsIgnoreCase("3 Nos.")) {
			System.out.println("Product Quantity is Correct!!: "+nos);
		}else {
			System.out.println("Product Quantity is Wrong!!");
		}
		
		String totalAmount = ProductAmount.getText();
		Assert.assertEquals("96", totalAmount);
		if(totalAmount.equalsIgnoreCase(totalAmount)) {
			System.out.println("Product Total is Perfact!!: "+totalAmount+ "Rs.");
		}else {
			System.out.println("Something wrong in Product Total!!");
		}
		
		String CartPro = Productname.getText();
		Assert.assertNotSame(Productname, CartPro);
		if(CartPro.equalsIgnoreCase("Beetroot - 1 Kg")) {
		System.out.println("Product Name Matched in cart : "+CartPro);
		}else {
			System.out.println("Product name does not matched in cart!!");
		}
	}
}

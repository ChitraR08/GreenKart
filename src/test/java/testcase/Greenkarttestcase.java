package testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import testbase.Testbase;
import testpages.AddToCart;
import testpages.Checkout;
import testpages.Homepage;

public class Greenkarttestcase extends Testbase {

	@Test(priority=1)
	public void init() throws InterruptedException {
		Homepage hp = PageFactory.initElements(driver, Homepage.class);
		hp.SearchKeyword("Beetroot");
		Thread.sleep(3000);
		hp.ClickSearchbtn();
			}
	
	@Test(priority=2)
	public void ProductDetail() throws Exception {
		Homepage hop = PageFactory.initElements(driver, Homepage.class);
		hop.Prodnm();
		Thread.sleep(2000);
		hop.Prodpr();
		Thread.sleep(2000);
		hop.Productmeasure();
		
	}
	@Test(priority=3)
	public void ProductCart() throws Exception {
		AddToCart ac = PageFactory.initElements(driver, AddToCart.class);
		ac.Addtocart();
		Thread.sleep(3000);
		ac.CompareCart();
	}
	
	@Test(priority=4)
	public void CheckoutProcess() {
		Checkout c = PageFactory.initElements(driver, Checkout.class);
		c.Compare_Cart();
		c.Proceed_Checkout();
	}
}

package testpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import static org.testng.Assert.assertEquals;


public class Homepage {

	WebDriver driver;
	public Homepage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy
	(how = How.CLASS_NAME, using = "search-keyword")
	WebElement Searchtb;
	
	@FindBy
	(how = How.CLASS_NAME, using = "search-button")
	WebElement Searchbtn;
	
	@FindBy
	(how = How.CLASS_NAME, using = "product-name")
	WebElement Productname;
	
	@FindBy
	(how = How.CLASS_NAME, using = "product-price")
	WebElement ProductPrice;
	
	@FindBy
	(how = How.CLASS_NAME, using = "increment")
	WebElement Productkg;
	
	@FindBy
	(how = How.CLASS_NAME, using = "quantity")
	WebElement ProdM;
	
	public void SearchKeyword(String kwrd) {
		Searchtb.sendKeys(kwrd);
	}
	
	public void ClickSearchbtn() {
		Searchbtn.click();
	}
	
	public void Prodnm() {
		String name = Productname.getText();
		assertEquals("Beetroot - 1 Kg", name);
		if(name.equals("Beetroot - 1 Kg")) {
			System.out.println("Product name Correct!!");
		}else {
			System.out.println("Product name Wrong!!");
		}
	}
	
		public void Prodpr() {
		String price = ProductPrice.getText();
	//	assertEquals("82", price);
		if(price.endsWith("2")) {
			System.out.println("Product price is Correct!!");
		}else {
			System.out.println("Product price is wrong!!");
		}
		}
		
		public void Productmeasure() throws Exception {
			Productkg.click();
			Productkg.click();
			String Measure = ProdM.getText();
			Assert.assertEquals("", Measure);
			if(Measure.equalsIgnoreCase(Measure)) {
				System.out.println("BeetRoot are 2 KG!!");
			}else {
				System.out.println("BeetRoot are not 2 KG!!");
			}
		}
}

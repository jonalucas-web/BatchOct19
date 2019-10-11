package project1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage extends basepage {

		@FindBy(xpath ="//*[@id=\"block_top_menu\"]/ul/li[1]/a")
		private WebElement WOMEN;
		@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[2]/a")
		private WebElement DRESSES;
		@FindBy (xpath="//*[@id=\"block_top_menu\"]/ul/li[3]/a")
		private WebElement SHIRTS;
		@FindBy (xpath="////*[@id=\"center_column\"]/h1/span[2]")
		private WebElement PRODUCTS;
		@FindBy (xpath="//*[@id=\"layered_form\"]/div/div[2]/div/span]")
		private WebElement SIZE;
		@FindBy (xpath="//*[@id=\"layered_id_attribute_group_1\"]")
		private WebElement S;
		
public homepage() {
	PageFactory.initElements(driver, this);
}
public WebElement WOMEN() {
	WOMEN.click();
return WOMEN;
}
public WebElement DRESSES() {
	
	return DRESSES;
}
public WebElement SHIRTS() {
	
	return SHIRTS;
}
	public WebElement PRODUCTS() {
		return PRODUCTS;
}
	public WebElement SIZE() {
		SIZE.click();
		return SIZE;
		
}
	public WebElement S() {
		S.click();
		return S;
}
	
		
	}

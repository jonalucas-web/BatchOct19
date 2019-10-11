package testproject1;

import org.testng.annotations.Test;

import junit.framework.Assert;
import project1.basepage;
import project1.homepage;

public class hometest {
homepage hp;
basepage bp;

public hometest() {
	hp=new homepage();
	bp=new basepage();
}
@Test(priority = 1)
public void WOMEN() {
	Assert.assertTrue(hp.WOMEN().isDisplayed());
}
@Test(dependsOnMethods={"SHIRTS"} )
public void DRESSES() {
	Assert.assertTrue(hp.DRESSES().isDisplayed());
}
@Test
public void SHIRTS() {
	Assert.assertTrue(hp.SHIRTS().isDisplayed());
}
@Test
public void PRODUCTS() {
Assert.assertTrue(hp.PRODUCTS().isDisplayed());
}
@Test
public void SIZE() {
Assert.assertTrue(hp.SIZE().isDisplayed());
}
@Test
public void S() {
Assert.assertTrue(hp.S().isDisplayed());
}
}

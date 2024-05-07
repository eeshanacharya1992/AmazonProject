package amazonMiniProject22;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Scenario1 extends LaunchQuit {
	 
	@Test
     public void amazonlogin() throws InterruptedException
     { 
		  // a1.get("https://www.google.com");
 		a1.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26ext_vrnc%3Dhi%26tag%3Dgooghydrabk1-21%26ref%3Dnav_custrec_signin%26adgrpid%3D58355126069%26hvpone%3D%26hvptwo%3D%26hvadid%3D610644601173%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D7822557962814458130%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D1007799%26hvtargid%3Dkwd-10573980%26hydadcr%3D14453_2316415&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
	  
 		a1.findElement(By.id("ap_email")).sendKeys(Value1);
 	    a1.findElement(By.id("continue")).click();
 	 
 	    a1.findElement(By.id("ap_password")).sendKeys(Value2);
 	  
 	    a1.findElement(By.id("signInSubmit")).click();
 	  
 	   a1.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("shoe");
		a1.findElement(By.xpath("//input[@id=\'nav-search-submit-button']")).click();
		a1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		a1.findElement(By.xpath("(//img[@class='s-image'])[35]")).click(); 
	    Thread.sleep(2000);
       Set<String> pandc= a1.getWindowHandles();
       System.out.println(pandc);
       Iterator<String> pc= pandc.iterator();
   String p =    pc.next();
   System.out.println(p);
   String c=     pc.next();
   System.out.println(c);
	a1.switchTo().window(c);
	a1.findElement(By.xpath("//input [@id='add-to-cart-button']")).click();
	a1.findElement(By.name("proceedToRetailCheckout")).click();

	a1.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
a1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  
a1.findElement(By.xpath("(//input[@name='ppw-instrumentRowSelection'])[1]")).click();

a1.findElement(By.xpath("(//a[@class='a-link-emphasis pmts-add-cc-default-trigger-link'])[1]")).click();
a1.switchTo().frame(a1.findElement(By.name("ApxSecureIframe")));
  a1.findElement(By.name("addCreditCardNumber")).sendKeys("1234");
      }
}


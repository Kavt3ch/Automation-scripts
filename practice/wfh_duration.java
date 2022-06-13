package practice;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class wfh_duration {

	static String extracted;
	public static void main(String[]args) throws Exception{
		
		System.out.println("Please Enter the date to apply WFH");
		Scanner sc= new Scanner(System.in);
		String date= sc.next();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kavya.h\\Downloads\\chromedriver_win32\\chromedriver.exe");;
		ChromeDriver d= new ChromeDriver();
		
		d.get("https://www.keka.com");
	
		d.manage().window().maximize();
		
d.findElement(By.linkText("login")).click(); 
		
		d.findElement(By.id("email")).sendKeys("kavya.h@technovert.com");
		d.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		
		d.findElement(By.tagName("button")).click();
		
		Thread.sleep(5000);
		
		d.findElement(By.cssSelector("#i0118")).sendKeys("Kavyt3ch");
		
		 d.findElement(By.id("idSIButton9")).click();
		 d.findElement(By.id("idSIButton9")).click();
		 
		 Thread.sleep(5000);

 WebElement me= d.findElement(By.xpath("//a[@href='/#/me/leave']"));
 me.click();
 
d.findElement(By.linkText("Attendance")).click();
Thread.sleep(3000);


d.findElement(By.xpath("//a[contains(text(),'Work From Home')]")).click();
	d.findElement(By.className("start-date")).click();
	Thread.sleep(3000);
	
	for (int i=2; i<=6; i++) {
		for (int j=1; j<=7;j++) {
			
		extracted=	d.findElement(By.xpath("//tbody/tr["+i+"]/td["+j+"]")).getText();
		if(extracted.contentEquals(date))	{
			d.findElement(By.xpath("//tbody/tr["+i+"]/td["+j+"]")).click();
			d.findElement(By.xpath("//tbody/tr["+i+"]/td["+j+"]")).click();
			d.findElement(By.tagName("textArea")).sendKeys("wfh");
			d.findElement(By.xpath("//button[contains(text(),'Request')]")).click();
			System.out.println("Hola! WFH is applied successfully for chosen date");
			//d.close();
		}
		}
		
	}
	
	}
}

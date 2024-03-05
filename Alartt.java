package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alartt {
	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
	
		WebElement simple = driver.findElement(By.xpath("//a[@class='analystic']"));
		simple.click();
		
		WebElement con = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		con.click();
		
		Alert a = driver.switchTo().alert();
		a.accept();
		
		driver.findElement(By.xpath("(//a[@class=\"analystic\"])[2]")).click();
		driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
		Thread.sleep(2000);
		
		a.dismiss();
		
		driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
		driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
		
		String s = a.getText();
		System.out.println(s);
		Thread.sleep(2000);
		a.accept();
		
	}

}

package WebTable;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import java.text.NumberFormat;


public class Sorting {
    public static void main(String[] args) throws ParseException {
    	WebDriver wd;
		System.setProperty("webdriver.chrome.driver","D://Selenium Prerequisite//chromedriver.exe");
		 wd= new ChromeDriver();
		 wd.get("https://www.w3schools.com/html/html_tables.asp"); 
		 
		 ArrayList<String> obtainedList = new ArrayList<String>(); 
		 List<WebElement> elementList= wd.findElements(By.xpath("//*[@id='customers']/tbody/tr/td[3]"));
		 for(WebElement we:elementList){
		    obtainedList.add(we.getText());
		 }
		 
		 ArrayList<String> sortedList = new ArrayList<String>();   
		 for(String s:obtainedList){
		 sortedList.add(s);
		 }
		 Collections.sort(sortedList);
		 System.out.println("\n After Sorting:" +sortedList);

		 Assert.assertTrue(sortedList.equals(obtainedList),"PASS");
		 
    }
	        
    
}
package WebTable;
import java.text.ParseException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.text.NumberFormat;


public class MaxFromTable {
    public static void main(String[] args) throws ParseException {
    	WebDriver wd;
		System.setProperty("webdriver.chrome.driver","D://Selenium Prerequisite//chromedriver.exe");
		 wd= new ChromeDriver();
		 wd.get("https://www.w3schools.com/html/html_tables.asp"); 
		 String maxvalue;
	     double m=0,r=0;
		 
	       //No. of Columns
	        List  col = wd.findElements(By.xpath("//*[@id='customers']/tbody/tr/th"));
	        System.out.println("Total No of columns are : " +col.size());
	        //No.of rows
	        List  rows = wd.findElements(By.xpath ("//*[@id='customers']/tbody/tr/td"));
	        System.out.println("Total No of rows are : " + rows.size());
	        int tablesize = rows.size()-1;
	        for (int i =1; i<rows.size();i++)
	        {    
	            maxvalue= wd.findElement(By.xpath("//*[@id='customers']/tbody/tr["+(i+1)+"]/td[2]")).getText();
	            if(maxvalue.contains("Francisco Chang")){
	            	System.out.println("PASS");
	            }
	        }
	        wd.close();
    }
	        
    
}
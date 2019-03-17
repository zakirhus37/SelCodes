package WebTable;


import java.text.ParseException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class RowColumn {
	
	
	public static void main(String[] args) throws ParseException {
      
	  WebDriver wd;
	  System.setProperty("webdriver.chrome.driver","D://Selenium Prerequisite//chromedriver.exe");
	  wd= new ChromeDriver();
      wd.get("http://demo.guru99.com/test/web-table-element.php");   
      
      //No.of Columns
      List  col = wd.findElements(By.xpath(".//*[@id='leftcontainer']/table/thead/tr/th"));
      System.out.println("No of cols are : " +col.size()); 
      
      //No.of rows 
      List  rows = wd.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]")); 
      System.out.println("No of rows are : " + rows.size());
      
      
      	// WebElement baseTable = wd.findElement(By.tagName("table"));
	  
		 //To find third row of table
		 WebElement tableRow = wd.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]"));
		 String rowtext = tableRow.getText();
		 System.out.println("Third row of table : "+rowtext);
		    
		    //to get 3rd row's 2nd column data
		    WebElement cellIneed = wd.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]/td[2]"));
		    String valueIneed = cellIneed.getText();
		    System.out.println("Cell value is : " + valueIneed); 
      wd.close();
    }
	
	

}

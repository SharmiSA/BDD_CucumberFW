package RobotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile_RobotClass 
{
	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/upload/");
		String path="C:\\Users\\smaha\\Documents\\Maven.docx";
		driver.findElement(By.name("uploadfile_0")).click();
		Thread.sleep(2000);
		Robot robot = new Robot();
		robot.setAutoDelay(3000);
		StringSelection selection = new StringSelection(path);
		Toolkit.getDefaultToolkit().getSystemClipboard()
		.setContents(selection, null);
		// press ctrl+vsss
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.setAutoDelay(3000);
		// release ctrl+v
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		// press enter
		robot.setAutoDelay(3000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

}

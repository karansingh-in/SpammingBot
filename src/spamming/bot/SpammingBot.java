//package owned by twitter.com/karansingh_ind
package spamming.bot;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Scanner;
 
public class SpammingBot {
 
	public static void main(String[] args) throws AWTException, InterruptedException {
		int x = 1;
 
		Robot robot = new Robot();
		Scanner sc = new Scanner(System.in);
                
                System.out.println("Welcome to the terminal of SpammingBot");
		System.out.println("Enter the message you want to spam:");
		String Text = sc.nextLine();
 
		StringSelection stringSelection = new StringSelection(Text);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
 
		System.out.println("The spamming will start in 5 seconds");
		Thread.sleep(5000);
 
		while(x <= 100) {
 
			Thread.sleep(1000);
 
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
 
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
 
		x++;
 
		}
 
	}
 
}
 
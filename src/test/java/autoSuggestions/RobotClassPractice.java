package autoSuggestions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class RobotClassPractice {

	public static void main(String[] args) throws AWTException {
		
		//Create object of Robot Class
		
		Robot r = new Robot();
		
		//type Hello
		
		r.keyPress(KeyEvent.VK_CAPS_LOCK);
		r.keyRelease(KeyEvent.VK_CAPS_LOCK);

		r.keyPress(KeyEvent.VK_H);
		r.keyRelease(KeyEvent.VK_H);
		
		r.keyPress(KeyEvent.VK_E);
		r.keyRelease(KeyEvent.VK_E);
		
		System.out.println("Executed");
					
		
	}

}

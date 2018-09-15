package com.accenture.robotclass;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class RobotDemo {

	    public static void main(String[] args) throws IOException,
	                           AWTException, InterruptedException
	    {
	        String command = "notepad.exe";
	        Runtime run = Runtime.getRuntime();
	        run.exec(command);
	        try {
	            Thread.sleep(2000);
	        }
	        catch (InterruptedException e)
	        {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	 
	        // Create an instance of Robot class
	        Robot robot = new Robot();
	 
	        // Press keys using robot. A gap of
	        // of 500 mili seconds is added after
	        // every key press
	        robot.keyPress(KeyEvent.VK_H);
	        Thread.sleep(500);
	        robot.keyPress(KeyEvent.VK_E);
	        Thread.sleep(500);
	        robot.keyPress(KeyEvent.VK_L);
	        Thread.sleep(500);
	        robot.keyPress(KeyEvent.VK_L);
	        Thread.sleep(500);
	        robot.keyPress(KeyEvent.VK_O);
	        Thread.sleep(500);
	        robot.keyPress(KeyEvent.VK_SPACE);
	        Thread.sleep(500);
	        robot.keyPress(KeyEvent.VK_F);
	        Thread.sleep(500);
	        robot.keyPress(KeyEvent.VK_R);
	        Thread.sleep(500);
	        robot.keyPress(KeyEvent.VK_O);
	        Thread.sleep(500);
	        robot.keyPress(KeyEvent.VK_M);
	        Thread.sleep(500);
	        robot.keyPress(KeyEvent.VK_SPACE);
	        Thread.sleep(500);
	        robot.keyPress(KeyEvent.VK_G);
	        Thread.sleep(500);
	        robot.keyPress(KeyEvent.VK_E);
	        Thread.sleep(500);
	        robot.keyPress(KeyEvent.VK_E);
	        Thread.sleep(500);
	        robot.keyPress(KeyEvent.VK_K);
	        Thread.sleep(500);
	        robot.keyPress(KeyEvent.VK_S);
	        Thread.sleep(500);
	        robot.keyPress(KeyEvent.VK_F);
	        Thread.sleep(500);
	        robot.keyPress(KeyEvent.VK_O);
	        Thread.sleep(500);
	        robot.keyPress(KeyEvent.VK_R);
	        Thread.sleep(500);
	        robot.keyPress(KeyEvent.VK_G);
	        Thread.sleep(500);
	        robot.keyPress(KeyEvent.VK_E);
	        Thread.sleep(500);
	        robot.keyPress(KeyEvent.VK_E);
	        Thread.sleep(500);
	        robot.keyPress(KeyEvent.VK_K);
	        Thread.sleep(500);
	        robot.keyPress(KeyEvent.VK_S);
	    }
	}


class Main {
  public static void main(String[] argv) throws Exception {
    Robot robot = new Robot();
    int x = 100;
    int y = 100;
    int width = 200;
    int height = 200;
    Rectangle area = new Rectangle(x, y, width, height);
    BufferedImage bufferedImage = robot.createScreenCapture(area);
    
    bufferedImage = robot.createScreenCapture(area);
    File file = new File("area.jpg");
    ImageIO.write(bufferedImage, "jpg", file);

    // Capture the whole screen
    area = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
    bufferedImage = robot.createScreenCapture(area);
    File file1 = new File("screencapture.jpg");
    ImageIO.write(bufferedImage, "jpg", file1);
  
  }
}
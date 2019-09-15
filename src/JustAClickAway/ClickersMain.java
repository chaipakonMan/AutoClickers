/**
 * ClickersMain will act as a driver
 * 
 * @author Chaipakon Luangprasert
 * @version August 2019
 */
package JustAClickAway;

import java.awt.event.InputEvent;
import java.lang.Thread;
import java.util.Scanner;
import java.awt.event.KeyEvent;

public class ClickersMain {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.println("----AutoClicker----");
        //getting User input
        System.out.println("Number of clicks: ");
        int clicks = scan.nextInt();

        System.out.println("Enter delay in MS: ");
        int dela = scan.nextInt();

        System.out.println("Want to hold control? Yes or No");
        String check = scan.next();

        System.out.println();

        // starting the clicks
        System.out.println("Program will start in 3 seconds.");

        try {
            Thread.sleep(3000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        // creating mouse and keyboard
        Keyboard key = new Keyboard();
        Mouse mou = new Mouse(dela);
        
        // hold a key if user want it
        if (check.equals("Yes")) {
            System.out.println("I'm Holding the key!");
            key.press(KeyEvent.VK_CONTROL);
        }

        // clicks
        for (int i = 0; i < clicks; i++) {
            mou.clicks(InputEvent.BUTTON1_DOWN_MASK);
        }

        if(check.equals("Yes")) {
            key.release(KeyEvent.VK_CONTROL);
            System.out.println("I'm letting the key go!");
        }
        
        
        System.out.println();
        
        System.out.println("AutoClicker DONE!");

    }

}

/**
 * Keyboard class will be an object keyboard created from robot class
 * @author Chaipakon Luangprasert
 * @version August 2019
 */
package JustAClickAway;

import java.awt.AWTException;
import java.awt.Robot;

public class Keyboard {

    private Robot keyboard;


    /**
     * initialize the keyboard and delay time
     * 
     * @param de
     *            delay between clicks in MS
     */
    public Keyboard() {

        try {
            keyboard = new Robot();
        }
        catch (AWTException e) {
            e.printStackTrace();
        }

    }


    /**
     * will press on the given button
     * 
     * @param button
     *            a button to be press
     */
    public void press(int button) {
        try {
            keyboard.keyPress(button);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }


    /**
     * will release on the given button
     * 
     * @param button
     *            a button to be press
     */
    public void release(int button) {
        try {
            keyboard.keyRelease(button);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

}

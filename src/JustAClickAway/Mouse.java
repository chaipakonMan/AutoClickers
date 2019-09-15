/**
 * Mouse class will be an object mouse, created from robot class
 * @author Chaipakon Luangprasert
 * @version August 2019
 */
package JustAClickAway;

import java.awt.AWTException;
import java.awt.Robot;

public class Mouse {

    private Robot mouse; // create a mouse as a robot object
    private int delayM; // in MS


    /**
     * initialize the mouse and delay time
     * 
     * @param de
     *            delay between clicks in MS
     */
    public Mouse(int de) {
        delayM = de;

        try {
            mouse = new Robot();
        }
        catch (AWTException e) {
            e.printStackTrace();
        }

    }


    /**
     * will click on the given button
     * 
     * @param button
     *            a button to be clicks
     */
    public void clicks(int button) {
        try {
            mouse.mousePress(button);
            mouse.mouseRelease(button);
            mouse.delay(delayM);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }


    /**
     * will move mouse cursor to the given coordinate
     * 
     * @param x
     *            x-coordinate
     * @param y
     *            y-coordinate
     */
    public void setCoordinates(int x, int y) {
        mouse.mouseMove(x, y);
    }

}

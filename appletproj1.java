import java.applet.*;
import java.awt.*;

public class appletproj1 extends Applet {

    public void paint(Graphics g) {
        Font font = new Font("monospaced", Font.BOLD, 10);
        g.setColor(Color.red);
        g.drawRect(100, 100, 250, 200);
        g.setColor(Color.yellow);
        g.fillRect(101, 101, 249, 199);
        g.setColor(Color.black);
g.setFont(font);
        g.drawString("NAME: SHAQUIB HUSSAIN", 150, 150);
        g.drawString("COURSE: M.C.A", 150, 170);
        g.drawString("COLLEGE: K.N.I.T , SULTANPUR", 150, 190);
        g.drawString("ID: 22752", 150, 210);

    }

    public static void main(String[] args) {
        // Create an instance of the applet
        appletproj1 applet = new appletproj1();

        // Create a frame to contain the applet
        javax.swing.JFrame frame = new javax.swing.JFrame("info. viewer");

        // Add the applet to the frame
        frame.getContentPane().add(applet);

        // Set the frame size
        frame.setSize(500, 700);

        // Set the frame to be visible
        frame.setVisible(true);
    }
}
/*
 * <applet code="appletproj1.class" width="300" height="300">
 * </applet>
 */
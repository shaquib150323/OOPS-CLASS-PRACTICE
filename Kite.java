import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JApplet;

public class Kite extends JApplet {
    public void paint(Graphics g) {
        // Set the background color
        setBackground(Color.white);

        // Set the border color and draw the kite shape
        g.setColor(Color.black);
        g.drawLine(150, 100, 250, 250); // right top line
        g.drawLine(250, 250, 150, 450); // bottom right line
        g.drawLine(150, 450, 50, 250); // bottom left line
        g.drawLine(50, 250, 150, 100); // right left line
        g.drawLine(150, 100, 150, 450); // vertical line
        g.drawLine(50, 250, 250, 250); // horizontal line
        // drawing tail
        g.drawLine(150, 450, 200, 500); // tail right
        g.drawLine(150, 450, 100, 500);  // tail left
        g.drawLine(100, 500, 200, 500);   // tail bottom


    }

    public static void main(String[] args) {
        // Create an instance of the applet
        Kite applet = new Kite();

        // Create a frame to contain the applet
        javax.swing.JFrame frame = new javax.swing.JFrame("Kite Applet");

        // Add the applet to the frame
        frame.getContentPane().add(applet);

        // Set the frame size
        frame.setSize(500, 700);

        // Set the frame to be visible
        frame.setVisible(true);
    }
}

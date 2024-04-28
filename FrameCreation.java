import java.awt.*;
import java.awt.event.*;

public class FrameCreation {
    public FrameCreation() {
        Frame frame = new Frame("The Quest For Pure!");
        Label label = new Label("The Quest For Pure!");
        label.setAlignment(Label.CENTER);

        MyCanvas canvas = new MyCanvas(); // Create an instance of MyCanvas
        frame.add(label);
        frame.add(canvas);
        frame.setSize(500, 500);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // Add a key listener to the canvas
        canvas.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                canvas.handleKeyPress(e); // Delegate key handling to MyCanvas
            }
        });

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new FrameCreation();
    }
}

class MyCanvas extends Canvas {
    private int rectX = 0;
    private int rectY = 0;

    public MyCanvas() {
        setBackground(Color.LIGHT_GRAY);
        setSize(500, 500); // Set the canvas size
        setFocusable(true); // Enable keyboard focus
    }

    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.fillRect(rectX, rectY, 50, 50);
    }

    public void moveRectangle(int dx, int dy) {
        rectX += dx;
        rectY += dy;
        repaint(); // Redraw the canvas
    }

    // Handle key events
    public void handleKeyPress(KeyEvent e) {
        int keyCode = e.getKeyCode();
        if (keyCode == KeyEvent.VK_UP) {
            moveRectangle(0, -10); // Move up
        } else if (keyCode == KeyEvent.VK_DOWN) {
            moveRectangle(0, 10); // Move down
        } else if (keyCode == KeyEvent.VK_LEFT) {
            moveRectangle(-10, 0); // Move left
        } else if (keyCode == KeyEvent.VK_RIGHT) {
            moveRectangle(10, 0); // Move right
        }
    }
}

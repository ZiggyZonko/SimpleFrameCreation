# 🎨 SimpleFrameCreation

**🌲What Was Used**
This SimpleFrameCreation Systen uses the Java AWT built in library to create a window to display graphics on.

**📖What Does It Do**
This Project Creates a Window and adds and canvas the size of the screen which is light gray. Then Draws a Red Box which you can move with the Arrow Keys.
The Arrow Keys Movement works by adding in KeyListener Functions and looking out for a pressed arrow keys. Then the Code adds 10 onto the variable that makes the square move.

This is the Code Here...

```
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
```

👋Thanks For Stopping by to see my new Project!👋

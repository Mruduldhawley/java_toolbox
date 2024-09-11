//Prog to display Event habling in java

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class event extends Applet implements KeyListener
{
String msg="";
int x=10,y=10;
public void init()
{
addkeyListener(this);
requestFocus();
}
public void keyPressed(KeyEvent ke)
{
showStatus("Key is pressed");
}
public void keyReleased(KeyEvent ke)
{
showStatus("Key is released");
}
public void keyTyped(KeyEvent ke)
{
msg+=ke.getKeyChar();
}
}
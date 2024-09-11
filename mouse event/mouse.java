import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class mouse extends JApplet implements MouseListener
{
JLabel l;
public void init()
{
Container cp=getContentPane();
l=new JLabel("Mrudul",JLabel.LEFT);
cp.add(l);
addMouseListener(this);
requestFocus();
}
public void mouseClicked(MouseEvent e){
l.setText("Mouse Clicked");
}
public void mouseEntered(MouseEvent e){
l.setText("Mouse Entered");
}
public void mouseExited(MouseEvent e){
l.setText("Mouse Exited");
}
public void mousePressed(MouseEvent e){
l.setText("Mouse Pressed");
}
public void mouseReleased(MouseEvent e){
l.setText("Mouse Released");
}
}
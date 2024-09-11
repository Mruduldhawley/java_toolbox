//USR OF CHECKBOX USING SWING

// checkbox using swing

import java.awt.*;
import javax.swing.*;

public class CheckBox extends JApplet
{
JCheckBox cb,cb2,cb3;
public void init()
{
Container cp=getContentPane();

cp.setLayout(new FlowLayout());
cb=new JCheckBox("C");
cb2= new JCheckBox("C++");
cb3=new JCheckBox("java");


cp.add(cb);
cp.add(cb2);
cp.add(cb3);
}
}
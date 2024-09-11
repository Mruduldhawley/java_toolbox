//Label using swing

import java.awt.*;
import javax.swing.*;
public class Label extends JApplet
{
public void init()
	{
	Container cp=getContentPane();//brings the layout over the we
	
		//can display a swing content

	JLabel jl=new JLabel("Mrudul",JLabel.RIGHT);
	cp.add(jl);
	}
}
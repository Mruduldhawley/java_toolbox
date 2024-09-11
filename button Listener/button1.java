    import java.awt.*; 
    import javax.swing.*; 
    import java.awt.event.*;  
    public class button1 extends JApplet implements ActionListener
    {  
        
        JButton b; 
        public void init()
            {                          
              
            Container cp=getContentPane();
            
             
              b=new JButton("Click");
              b.setSize(100, 100);
              cp.add(b);
              b.addActionListener(this);
    
            }

   
public void actionPerformed(ActionEvent e) {
                
                
                 showStatus("Button is pressed");
                 b.setBackground(Color.GREEN);
                
        }
       
    }  
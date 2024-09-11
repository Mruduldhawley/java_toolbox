import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;


public class AppletDemo extends Applet implements ActionListener
{
    String databaseUsername = "";
    String databasePassword = "";
    TextField t1,t2;
    Label l1,l2,l3;
    Button b1;

 public static int i=0;
    
    public void init(){
        l1=new Label("Enter username:");
        t1=new TextField(20);
        add(l1);
        add(t1);
	String u=t1.getText(); 
        
        l2=new Label("Enter Password");
        t2=new TextField(20);
        add(l2);
        add(t2);
        String p=t2.getText(); 

        b1=new Button("LogIn");
        add(b1);
        
        b1.addActionListener(this);
        l3=new Label("Plesase Login");
        add(l3);

    Statement stmt = connection.createStatement();
    String SQL = "SELECT * FROM users WHERE users_name='" + name + "' && users_password='" + password+ "'";

    ResultSet rs = stmt.executeQuery(SQL);

	        // Check Username and Password
    while (rs.next()) {
        databaseUsername = rs.getString("users_name");
        databasePassword = rs.getString("users_password");
    }

    	

        if (u.equals(databaseUsername) && p.equals(databasePassword)) {
        i=i+1; 
	}
    else {
        System.out.println("Incorrect Password\n----");
    }

}
  
 public void actionPerformed(ActionEvent event)
{if(event.getSource()==b1){
	if(i>0){l3.setText("Login SucessFull");
 	i=0;	}

}
}}

 

        
        
    
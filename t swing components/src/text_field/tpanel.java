package text_field;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class tpanel extends JPanel{
	
	public JTextField tf,tf2;
	
	public tpanel() {
		super();
		setSize( 300, 300 );
		
		
		tf = new JTextField(16);
		tf2 = new JTextField(6);
		tf2.setText("bla");//set defult text
		
		add(tf);
		add(tf2);
	}//end constructor 
}//end tpanel

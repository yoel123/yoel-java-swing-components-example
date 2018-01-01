package batton;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

public class bpanel extends JPanel{
	
	//Declare btn
	public JButton mybtn;
	
	public bpanel() {
		super();
		setSize( 300, 300 );
		setBackground(Color.DARK_GRAY);
		
		//instantiate btn
	    mybtn = new JButton("my btn");
		//add btn to panel
		add(mybtn);
		
	}//end constructor
}

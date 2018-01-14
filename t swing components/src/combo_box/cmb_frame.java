package combo_box;

import java.awt.HeadlessException;

import javax.swing.JFrame;

import chackbox.cbpanel;

public class cmb_frame extends JFrame {

	public cmb_frame(String title,int w,int h) throws HeadlessException 
	{
		super(title);
		setSize( w,h);
		
		//close window when user clicks the x
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		
		//add panel to window
		add(new cmbpanel());
		
	}//end constructor
	
	public void yshow()
	{
		//show window
		setVisible( true );
	}//end show
}

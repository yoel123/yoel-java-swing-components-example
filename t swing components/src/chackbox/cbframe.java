package chackbox;
import java.awt.HeadlessException;

import javax.swing.JFrame;

import panel.ypanel;

public class cbframe extends JFrame{


	public cbframe(String title,int w,int h) throws HeadlessException 
	{
		super(title);
		setSize( w,h);
		
		//close window when user clicks the x
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		
		//add panel to window
		add(new cbpanel());
		
	}//end constructor
	
	public void yshow()
	{
		//show window
		setVisible( true );
	}//end show

}

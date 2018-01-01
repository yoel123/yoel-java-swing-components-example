package panel;

import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import javax.swing.JFrame;

public class pframe extends JFrame
{


	public pframe(String title,int w,int h) throws HeadlessException 
	{
		super(title);
		setSize( w,h);
		
		//close window when user clicks the x
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		
		//add panel to window
		add(new ypanel());
		
	}//end constructor
	
	public void yshow()
	{
		//show window
		setVisible( true );
	}//end show

}//end pframe

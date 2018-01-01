package radio_btns;

import java.awt.HeadlessException;

import javax.swing.JFrame;

import panel.ypanel;

public class rframe  extends JFrame{

	public rframe(String title,int w,int h) throws HeadlessException 
	{
		super(title);
		setSize( w,h);
		
		//close window when user clicks the x
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		
		add(new rpanel());
		
	}//end constructor
	
	public void yshow()
	{
		//show window
		setVisible( true );
	}//end show
}

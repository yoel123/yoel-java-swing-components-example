package label;

import java.awt.HeadlessException;

import javax.swing.JFrame;

import panel.ypanel;

public class lframe  extends JFrame{

	public lpanel lp;
	public lframe(String title,int w,int h) throws HeadlessException 
	{
		super(title);
		setSize( w,h);
		
		//close window when user clicks the x
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		
		lp = new lpanel();
		
		add(lp);
		
	}//end constructor
	
	public void yshow()
	{
		//show window
		setVisible( true );
	}//end show
}

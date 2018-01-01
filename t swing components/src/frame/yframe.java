package frame;

import java.awt.HeadlessException;

import javax.swing.JFrame;

public class yframe extends JFrame 
{

	public yframe(String title) throws HeadlessException 
	{
		super(title);
		setSize( 350, 100 );
		init();
		    
	}//end constructor
	
	public yframe(String title,int w,int h) throws HeadlessException 
	{
		super(title);
		setSize( w,h);
		init();
		    
	}//end constructor
	
	public void init() 
	{
		//close window when user clicks the x
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		
		//show window
		setVisible( true );
	}//end init

}//end yframe

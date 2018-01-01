package text_field;

import java.awt.HeadlessException;

import javax.swing.JFrame;

import panel.ypanel;

public class tframe extends JFrame{
	
	public tpanel tp;
	
	public tframe(String title,int w,int h) throws HeadlessException 
	{
		super(title);
		setSize( w,h);
		
		//close window when user clicks the x
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		tp = new tpanel();
		add(tp);
		
	}//end constructor
	
	public void yshow()
	{
		//show window
		setVisible( true );
	}//end show
}

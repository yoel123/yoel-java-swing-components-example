package batton;

import java.awt.HeadlessException;

import javax.swing.JFrame;

import panel.ypanel;

public class bframe extends JFrame{
	
	public bpanel bpnl;
	public bframe(String title,int w,int h) throws HeadlessException 
	{
		super(title);
		setSize( w,h);
		
		//close window when user clicks the x
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		
		//instantiate bpanel and add it to frame
		bpnl = new bpanel();
		add(bpnl);
		
	}//end constructor
	
	public void yshow()
	{
		//show window
		setVisible( true );
	}//end show
	
}//end bframe

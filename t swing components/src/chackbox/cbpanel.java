package chackbox;

import javax.swing.JCheckBox;
import javax.swing.JPanel;

public class cbpanel extends JPanel {

	public JCheckBox has_insurence,do_like_shnitzel;
	public cbpanel() 
	{
		super();
		
		has_insurence = new JCheckBox("do you have insurence?");
		
		do_like_shnitzel = new JCheckBox("do you like to eat shnitzel?");
		do_like_shnitzel.setSelected(true);
		
		add(has_insurence);
		add(do_like_shnitzel);
		
		
	}//end constructor

}

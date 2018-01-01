package radio_btns;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;

public class rpanel extends JPanel{
	
	public JRadioButton[] rs;
	public String[] rs_s = {"radio 1","some option","bla bla" ,"lorem ipsum"};
	public ButtonGroup r_group;
	
	public JRadioButton[] m_f;
	public String[] m_f_s = {"male","female"};
	public ButtonGroup m_f_s_g;
	
	public rpanel() 
	{
		super();
		setSize( 300, 300 );
		
		//first redio btns group
		r_group = new ButtonGroup();
		rs = create_radio_btns(rs_s,r_group);
		add_radio_btns(rs) ;
		
		//seprator line
		JSeparator sep =new JSeparator();
		sep.setPreferredSize(new Dimension(150,1));
		add(sep);
		
		//second redio btns group
		m_f_s_g = new ButtonGroup();
		m_f = create_radio_btns(m_f_s,m_f_s_g);
		add_radio_btns(m_f) ;
		
	}//end constructor
	
	public JRadioButton [] create_radio_btns(String[] sr , ButtonGroup btng) 
	{
		//create itreator
		int i = 0;
		//instantiate/reset JRadioButton array and set its size
		//to sr length (sr holds all the label strings)
		JRadioButton[] rs_r = new JRadioButton[sr.length];		
		
		//for each sr as r
		for(String r : sr) 
		{
			//instantiate each redio btn
			rs_r[i] = new JRadioButton(r);
			
			//add it to group
			btng.add(rs_r[i]);
			
			i++;//incrament itrator
		}//end for
		
		//set first one to checked
		rs_r[0].setSelected(true);
		
		return rs_r;
		
	}//end create_radio_btns
	
	
	
	public void add_radio_btns(JRadioButton [] r_btn_r) 
	{
		if(r_btn_r ==null) {return;}//no array? exit
		
		//loop array add each element to panel
		for(JRadioButton r_btn : r_btn_r) 
		{
			if(r_btn !=null)
			{
				add(r_btn);
			}
			
		}//end for 
		
	}//end add_radio_btns
	
	
}

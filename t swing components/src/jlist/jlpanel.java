package jlist;

import java.awt.Dimension;

import javax.swing.JList;
import javax.swing.JPanel;

public class jlpanel extends JPanel {
	
	public JList jl;
	
	public jlpanel() 
	{
		super();
		
		String[] items = {"Item 1", "Item 2", "Item 3"};
		 
		jl = new JList (items);
		
		jl.setPreferredSize(new Dimension(150, 80));

		add(jl);
	}
}

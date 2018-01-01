package label;

import java.awt.Color;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class lpanel extends JPanel{
	
	JLabel text_label,img_label;
	
	public lpanel() {
		super();
		setSize( 300, 300 );
		setBackground(Color.WHITE);
		
		//instantiate text label
		text_label = new JLabel("text label and img label->");
		
		//create img label
		img_label = new JLabel("");
		set_img("label.png" ,img_label);
		
		//add labels to panel
		add(text_label);
		add(img_label);
	}
	
	public void set_img(String ic , JLabel lbl) 
	{
		//get and set img to label
		lbl.setIcon(new ImageIcon("res/"+ic));
		//repaint panel elements etc
		repaint();
		revalidate(); 
	}//end set_img

}

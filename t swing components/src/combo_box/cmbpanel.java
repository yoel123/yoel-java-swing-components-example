package combo_box;

import javax.swing.JComboBox;
import javax.swing.JPanel;

public class cmbpanel extends JPanel {
	
	public JComboBox petList,male_female;
	
	public cmbpanel() 
	{
		super();
		
		String[] petStrings = { "Bird", "Cat", "Dog", "Rabbit", "Pig" };
		petList = new JComboBox(petStrings);
		
		String[] mfm = { "male", "female"};
		male_female = new JComboBox(mfm);
		
		
		add(petList);
		add(male_female);
	}
}

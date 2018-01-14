package ymain;

import batton.bframe;
import chackbox.cbframe;
import combo_box.cmb_frame;
import jlist.jlframe;
import label.lframe;
import panel.pframe;
import radio_btns.rframe;
import text_field.tframe;

public class main {

	public static void main(String[] args) {
		
		//jframe
		//yframe yf  = new yframe("window 1");
		//yframe yf2  = new yframe("window 2",500,500);
		
		//jpanel
		pframe pf = new pframe("panel test",300,300);
		//pf.yshow();
		
		//jlabel
		lframe lf = new lframe("label test",400,200);
		//lf.yshow();
		
		//jbatton
		bframe bf = new bframe("btn test",200,200);
		//bf.yshow();
		
	
		
		//jtext field 
		tframe tf = new tframe("text field ",400,400);
		//tf.yshow();
		
		//radio Buttons
		rframe rf = new rframe("radio Buttons ",200,400);
		//rf.yshow();
		
		//chackbox
		cbframe cbf = new cbframe("chacboxes",200,200);
		//cbf.yshow();
		
		//combo box
		cmb_frame cmb = new cmb_frame("combo box",200,300);
		//cmb.yshow();
	
		//jlist
		jlframe jl = new jlframe("jlist",200,200);
		jl.yshow();
		
		//textarea and scrolpane
		
		//scrolpane panel
		
		//table
		
		//tree
		
		//tabs
		
		//menu
		
		//everything

	}

}

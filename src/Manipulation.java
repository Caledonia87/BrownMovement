import java.awt.*;
import java.awt.event.*;

class Manipulation extends Panel implements ActionListener, AdjustmentListener{
    Model myModel;
    View myView;
    Button onButton, offButton, restartButton;
    Scrollbar scrollbar1,scrollbar2, scrollbar3;
    TextField t,t2,t3;             

    Manipulation( Model m ){
	myModel=m;
	
	setBackground(Color.darkGray);
	
	scrollbar1 = new Scrollbar(Scrollbar.VERTICAL, 5, 10, 1, 10010);
	this.add(scrollbar1);
	scrollbar1.addAdjustmentListener(this);
	this.t = new TextField(5);
	this.t.setText(String.valueOf(5));
        this.add(t);

	scrollbar2 = new Scrollbar(Scrollbar.VERTICAL, 20, 10, 0, 110);
	add(scrollbar2);
	scrollbar2.addAdjustmentListener(this);
	this.t2 = new TextField(3);
	this.t2.setText(String.valueOf(20));
	this.add(t2);

	scrollbar3 = new Scrollbar(Scrollbar.VERTICAL, 2, 1, 1, 51);
	add(scrollbar3);
	scrollbar3.addAdjustmentListener(this);
	this.t3 = new TextField(2);
	this.t3.setText(String.valueOf(2));
	this.add(t3); 
			
	onButton = new Button("Starta");
	add(onButton);
	onButton.addActionListener(this);
	
	offButton = new Button("Pausa");
	add(offButton);
	offButton.addActionListener(this);
	

}
   public void adjustmentValueChanged (AdjustmentEvent e){
       
	    int value = scrollbar1.getValue();
	    this.t.setText(String.valueOf(value));
	    myModel.setParticle(value);
	
	    int value2 = scrollbar2.getValue();
	    this.t2.setText(String.valueOf(value2));
	    myModel.setTimestep(value2);

	    int value3 = scrollbar3.getValue();
	    this.t3.setText(String.valueOf(value3));
	    myModel.setL(value3);
    }
    public void actionPerformed (ActionEvent e){
	if (e.getSource() == onButton){
	    myModel.onBrown();
	    
	}if (e.getSource() == offButton){
	    myModel.offBrown();
	}
   }
}
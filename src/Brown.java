import java.awt.*;
import java.applet.*;

public class Brown extends Applet {

    Model model;
    View view;
    Simulation simulation;
    Manipulation manipulation;

    public void init() {     
	setBackground(Color.lightGray);
	model = new Model();
	view = new View(model);
	simulation = new Simulation(model, view);
	manipulation = new Manipulation(model);

	add(view);
	add(manipulation);
    }
  
}
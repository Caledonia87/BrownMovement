import java.awt.*;

class Simulation extends Thread {
    Model myModel;
    View myView;
    Simulation( Model m, View v) {
	myModel = m;
	myView = v;
	start(); 
}

    public void run(){

	while(true)
        {
	    if(myModel.getBrown() == true){
		myModel.doStep();
	    myView.repaint();
	    }
	    try{
		sleep(myModel.getTimestep());
	    }
	    catch(InterruptedException e){}
	
	}
    }

}
import java.awt.*;

class View extends DBCanvas {
    Model myModel;

    View( Model m ){
	myModel = m;
	setSize(500,500);
	setBackground(Color.white);
}

    public void dbPaint (Graphics g){
	
	g.setColor(Color.black);
	for(int i=0; i<myModel.y; i++){
	int ex= (int) myModel.particle[i].rx();
	int ey= (int) myModel.particle[i].ry();
	g.fillOval(ex , ey, 4, 4);
	}
		
}

}

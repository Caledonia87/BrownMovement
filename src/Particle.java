class Particle {

    private double x,y,L;
    boolean w = true;
    Particle(double ix, double iy){
	x = ix;
	y = iy;
}

    void randomMove(){ 
	x += (double)L*Math.cos(Math.random()*2*Math.PI); 
	y += (double)L*Math.sin(Math.random()*2*Math.PI);
	if (y <=0){
	    w= false;
	    y=0;
	}if(y >=496){
	    w=false;
	    y=496;
	}if(x<=0){
	    w=false;
	    x=0;
	}if(x>=496){
	    w=false;
	    x=496;
	}
    }
    public double rx(){
	 return x;
    }
    public double ry(){
	return y;
    }
    void setLength (double b){
	L=b;
    }
}
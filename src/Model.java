class Model {

    Particle [] particle = new Particle [10000]; 
    boolean Q;
    int y = 5;
    private double rx,ry, L;
    private int ms = 20;
    private int u= 250;
    private int v= 250;
    private int w = 2;
    boolean create = false;   

    void setParticle(int r){
	   y=r;
	   create=true;
	for(int i=0; i<y; i++){
	particle[i] = new Particle(u, v);
	particle[i].setLength(w);
	}
	create=false;
    }
    Model(){
	for(int i=0; i<y; i++){
	particle[i] = new Particle(u, v);
	particle[i].setLength(w);
	}
}
    void doStep(){
	if(create==false){ 
	    
	    for(int i=0; i<y; i++){
	       if(particle[i].w == true){
	particle[i].randomMove();
	     }
	}
	}
    }
        void setL (double value){
    for(int i=0; i<y; i++){ 	
        particle[i].setLength(value);
    }
	}
    public void onBrown(){
    Q = true;
    }
    public void offBrown(){
	Q = false;
    }
    boolean getBrown(){
	return Q;
    }
    void setTimestep( int msr){
	 ms = msr;
    }
    int getTimestep(){
	return ms;
    }

}
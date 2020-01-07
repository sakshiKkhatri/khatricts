package comm.example;

public abstract class Transport {
	 private double  initialfuel;
	 private double  finalfuel;
	 private double  finaldis;
	 
	 public double getinitialfuel() {
		  return initialfuel;
	 }
	 
	public void setinitialfuel(double initialfuel) {
		this.initialfuel= initialfuel ;
	}

	 public double getfinalfuel() {
		  return finalfuel;
	 }
	 
	public void setfinalfuel(double finalfuel) {
		this.finalfuel= initialfuel ;
	}
	public double getinitialdis() {
		  return initialfuel;
	 }
	 
	public void setinitialdis(double initialdis) {
	}

	 public double getfinaldis() {
		  return finaldis;
	 }
	 
	 @Override
		public String toString() {

			return "initialfuel: "+getinitialfuel()+" finalfuel: "+getfinalfuel()+" initialdis: "+getinitialdis()+" finaldis: "+getfinaldis();
		}
	 
	
	public abstract void calculatedistance();
	public abstract void calculateefficiency();

}





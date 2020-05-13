package partiel;

public class Glaciers {
	public int year;
	public int massBalance;
	public int nbrObs;
	
	public void setYear(int myYear) {this.year = myYear;}
	public void setMass(int myMass) {this.massBalance = myMass;}
	public void setObsN(int myObsN) {this.nbrObs = myObsN;}
	
	public int getYear() {return this.year;}
	public int getMass() {return this.massBalance;}
	public int getObsN() {return this.nbrObs;}
	
	public Glaciers(int myYear, int myMass, int myObsN)
	{
		this.year = myYear;
		this.massBalance = myMass;
		this.nbrObs = myObsN;
	}
}

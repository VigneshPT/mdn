package org.amdocs.mdnproblem;

public class MDN {
	public int nPa;
	public int nXx;
	public int subscriberNumber;
	private IPrint printStrategy;
	
	public MDN(int nPa, int nXx, int subscriberNumber) {
		this.nPa = nPa;
		this.nXx = nXx;
		this.subscriberNumber = subscriberNumber;
	}
	
	public void setPrintStrategy(IPrint printStrategy) {
		this.printStrategy = printStrategy;
	}
	
	public void printMDN() {
		this.printStrategy.print(this);
	}
}

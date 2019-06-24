package org.amdocs.mdnproblem;

import java.util.ArrayList;
import java.util.Arrays;

public class PackedMDN {
	public String packedMDN;
	
	private int maxRange;
	private int startRange;
	private ArrayList<MDN> mdns;
    IPrint printStrategy;
	
	public PackedMDN(String packedMDN) {
		// TODO Auto-generated constructor stub
		mdns = new ArrayList<MDN>();
		this.packedMDN = packedMDN;
		printStrategy = new SimplePrintStrategy();
	}
	
	public ArrayList<MDN> getAllMobileDirectoryNumbers(){
		
		//TODO: validate the packedMDN format.
		String[] splitForRange = this.packedMDN.split(":");
		
		this.maxRange = Integer.parseInt(splitForRange[1]);
		
		
		ArrayList<String> mdnPartsStrings = new ArrayList<String>(Arrays.asList(splitForRange[0].split("-")));
		
		this.startRange = Integer.parseInt(mdnPartsStrings.get(2));
		
		for(int i = startRange; i <= maxRange; i++) {
			int nPa = Integer.parseInt(mdnPartsStrings.get(0));
			int nPx = Integer.parseInt(mdnPartsStrings.get(1));
			int subscriberNumber = i;
			MDN mdn = new MDN(nPa, nPx, subscriberNumber);
			mdns.add(mdn);
		}
		
		return mdns;
	}
	
	public void printAllMobileDirectoryNumbers(){
		ArrayList<MDN> mdns = getAllMobileDirectoryNumbers();
		for(MDN mdn : mdns) {
			mdn.setPrintStrategy(printStrategy);
			mdn.printMDN();
		}
	}
	
	public void printAllMobileDirectoryNumbers(IPrint printStrategy){
		this.printStrategy = printStrategy;
		printAllMobileDirectoryNumbers();
	}
}	

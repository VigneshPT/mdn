package org.amdocs.mdnproblem;

public class SimplePrintStrategy implements IPrint {

	@Override
	public void print(MDN mdn) {
		// TODO Auto-generated method stub
		System.out.println(mdn.nPa + "-" + mdn.nXx + "-" + mdn.subscriberNumber);
	}
	
}

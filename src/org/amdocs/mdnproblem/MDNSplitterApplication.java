package org.amdocs.mdnproblem;

import java.util.ArrayList;
import java.util.Scanner;

public class MDNSplitterApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Enter the packed MDN: ");
		Scanner inputReader = new Scanner(System.in);
		String inputFromConsole = inputReader.next();
		
		PackedMDN packedMDN = new PackedMDN(inputFromConsole);
		
//		ArrayList<MDN> mdns =  packedMDN.getAllMobileDirectoryNumbers();
//		
//		for(MDN mdn : mdns) {
//			System.out.println(mdn.getMDN());
//		}
//		
		packedMDN.printAllMobileDirectoryNumbers();
		
		inputReader.next();
		
		packedMDN.printAllMobileDirectoryNumbers(new ParanthesisPrintStrategy());
		
	} 

}

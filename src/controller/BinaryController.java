package controller;

public class BinaryController {
	public String convbinary(int decimal) {
		if (decimal == 0) {
			return "";
		}
		return(convbinary(decimal / 2) + String.valueOf(decimal % 2));
		
			
			
		}
	}


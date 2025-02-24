package controller;

public class BinaryController {
	public String convbinary(int decimal) {
		// o ponto de parada se dá quando não for possível dividir o decimal por 2
		if (decimal == 0) {
			return "";
		}
		
		/* a função é chamada passando o decimal dividindo por 2, e é feita a concatenação 
		do resto dessa divisão convertido em string */
		
		return(convbinary(decimal / 2) + String.valueOf(decimal % 2));
		
			
			
		}
	}


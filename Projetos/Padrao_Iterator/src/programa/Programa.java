package programa;

import dados.RepositorioFiat;
import dados.RepositorioFord;

public class Programa {
	
	public static void main(String[] args) {
		
		RepositorioFord carrosFord = new RepositorioFord();
		carrosFord.inserirCarroFord("Ford", "Meriva", "2012", "PSD-1598");
		carrosFord.inserirCarroFord("Ford", "Prisma", "2016", "JRP-8918");
		carrosFord.inserirCarroFord("Ford", "Cruze ", "2015", "FCS-1278");
		
		carrosFord.printCarros();
		
		System.out.println("\n");
		
		RepositorioFiat carrosFiat = new RepositorioFiat();
		carrosFiat.inserirCarroFiat("Fiat", "UnoMille", "2009", "HGE-1598");
		carrosFiat.inserirCarroFiat("Fiat", "Fiorino ", "2005", "RTE-1728");
		carrosFiat.inserirCarroFiat("Fiat", "Marea   ", "2011", "SER-9347");
		carrosFiat.inserirCarroFiat("Fiat", "147     ", "1976", "QPR-8937");
		
		carrosFiat.printCarrosFiat();
	}
	
	
}

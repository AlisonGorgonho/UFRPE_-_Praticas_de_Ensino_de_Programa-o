package programa;

import dados.RepositorioFiat;

import dados.RepositorioFord;

import negocio.VendedorCarro_1;
import negocio.VendedorCarro_2;

public class Programa {
	
	public static void main(String[] args) {
		
		RepositorioFord repositorioFord = new RepositorioFord();
		repositorioFord.inserirCarroFord("Ford", "Meriva  ", "2012", "PSD-1598", false);
		repositorioFord.inserirCarroFord("Ford", "Prisma  ", "2009", "JRP-8918", false);
		repositorioFord.inserirCarroFord("Ford", "Cruze   ", "2015", "FCS-1278", false);
		repositorioFord.inserirCarroFord("Ford", "Cruze   ", "2014", "FCS-8978", false);
		repositorioFord.inserirCarroFord("Ford", "Cruze   ", "2015", "GTS-1275", false);
		repositorioFord.inserirCarroFord("Ford", "Cruze   ", "2016", "FWE-1958", false);

		
		RepositorioFiat repositorioFiat = new RepositorioFiat();
		repositorioFiat.inserirCarroFiat("Fiat", "UnoMille", "2009", "HGE-1598", false);
		repositorioFiat.inserirCarroFiat("Fiat", "Fiorino ", "2005", "RTE-1728", false);
		repositorioFiat.inserirCarroFiat("Fiat", "Marea   ", "2009", "SER-9347", false);
		repositorioFiat.inserirCarroFiat("Fiat", "147     ", "1976", "QPR-8937", false);
		
		VendedorCarro_1 vendedor_1 = new VendedorCarro_1(repositorioFiat, repositorioFord);
//		VendedorCarro_2 vendedor_2 = new VendedorCarro_2(repositorioFiat, repositorioFord);
		
//		vendedor_1.printCarrosTodos();
//		vendedor_1.printCarrosAno("2009");
//		vendedor_1.printCarrosFiat();
//		vendedor_1.printCarrosFord();
//		vendedor_1.printCarrosModelo("Cruze");
		
		vendedor_1.printCarrosTodos();

	}
	
	
}

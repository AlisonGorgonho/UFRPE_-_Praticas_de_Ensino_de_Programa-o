package dados;

import java.util.ArrayList;

import principal.Carro;

public class RepositorioFiat {
	
	//atrubitos da classe RpositórioFiat
	ArrayList<Carro> carros;
	
	//contrutor da classe RepositórioFord
	public RepositorioFiat(){
		
		carros = new ArrayList<Carro>();
		
	}
	
	//metódos da classe repositórioFord
	public void inserirCarroFiat(String marca, String modelo, String ano, String placa){
		
		Carro carro = new Carro(marca, modelo, ano, placa);
		carros.add(carro);	
	}
	
	public void printCarrosFiat(){
		
		System.out.println("Lista de carros no repositório da Fiat: \n");
		
		for(Carro i: carros){
			
			System.out.println("Carro: " + i.getModelo() + " Marca: " + i.getMarca() + " Ano: " + i.getAno() +  " Placa: " + i.getPlaca() );
		}
		
	}
	
	
}

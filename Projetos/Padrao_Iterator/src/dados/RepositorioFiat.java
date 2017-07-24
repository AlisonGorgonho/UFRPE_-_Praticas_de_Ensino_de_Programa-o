package dados;

import java.util.ArrayList;

import principal.Carro;

public class RepositorioFiat {
	
	//atrubitos da classe Rposit�rioFiat
	ArrayList<Carro> carros;
	
	//contrutor da classe Reposit�rioFord
	public RepositorioFiat(){
		
		carros = new ArrayList<Carro>();
		
	}
	
	//met�dos da classe reposit�rioFord
	public void inserirCarroFiat(String marca, String modelo, String ano, String placa){
		
		Carro carro = new Carro(marca, modelo, ano, placa);
		carros.add(carro);	
	}
	
	public void printCarrosFiat(){
		
		System.out.println("Lista de carros no reposit�rio da Fiat: \n");
		
		for(Carro i: carros){
			
			System.out.println("Carro: " + i.getModelo() + " Marca: " + i.getMarca() + " Ano: " + i.getAno() +  " Placa: " + i.getPlaca() );
		}
		
	}
	
	
}

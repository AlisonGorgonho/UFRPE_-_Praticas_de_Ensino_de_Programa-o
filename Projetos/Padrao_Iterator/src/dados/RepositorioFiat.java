package dados;

import java.util.ArrayList;
import java.util.Iterator;

//import negocio.Iterator;
import principal.Carro;

public class RepositorioFiat {
	
	//atrubitos da classe RpositórioFiat
	ArrayList<Carro> carros;
	
	//contrutor da classe RepositórioFord
	public RepositorioFiat(){
		
		carros = new ArrayList<Carro>();
		
	}
	
//	public Iterator criarNovoIterador(){
//		
//		Iterator fiatIterator = new FiatIterator(this.carros);
//		return fiatIterator;
//	}
	
	public Iterator createIterator(){
		return carros.iterator();
	}
	
	//metódos da classe repositórioFord
	public void inserirCarroFiat(String marca, String modelo, String ano, String placa, boolean usado){
		
		Carro carro = new Carro(marca, modelo, ano, placa, usado);
		carros.add(carro);	
		//System.out.println("Carro Cadastrado com Sucesso !");
	}
	
	public ArrayList<Carro> printCarrosFiat(){
		
		
		System.out.println("Lista de carros no repositório da Fiat: \n");
		
		for(Carro i: carros){
			
			System.out.println("Carro: " + i.getModelo() + " Marca: " + i.getMarca() + " Ano: " + i.getAno() +  " Placa: " + i.getPlaca() );
		}
		
		return carros;
		
	}
	
	public ArrayList<Carro> getCarrosArray(){
		return this.carros;
	}

}

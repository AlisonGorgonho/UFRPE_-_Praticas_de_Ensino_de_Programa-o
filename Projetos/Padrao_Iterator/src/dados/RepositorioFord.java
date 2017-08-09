package dados;


import java.util.Iterator;

import negocio.ColecaoCarros;
import negocio.FordIterator;

import principal.Carro;

public class RepositorioFord extends FordIterator{
	
	//Atributos da classe RepositórioFord
	private Carro[] carros;
	private int indice;
	private final static int TAMANHO = 100;

	
	//Contrutor da Classe RepositórioFord
	public RepositorioFord(){
		
		this.carros = new Carro[TAMANHO];
		this.indice = 0;
	}
	
	
	//Métodos da classe RepositórioFord
	
//	public Iterator criarNovoIterador(){
//		
//		Iterator fordIterator = new FordIterator(this.carros);
//		
//		return fordIterator;
//		
//	}
	
	public ColecaoCarros createIterator(){
		
		return FordIterator(this.carros);
		
	}
	
	public void inserirCarroFord(String marca, String modelo, String ano, String placa, boolean usado){
		
		Carro carro = new Carro(marca, modelo, ano, placa, usado);
		this.carros[indice] = carro;
		this.indice = this.indice + 1;
		//System.out.println("Carro Cadastrado com Sucesso !");
		
	}
	
	public void printCarros(){
		
		System.out.println("Lista de Carros no Repositório da Ford: \n");
		
		for(int i = 0; i < this.indice; i++){
			
			System.out.println("Carro: " + carros[i].getModelo() + " Marca: " + carros[i].getMarca() + " Ano: " + carros[i].getAno() + " Placa: " + carros[i].getPlaca() );	
			
		}
		
	}
	
	//Getters e Setters da classe RepositórioFord
	public int getIndice(){
		
		return this.indice;
		
	}
	
	public Carro[] getCarrosMatriz(){
		return this.carros;
	}
	
}

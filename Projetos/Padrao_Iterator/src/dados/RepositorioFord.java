package dados;

import principal.Carro;

public class RepositorioFord {
	
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
	
	public void inserirCarroFord(String marca, String modelo, String ano, String placa){
		
		Carro carro = new Carro(marca, modelo, ano, placa);
		this.carros[indice] = carro;
		this.indice = this.indice + 1;
		
	}
	
	public void printCarros(){
		
		System.out.println("Lista de Carros no Repositório da Ford: \n");
		
		for(int i = 0; i < this.indice; i++){
			
			System.out.println("Carro: " + carros[i].getModelo() + " Marca: " + carros[i].getMarca() + " Ano: " + carros[i].getAno() + " Placa: " + carros[i].getPlaca() );	
			
		}
		
	}
	
	//Getters e Setters da classe RepositórioFord
	public int getIndice(String placa){
		
		int retorno = -1;
		
		for(int i = 0; i < this.indice; i++){
			
			if(carros[i].getPlaca().equals(placa)){
				
				retorno = i;
			}else{
				
				System.out.println("Placa não encontrada !");
			}
		}
		
		return retorno;
	}
	
}

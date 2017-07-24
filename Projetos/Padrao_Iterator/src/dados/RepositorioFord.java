package dados;

import principal.Carro;

public class RepositorioFord {
	
	//Atributos da classe Reposit�rioFord
	private Carro[] carros;
	private int indice;
	private final static int TAMANHO = 100;

	
	//Contrutor da Classe Reposit�rioFord
	public RepositorioFord(){
		
		this.carros = new Carro[TAMANHO];
		this.indice = 0;
		
	}
	
	
	//M�todos da classe Reposit�rioFord
	
	public void inserirCarroFord(String marca, String modelo, String ano, String placa){
		
		Carro carro = new Carro(marca, modelo, ano, placa);
		this.carros[indice] = carro;
		this.indice = this.indice + 1;
		
	}
	
	public void printCarros(){
		
		System.out.println("Lista de Carros no Reposit�rio da Ford: \n");
		
		for(int i = 0; i < this.indice; i++){
			
			System.out.println("Carro: " + carros[i].getModelo() + " Marca: " + carros[i].getMarca() + " Ano: " + carros[i].getAno() + " Placa: " + carros[i].getPlaca() );	
			
		}
		
	}
	
	//Getters e Setters da classe Reposit�rioFord
	public int getIndice(String placa){
		
		int retorno = -1;
		
		for(int i = 0; i < this.indice; i++){
			
			if(carros[i].getPlaca().equals(placa)){
				
				retorno = i;
			}else{
				
				System.out.println("Placa n�o encontrada !");
			}
		}
		
		return retorno;
	}
	
}

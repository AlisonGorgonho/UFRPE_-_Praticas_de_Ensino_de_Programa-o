package negocio;

import java.util.ArrayList;
import java.util.Iterator;


import dados.RepositorioFiat;
import dados.RepositorioFord;
import principal.Carro;

public class VendedorCarro_3 {
	
	ColecaoCarros repositorioFiat;
	ColecaoCarros repositorioFord;
	
	public VendedorCarro_3(ColecaoCarros repositorioFiat, ColecaoCarros repositorioFord){
		
		this.repositorioFiat = repositorioFiat;
		this.repositorioFord = repositorioFord;
		
	}
	
	public void printCarrosTodos() {
		//Imprimir todos os carros cadastrados
		
		Iterator fiatIterator = this.repositorioFiat.createIterator();
		Iterator fordIterator = this.repositorioFord.createIterator();
		
		System.out.println("--------------------------Carros Fiat---------------------------");
		printCarrosTodos(fiatIterator);
		System.out.println("--------------------------Carros Ford---------------------------");
		printCarrosTodos(fordIterator);
	}
	
	
	private void printCarrosTodos(Iterator iterator){
		
		while(iterator.hasNext()){
			
			Carro carro = (Carro) iterator.next();
			System.out.println("Carro: " + carro.getModelo() + " Marca: " + carro.getMarca() + " Ano: " + carro.getAno() +  " Placa: " + carro.getPlaca() );
			
		}
				
	}
	
//	public void printCarrosFiat(RepositorioFiat repositorioFiat){
//		ArrayList<Carro> carrosFiat = this.repositorioFiat.getCarrosArray();
//
//		for(Carro i: carrosFiat){
//			
//			System.out.println("Carro: " + i.getModelo() + " Marca: " + i.getMarca() + " Ano: " + i.getAno() +  " Placa: " + i.getPlaca() );
//		}
//		
//	}
//	
//	public void printCarrosFord(RepositorioFord repositorioFord){
//		Carro[] carrosFord = this.repositorioFord.getCarrosMatriz();
//		
//		for(int i = 0; i < this.repositorioFord.getIndice(); i++){
//			
//			System.out.println("Carro: " + carrosFord[i].getModelo() + " Marca: " + carrosFord[i].getMarca() + " Ano: " + carrosFord[i].getAno() +  " Placa: " + carrosFord[i].getPlaca() );
//		}
//		
//	}
//	
//	public void printCarrosAno(String ano){
//		
//		ArrayList<Carro> carrosFiat = this.repositorioFiat.getCarrosArray();
//		Carro[] carrosFord = this.repositorioFord.getCarrosMatriz();
//		
//		//IMplementação para Repositorio Fiat
//		for(Carro i: carrosFiat){
//			
//			if(i.getAno().equals(ano)){
//				
//				System.out.println("Carro: " + i.getModelo() + " Marca: " + i.getMarca() + " Ano: " + i.getAno() +  " Placa: " + i.getPlaca() );
//
//			}
//		}
//		
//		
//		//IMplementação para Repositorio Ford
//		for(int i = 0; i < this.repositorioFord.getIndice(); i++){
//			if(carrosFord[i].getAno().equals(ano)){
//				
//				System.out.println("Carro: " + carrosFord[i].getModelo() + " Marca: " + carrosFord[i].getMarca() + " Ano: " + carrosFord[i].getAno() +  " Placa: " + carrosFord[i].getPlaca() );
//				
//			}
//
//		}
			
	}
	
	public void printCarrosModelo(String modelo){
		
		ArrayList<Carro> carrosFiat = this.repositorioFiat.getCarrosArray();
		Carro[] carrosFord = this.repositorioFord.getCarrosMatriz();
		
		//IMplementação para Repositorio Fiat
		for(Carro i: carrosFiat){
			
			if(i.getAno().equals(modelo)){
				
				System.out.println("Carro: " + i.getModelo() + " Marca: " + i.getMarca() + " Ano: " + i.getAno() +  " Placa: " + i.getPlaca() );

			}
		}
		
		
		//IMplementação para Repositorio Ford
		for(int i = 0; i < this.repositorioFord.getIndice(); i++){
			if(carrosFord[i].getAno().equals(modelo)){
				
				System.out.println("Carro: " + carrosFord[i].getModelo() + " Marca: " + carrosFord[i].getMarca() + " Ano: " + carrosFord[i].getAno() +  " Placa: " + carrosFord[i].getPlaca() );
				
			}

		}

	}
	
	
}

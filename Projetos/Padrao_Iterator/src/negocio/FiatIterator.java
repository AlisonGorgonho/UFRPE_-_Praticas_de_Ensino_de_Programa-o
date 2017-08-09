package negocio;

import java.util.ArrayList;

import java.util.Iterator;

import principal.Carro;

public class FiatIterator implements ColecaoCarros{
	
	ArrayList<Carro> carros;
	int indice = 0;
	
	public FiatIterator(){
		
	}
	
	public FiatIterator(ArrayList<Carro> repositorioFiat){
		
		this.carros = repositorioFiat;
		
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(carros.size() == 0 || indice >= carros.size()){
			return false;
		}else{
			return true;
		}
	}
	
	@Override
	public Object next() {
		// TODO Auto-generated method stub
		Carro carro = carros.get(indice);
		indice = indice + 1;
		return carro;
	}

	@Override
	public negocio.Iterator createIterator() {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public boolean existeProximo() {
//		// TODO Auto-generated method stub
//		if(carros.size() == 0 || indice >= carros.size()){
//			return false;
//		}else{
//			return true;
//		}
//	}
//
//	@Override
//	public Object proximo() {
//		// TODO Auto-generated method stub
//		Carro carro = carros.get(indice);
//		indice = indice + 1;
//		return carro;
//	}
//	
	

}

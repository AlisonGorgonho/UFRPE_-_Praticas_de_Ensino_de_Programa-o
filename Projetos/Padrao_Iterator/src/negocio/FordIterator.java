package negocio;

import negocio.Iterator;;
import principal.Carro;

public class FordIterator implements Iterator{
	
	Carro[] carros;
	int indice = 0;
	
	public FordIterator(Carro[] carrosFord){
		this.carros = carrosFord;
	}
	
	public FordIterator(){
		
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(indice >= carros.length || carros[indice] == null){
			return false;
		}else{		
			return true;	
		}
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		Carro carro = carros[indice];
		indice = indice + 1;
		return carro;
	}
	
	public void remove(){
		
		if(indice<=0){
			
			throw new IllegalStateException("Você não pode remover um item até que você tenha pelo menos um próximo");
			
		}if(carros[indice-1] != null){
			
			for(int i = indice - 1; i < (carros.length);i++ ){
				
				carros[i] = carros[i+1];
				
			}
			carros[carros.length-1] = null;
			
		}
		
	}
	
}

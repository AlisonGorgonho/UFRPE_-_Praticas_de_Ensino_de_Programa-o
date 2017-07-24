package principal;

public class Carro {
	
	//Atributos da classe Carro
	private String marca;
	private String modelo;
	private String ano;
	private String placa;

	
	//Contrutor da classe Carro
	public Carro(String marca, String modelo, String ano, String placa){
		
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.placa = placa;
		
	}

	//Getters e Setters da classe Carro
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	

}

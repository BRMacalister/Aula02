
public class Lampada {
	//atributos.
	
	int watts;
	String fabricante;
	boolean ligada;
	
	public Lampada(int watts, String fabricante){
		this.watts = watts;
		this.fabricante = fabricante;
	}
		
	//	Metodo..
	
	void ligar(){
		System.out.println("Ligado");
		this.ligada = true;
					
	}
	
	void desligado(){
		System.out.println("Desligado");
		this.ligada = false;
	}
	public boolean estaligada(){
		return ligada;
	}
	

}

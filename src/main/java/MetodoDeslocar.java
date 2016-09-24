
public class MetodoDeslocar {

	double x;
	double y;
	
	public void deslocar (double deltax, double deltay){
		x += deltax;
		y += deltay;
		
	}
	
	public MetodoDeslocar(double coordX, double coordY){
		x = coordX;
		y = coordY;	
				
	}
	
	public void zerar (){
		x = 0;
		y = 0;
		
	}
	
	public boolean isYMenorQueZero (){
		if (y < 0){
			return true;
		
		}return false;
	}
}

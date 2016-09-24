
public class TestarInterruptor {

	public static void main(String[] args) {
		Lampada lampada = new Lampada(60, "Fabricante da lampada");
		
		
		Interruptor interruptor = new Interruptor (lampada);
		
		interruptor.apertar();
		interruptor.apertar();
		interruptor.apertar();
		interruptor.apertar();
		interruptor.apertar();
		interruptor.apertar();
	}
}

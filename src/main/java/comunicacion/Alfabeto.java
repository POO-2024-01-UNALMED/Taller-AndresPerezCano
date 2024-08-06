package comunicacion;

public class Alfabeto extends Pictograma{
	
	private static String[] letras  ;
	private String interpretacion;
	
	public Alfabeto(String origen,String[] letras, String interpretacion) {
		super(origen);
		this.interpretacion = interpretacion;
		this.letras = letras;
	}
	
	public int cantidadLetras() {
		int cantidadLetras = letras.length;
		return cantidadLetras;
		
	}
	
	public String interpretacion() {
		return this.interpretacion;
		
	}
	
	public String toString() {
		return "A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z";
		
	}
	
	public static String[] getLetras(){
		return Alfabeto.letras;
	}
	public static void setLetras(String[] letras) {
		Alfabeto.letras = letras;
	}
	public String getInterpretacion() {
		return this.interpretacion;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}

}
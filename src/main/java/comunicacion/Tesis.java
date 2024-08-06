package comunicacion;

public class Tesis extends Escrito {
	
	private String idea;
	private static String[] argumentos;
	private String conclusion;
	private String referencia;
	private String interpretacion;
	
	public Tesis(String origen, String titulo, String autor, int paginas, String idea, String conclusion, String referencia, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.idea = idea;
		this.conclusion = conclusion;
		this.referencia = referencia;
		this.interpretacion = interpretacion;
	}
	
	public int palabrasTotales(int palabrasPaginas) {
		int palabrasTotales = palabrasPaginas * 5;
		return palabrasTotales;
	}
	
	public String interpretacion() {
		return this.interpretacion;
	}
	
	public String toString() {
		
		return  resumen() +  "\n" +
				getIdea() +  "\n" +
				getArgumentos() +  "\n" +
				getConclusion() +  "\n" +
				getReferencia();
	}
	
	public String getIdea() {
		return this.idea;
	}
	public void setIdea(String idea) {
		this.idea = idea;
	}
	public static String[] getArgumentos() {
		return Tesis.argumentos;
	}
	public static void setArgumentos(String[] argumentos) {
		Tesis.argumentos = argumentos;
	}
	public String getConclusion() {
		return this.conclusion;
	}
	public void setConclusion(String conclusion) {
		this.conclusion = conclusion;
	}
	public String getReferencia() {
		return this.referencia;
	}
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	public String getInterpretacion() {
		return this.interpretacion;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}

}

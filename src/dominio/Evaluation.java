package dominio;

public abstract class Evaluation {

	private String nombre;
	private double ponderacion;
	
	public Evaluation() {
	}

	public Evaluation(String nombre, double ponderacion) {
		super();
		this.nombre = nombre;
		this.ponderacion = ponderacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPonderacion() {
		return ponderacion;
	}

	public void setPonderacion(double ponderacion) {
		this.ponderacion = ponderacion;
	}
	
	//Metodo abstracto
	public abstract double puntajeObtenido();
	
}

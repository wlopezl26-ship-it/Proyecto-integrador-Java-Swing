package dominio;

public class WrittenExam extends Evaluation {

	private double calificacion;

	public WrittenExam() {
		super();
	}

	
	public WrittenExam(String nombre, double ponderacion, double calificacion) {
		super(nombre, ponderacion);
		this.calificacion = calificacion;
	}

	public double getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}
	
	//EL OVERRIDE (Requisito obligatorio del PDF)
	@Override 
	public double puntajeObtenido() {
		return calificacion * (getPonderacion() / 100.0);
	}
	
	
}

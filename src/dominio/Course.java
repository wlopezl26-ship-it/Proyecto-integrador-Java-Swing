package dominio;

//Es obligatorio importar estas dos librerías para usar listas en Java

import java.util.ArrayList;
import java.util.List;

public class Course {

	private String codigo;
	private String nombres;
	private int creditos;
	
	// Una lista que puede guardar cualquier clase que herede de Evaluation
	private List<Evaluation> evaluaciones;

	public Course(String codigo, String nombres, int creditos) {
		super();
		this.codigo = codigo;
		this.nombres = nombres;
		this.creditos = creditos;
		//Inicializar la lista vacía para que no dé error NullPointer
		this.evaluaciones = new ArrayList<>();
	}
	
	//Método para agregar notas a la lista
	// Recibe un "Evaluation", pero en el main le pasaremos objetos WrittenExam o Project
	public void agregarEvaluacion(Evaluation evaluacion) {
		this.evaluaciones.add(evaluacion);
	}
	
	
	//POLIMORFISMO
	//Recorre la lista y suma los puntos
	//Java decide automáticamente qué fórmula matemática usar dependiendo de si el objeto es Examen o Proyecto.
	public double calcularNotaFinal() {
		double notaTotal = 0;
		for(Evaluation eval : evaluaciones) {
			notaTotal += eval.puntajeObtenido();
		}
		return notaTotal;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public int getCreditos() {
		return creditos;
	}

	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}

	public List<Evaluation> getEvaluaciones() {
		return evaluaciones;
	}

	public void setEvaluaciones(List<Evaluation> evaluaciones) {
		this.evaluaciones = evaluaciones;
	}
	
	
	
	
}

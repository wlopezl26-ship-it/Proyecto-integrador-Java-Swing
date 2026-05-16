package dominio;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Estudiante usando constructor sin correo
        Student estudiante = new Student("0900-26-1234", "Alvaro", "Granados");
        
        //Crear un curso
        Course curso = new Course("001", "Programación Orientada a Objetos", 5);
        
        //Crear las evaluaciones
     // ========================================================================
        // NOTA PARA INGRESAR LAS NOTAS:
        // El 2do parámetro (ponderación) es cuánto vale el examen en la zona (ej. 15 o 35 pts).
        // El 3er parámetro (nota) es la calificación que el alumno sacó en el papel sobre 100.
        // Nuestro método getpuntajeObtenido() hace la regla de tres automáticamente.
        // Ejemplo: Sacar 80/100 en un parcial que vale 15 pts, nos sumará 12 pts netos.
        // ========================================================================
        WrittenExam parcial = new WrittenExam("Primer Parcial", 15.0, 100.0);
        WrittenExam parcia2 = new WrittenExam("Segundo Parcial", 15.0, 100.0);       
        WrittenExam examenFinal = new WrittenExam("Examen Final", 35.0, 100.0);
                
        // Agregar las evaluaciones al curso (POLIMORFISMO)
        curso.agregarEvaluacion(parcial);
        curso.agregarEvaluacion(parcia2);
        curso.agregarEvaluacion(examenFinal);
        
        // 5. Imprimir los resultados en consola para validar
        System.out.println("======================================");
        System.out.println(" SISTEMA CAMPUS LITE - MODO PRUEBA ");
        System.out.println("======================================");
        System.out.println("Estudiante: " + estudiante.getNombre() + " " + estudiante.getApellido());
        System.out.println("Carnet: " + estudiante.getCarnet());
        System.out.println("Curso: " + curso.getNombres());
        System.out.println("--------------------------------------");
        
        // Llamamos al método que recorre la lista y calcula todo
        double notaTotal = curso.calcularNotaFinal();
        
        System.out.println("Nota Final Acumulada: " + notaTotal + " puntos.");
        
        // Un pequeño if para saber si aprobó
        if(notaTotal >= 61) {
            System.out.println("Estado: APROBADO ");
        } else {
            System.out.println("Estado: REPROBADO ");
        }
        System.out.println("=======================================");
    }
	}




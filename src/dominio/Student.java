package dominio;

public class Student {

	private String carnet;
	private String nombre;
	private String apellido;
	private String correo;
	
	// Constructor A: Se usa cuando el estudiante NO tiene correo
	public Student(String carnet, String nombre, String apellido) {
		super();
		this.carnet = carnet;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	// Constructor B: Se usa cuando el estudiante SÍ da su correo
	public Student(String carnet, String nombre, String apellido, String correo) {
		super();
		this.carnet = carnet;
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
	}

	public String getCarnet() {
		return carnet;
	}

	public void setCarnet(String carnet) {
		this.carnet = carnet;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	
}


public class Persona {
	
	private String nombre;
	private int edad;
	private String dni;
	private String sexo;
	private final String HOMBRE="H";
	private final String MUJER="M";
	private double peso;
	private double altura;
	
	//constructor por defecto, sin el DNI
	public Persona() {
		this.nombre = "";
		this.edad = 0;
		this.sexo = HOMBRE;
		this.peso = 0.0;
		this.altura = 0.0;
	}

	//constructor que solo pide nombre, edad, dni y sexo
	//sexo llama la funcion setSexo para validar con las constantes.
	public Persona(String nombre, int edad, String dni, String sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		setSexo(sexo);
		this.peso = 0.0;
		this.altura = 0.0;
	}

	//constructor que pide todas las variables
	//sexo llama la funcion setSexo para validar con las constantes.
	public Persona(String nombre, int edad, String dni, String sexo, double peso, double altura) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		setSexo(sexo);
		this.peso = peso;
		this.altura = altura;
	}

	//geters i seters
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String getDni() {
		return dni;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	//validamos las constantes, si escribe "mujer saldra 'M', si escribe otra cosa saldra 'H'"
	public void setSexo(String sexo) {
		if(sexo.toLowerCase()=="mujer") {
			this.sexo = MUJER;
		}else {
			this.sexo = HOMBRE;
		}
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public String getHOMBRE() {
		return HOMBRE;
	}
	
	public String getMUJER() {
		return MUJER;
	}

	//metodo toString para mostrar el contenido del objeto
	public String toString() {
		return "Nombre: "+this.nombre+
				" - Edad: "+this.edad+
				" - DNI: "+this.dni+
				" - Sexo: "+this.sexo+
				" - Peso: "+this.peso+
				" - Altura: "+this.altura;
	}	
}

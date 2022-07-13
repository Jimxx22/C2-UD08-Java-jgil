
public class Password {

	private int longitud;
	private String contrseña;
	
	//constructor por defecto con la longitud definida a 8
	public Password() {
		this.longitud = 8;
		this.contrseña = aleContraseña(this.longitud);
	}
	
	//constructor que pide la longitud, y contrasenya llama a metodo que crea una constrasenya aleatoria
	public Password(int longitud) {
		this.longitud = longitud;
		this.contrseña = aleContraseña(this.longitud);;
	}

	//metodo que genera una contrasenya aleatoria
	public String aleContraseña(int longitud) {
		
		char c;
		String pass="";
		int n;
		
		//bucle con la longitud establecida 
		for (int i = 0; i < longitud; i++) {
			//cogemos un numero aleatorio del 122 ('z' en ASCII) al 48 ('0' en ASCII)
			n = (int) (Math.random() * 122 + 48);
			
			//comprovamos que esta dentro de los parametros (0-9, A-Z, a-z)
			if((n>=48 && n<=57)||(n>=65 && n<=90)||(n>=97 && n<=122)) {
				//transformamos el numero a char
				c=(char)n;
				//lo unimos al string que contendra toda la contrasenya
				pass+=c;
			}else {
				i--;
			}
		}
		
		return pass;
	}

	//geters i seters
	public int getLongitud() {
		return longitud;
	}
	
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	
	public String getContrseña() {
		return contrseña;
	}
	
	public void setContrseña(String contrseña) {
		this.contrseña = contrseña;
	}

	//metodo toString para mostrar el contenido del objeto
	public String toString() {
		return "Longitud: "+this.longitud+" - Contraseña: "+this.contrseña;
	}
	
	
}


public class Electrodomestico {
	
	protected Double precioBase;
	protected String color;
	protected String consumoEnergetico;
	protected Double peso;
	
	//constantes
	private final String BLANCO = "blanco";
	private final Double PRECIO = 100.0;
	private final String CONSUMO = "F";
	private final Double PESO = 5.0;
	
	//constructor por defecto que llama a las constantes
	public Electrodomestico() {
		this.precioBase = PRECIO;
		this.color = BLANCO;
		this.consumoEnergetico = CONSUMO;
		this.peso = PESO;
	}

	//constructor que pide el precioBase i el peso
	public Electrodomestico(Double precioBase, Double peso) {
		this.precioBase = precioBase;
		this.color = BLANCO;
		this.consumoEnergetico = CONSUMO;
		this.peso = peso;
	}

	//constructor que pide todos los atributos
	//para validar el contenido del color i el consumo energetico llamamos a las funciones setColor i setConsumoEnergetico
	public Electrodomestico(Double precioBase, String color, String consumoEnergetico, Double peso) {
		this.precioBase = precioBase;
		setColor(color);
		setConsumoEnergetico(consumoEnergetico);;
		this.peso = peso;
	}

	//geters i seters
	public Double getPrecioBase() {
		return precioBase;
	}
	
	public void setPrecioBase(Double precioBase) {
		this.precioBase = precioBase;
	}
	
	public String getColor() {
		return color;
	}
	
	//validamos que el color entrado esta dentro de los parametros, sino usara el color blanco
	public void setColor(String color) {
		if(color.toLowerCase()=="negro"||color.toLowerCase()=="rojo"||color.toLowerCase()=="azul"||color.toLowerCase()=="gris") {
			this.color = color;
		}else {
			this.color=BLANCO;
		}
	}
	
	public String getConsumoEnergetico() {
		return consumoEnergetico;
	}
	//validamos que el consumo energetico entrado esta dentro de los parametros, sino usara 'F'
	public void setConsumoEnergetico(String consumoEnergetico) {
		if(consumoEnergetico.toUpperCase().equals("A")||consumoEnergetico.toUpperCase().equals("B")||consumoEnergetico.toUpperCase().equals("C")||consumoEnergetico.toUpperCase().equals("D")||consumoEnergetico.toUpperCase().equals("E")) {
			this.consumoEnergetico = consumoEnergetico.toUpperCase();
		}else {
			this.consumoEnergetico = CONSUMO;
		}
	}
	
	public Double getPeso() {
		return peso;
	}
	
	public void setPeso(Double peso) {
		this.peso = peso;
	}

	//metodo toString para mostrar el contenido del objeto
	public String toString() {
		return "Electrodomestico [precioBase=" + this.precioBase + ", color=" + this.color + ", consumoEnergetico="
				+ this.consumoEnergetico + ", peso=" + this.peso + "]";
	}
}

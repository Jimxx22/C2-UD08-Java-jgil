
public class Serie {

	private String titulo;
	private int nTemporadas;
	private boolean entregado;
	private String genero;
	private String creador;
	
	//constructor por defecto
	public Serie() {
		this.titulo = "";
		this.nTemporadas = 3;
		this.entregado = false;
		this.genero = "";
		this.creador = "";
	}
	
	//constructor que pide el titulo i el creador
	public Serie(String titulo, String creador) {
		super();
		this.titulo = titulo;
		this.nTemporadas = 3;
		this.entregado = false;
		this.genero = "";
		this.creador = creador;
	}
	
	//constructor que pide todos los atributos menos el entregado
	public Serie(String titulo, int nTemporadas, String genero, String creador) {
		super();
		this.titulo = titulo;
		this.nTemporadas = nTemporadas;
		this.entregado = false;
		this.genero = genero;
		this.creador = creador;
	}

	//geters i seters
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getnTemporadas() {
		return nTemporadas;
	}
	public void setnTemporadas(int nTemporadas) {
		this.nTemporadas = nTemporadas;
	}
	public boolean isEntregado() {
		return entregado;
	}
	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getCreador() {
		return creador;
	}
	public void setCreador(String creador) {
		this.creador = creador;
	}
	
	//metodo toString para mostrar el contenido del objeto
	public String toString() {
		return "Serie [titulo=" + titulo + ", nTemporadas=" + nTemporadas + ", entregado=" + entregado + ", genero="
				+ genero + ", creador=" + creador + "]";
	}	
}

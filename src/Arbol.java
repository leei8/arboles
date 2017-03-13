
public class Arbol {

	private String nombre;
	private String zona;
	private double altura;
	
	
	public Arbol(String nombre, String zona, double altura) {
		super();
		this.nombre = nombre;
		this.zona = zona;
		this.altura = altura;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getZona() {
		return zona;
	}
	public void setZona(String zona) {
		this.zona = zona;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
}


public class Garage {


	private int capacidad;
	private String direccion;
	private boolean precio;
	private int dia;
	private int mes;
	private int a�o;
	public boolean verCapacidad= true;
	public boolean ingresar = true;
	
	
	
	public Garage() {
		super();
	}

	public Garage(int capacidad, String direccion, boolean precio, int dia, int mes, int a�o) {
		super();
		this.capacidad = capacidad;
		this.direccion = direccion;
		this.precio = precio;
		this.dia = dia;
		this.mes = mes;
		this.a�o = a�o;
	}

	
	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public boolean isPrecio() {
		return precio;
	}

	public void setPrecio(boolean precio) {
		this.precio = precio;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}
	
	
	
	
	
	
}

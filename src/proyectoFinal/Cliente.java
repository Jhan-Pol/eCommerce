package proyectoFinal;

public class Cliente {
	public String nombre;
	public String direccion;
	public String historialCompras;
	public String carrito;
	public String dinero;
	public Cliente(String nombre, String direccion, String historialCompras, String carrito, String dinero) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.historialCompras = historialCompras;
		this.carrito = carrito;
		this.dinero = dinero;
	}
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getHIstorialCompras() {
		return historialCompras;
	}
	
	public void setHistorialCompras(String historialCompras) {
		this.historialCompras = historialCompras;
	}
	
	public String getCarrito() {
		return carrito;
	}
	
	public void setCarrito(String carrito) {
		this.carrito = carrito;
	}
	public String getDinero() { 
		return dinero;
	}
	public void setDinero(String dinero) {
		this.dinero = dinero;
	}
}

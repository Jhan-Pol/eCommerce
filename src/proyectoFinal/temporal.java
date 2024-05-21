package proyectoFinal;

public class temporal {
    private static temporal instance;
    private String nombre, direccion, dinero;

    private temporal() {
        // Constructor privado para evitar instanciación externa
    }

    public static temporal getInstance() {
        if (instance == null) {
            instance = new temporal();
        }
        return instance;
    }

    public void setNombre(String x) {
        this.nombre = x;
    }

    public String getNombre() {
        return nombre;
    }
    public void setDireccion(String y) {
    	this.direccion = y;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDinero(String z) {
    	this.dinero = z;
    }
    public String getDinero() {
    	return dinero;
    }
}



public class Servicio implements Producto{
	
	private String nombre;
    private int cant;
    private int precio;

	@Override
	public boolean estaDisponible(int cant) {
		if(cant>0)
			return true;
		return false;
	}

	@Override
	public int calcularTarifa(int cant) {
		return cant*this.precio;
	}
	
	public Servicio(String nombre, int cant, int precio) {
		this.nombre=nombre;
		this.cant=cant;
		this.precio=precio;
    }
	
	public int getCant() {
		return this.cant;
	}

	@Override
	public int getPrecio() {
		return this.precio;
	}

	@Override
	public String getNombre() {
		return this.nombre;
	}
}

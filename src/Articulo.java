
public class Articulo implements Producto{
	
	private String nombre;
    private int cantDisponible;
    private int precioUnitario;

	@Override
	public boolean estaDisponible(int cantDisponible) {
		if(cantDisponible>0)
			return true;
		return false;
	}

	
	public boolean haySuficienteStock(int cantALlevar, int cantDisponible) {
		if(cantALlevar<cantDisponible)
			return true;
		return false;
	}
	@Override
	public int calcularTarifa(int cantALlevar) {
		if(haySuficienteStock(cantALlevar,cantDisponible))
			return cantALlevar*this.precioUnitario;
		return 0;
	}
	
	public Articulo(String nombre, int cantDisponible, int precioUnitario) {
		this.nombre=nombre;
		this.cantDisponible=cantDisponible;
		this.precioUnitario=precioUnitario;
    }
	
	
	@Override
	public int getCant() {
		return this.cantDisponible;
	}

	@Override
	public int getPrecio() {
		return this.precioUnitario;
	}

	@Override
	public String getNombre() {
		return this.nombre;
	}
}

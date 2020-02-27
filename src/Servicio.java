
public class Servicio implements Producto{
	
	private String nombre;
    private int cantHoras;
    private int precioXHora;

	@Override
	public boolean estaDisponible(int cantHoras) {
		if(cantHoras>0)
			return true;
		return false;
	}

	public boolean haySuficientesHoras(int cantAContratar, int cantHoras) {
		if(cantAContratar<cantHoras)
			return true;
		return false;
	}
	
	
	@Override
	public int calcularTarifa(int cantAContratar) {
		if(haySuficientesHoras(cantAContratar,cantHoras))
			return (cantAContratar*this.precioXHora*2);
		return 0;
	}
	
	public Servicio(String nombre, int cantHoras, int precioXHora) {
		this.nombre=nombre;
		this.cantHoras=cantHoras;
		this.precioXHora=precioXHora;
    }
	
	@Override
	public int getCant() {
		return this.cantHoras;
	}

	@Override
	public int getPrecio() {
		return this.precioXHora;
	}

	@Override
	public String getNombre() {
		return this.nombre;
	}
}

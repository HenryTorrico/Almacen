import java.util.LinkedList;
import java.util.List;

public class Venta {
	List<Producto> listaProductos = new LinkedList<>();
	
	public void addProduct(Producto producto) {
		this.listaProductos.add(producto);
	}
	
	public int rate(Producto producto) {
		return producto.calcularTarifa(1);
	}
	
	public int calculate(List<Producto> listaProductos) {
		int total=0;
		for(Producto product:listaProductos) {
			total=total+rate(product);
		}
		return total;
	}
	
	public List<Producto> getProducts() {
		return listaProductos;
	}
}


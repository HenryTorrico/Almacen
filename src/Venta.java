import java.util.LinkedList;
import java.util.List;

public class Venta {
	int total = 0;
	List<Producto> listaProductos = new LinkedList<>();
	
	public void addProduct(Producto producto) {
		this.listaProductos.add(producto);
	}
	
	public int rate(Producto producto) {
		return producto.calcularTarifa(producto.getCant());
	}
	
	public int calculateSale(List<Producto> listaProductos) {
		for(Producto product:listaProductos) {
			total=total+rate(product);
		}
		return total;
	}
	
	public List<Producto> getProducts() {
		return listaProductos;
	}
}


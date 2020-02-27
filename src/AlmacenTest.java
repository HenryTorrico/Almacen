import java.util.LinkedList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import junit.framework.Assert;

public class AlmacenTest {
	
	@Test
	public void testForAvailableService() {
		Producto prod1 = new Servicio("Lavanderia",10,30); 
		Assert.assertEquals(true, prod1.estaDisponible( 4)); 
	}
	
	@Test
	public void testForCalculateServiceRate() {
		Producto prod2 = new Servicio("Lavanderia",10,30); 
		Assert.assertEquals(240, prod2.calcularTarifa(4)); 
	}
	
	@Test
	public void testForAvailableArticle() {
		Producto prod3 = new Articulo("Vasos",12,25);
		Assert.assertEquals(true, prod3.estaDisponible(3)); 

	}
	@Test
	public void testForCalculateArticleRate() {
		Producto prod4 = new Articulo("Vasos",5,25); 
		Assert.assertEquals(75, prod4.calcularTarifa(3)); 
	}
	
	@Test
	public void testForCreateProducts() {
		Venta venta=new Venta();
		Producto plomeria = new Servicio("Plomeria",10,20); // 3.2
		Producto platos = new Articulo("Platos",24,15); // 15
		Producto electricista = new Servicio("Electricista",8,30); // 4.8
		Producto sarten = new Articulo("Sarten",12,60); // 60
		venta.listaProductos.add(plomeria);
		venta.listaProductos.add(platos);
		venta.listaProductos.add(electricista);
		venta.listaProductos.add(sarten);
		Assert.assertEquals(175, venta.calculate(venta.getProducts())); 
	}
	
}

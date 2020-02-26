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
		Assert.assertEquals(120, prod2.calcularTarifa(4)); 
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
	
}

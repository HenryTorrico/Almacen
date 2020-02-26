import org.junit.Before;
import org.junit.Test;
import junit.framework.Assert;

public class AlmacenTest {
	
	@Test
	public void testForAvailableService() {
		Producto prod1 = new Servicio("Lavanderia",5,25); 
		Assert.assertEquals(true, prod1.estaDisponible( prod1.getCant())); 
	}
	
	@Test
	public void testForCalculateServiceRate() {
		Producto prod2 = new Servicio("Lavanderia",5,25); 
		Assert.assertEquals(125, prod2.calcularTarifa(prod2.getCant())); 
	}
	
	@Test
	public void testForAvailableArticle() {
		Producto prod3 = new Articulo("Vasos",12,25);
		Assert.assertEquals(true, prod3.estaDisponible(prod3.getCant())); 

	}
	@Test
	public void testForCalculateArticleRate() {
		Producto prod4 = new Articulo("Vasos",5,25); 
		Assert.assertEquals(125, prod4.calcularTarifa(prod4.getCant())); 
	}
	
}

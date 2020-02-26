import org.junit.Before;
import org.junit.Test;
import junit.framework.Assert;

public class AlmacenTest {
	
	@Test
	public void testForCreateProduct() {
		Producto prod1 = new Servicio("Lavanderia",5,25); 
		Assert.assertEquals(true, prod1.estaDisponible(prod1.getCant())); 
	}
	
	
}

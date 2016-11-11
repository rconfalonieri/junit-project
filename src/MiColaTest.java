import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class MiColaTest {
	
	public MiCola miCola;
	
	@Before
	public void setUp() throws Exception {
		
		miCola = new MiCola(3);
		miCola.insertMensaje("1");
		miCola.insertMensaje("2");
		miCola.insertMensaje("3");
	}

	@Test
	public void testInsertMensaje() {
		
		ArrayList<String> array = new ArrayList<String>();
		array.add("2");
		array.add("3");
		array.add("4");
		
		miCola.insertMensaje("4");
		
		assertEquals(array,miCola.getListaElementos());
		
	}

}

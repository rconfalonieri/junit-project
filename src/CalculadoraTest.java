import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void testCalculaSuma() {
		Calculadora c = new Calculadora();
		assertEquals(c.calculaSuma(2, 3),5);
	}

	
	@Test
	public void testCalculaSuma2() {
		Calculadora c = new Calculadora();
		assertEquals(c.calculaSuma(0, 3),5);
	}
}

package Estequiometria;

import static org.junit.Assert.*;

import org.junit.Test;

public class PesosMolecularTest {

	PesosMoleculares calculadora = new PesosMoleculares();
	
	@Test
	public void testCalcularDosLetrasDigito() {
		
		double resultado = calculadora.pesoMolecularTotal("Fe2");
		double esperado = 55.847*2;
		assertEquals(esperado, resultado, 0.001);
	}

	@Test
	public void testCalcularDosLetras() {
		
		double resultado = calculadora.pesoMolecularTotal("He");
		double esperado = 4.0026;
		assertEquals(esperado, resultado, 0.001);
	}
	
	@Test
	public void testCalcularUnaLetra() {
		
		double resultado = calculadora.pesoMolecularTotal("K");
		double esperado = 39.102;
		assertEquals(esperado, resultado, 0.001);
	}
	
	@Test
	public void testCalcularCompuesto1() {
		
		double resultado = calculadora.pesoMolecularTotal("H2 O");
		double esperado = 18.01534;
		assertEquals(esperado, resultado, 0.000);
	}
	
	@Test
	public void testCalcularCompuesto2() {
		
		double resultado = calculadora.pesoMolecularTotal("H Cl");
		double esperado = 36.46097;
		assertEquals(esperado, resultado, 0.001);
	}
	
	@Test
	public void testCalcularCompuesto3() {
		
		double resultado = calculadora.pesoMolecularTotal("H2 O2");
		double esperado = 34.01474;
		assertEquals(esperado, resultado, 0.1);
	}
	
	@Test
	public void testCalcularCompuesto4() {
		
		double resultado = calculadora.pesoMolecularTotal("H H");
		double esperado = 2.005;
		assertEquals(esperado, resultado, 0.5);
	}
	
	@Test
	public void testCaluclarCompuesto5(){
		
		double resultado = calculadora.pesoMolecularTotal("H2 Cl2");
		double esperado = 1.00797*2 + 35.453*2;
		assertEquals(esperado, resultado, 0.0);
	}
	
	@Test
	public void testCaluclarCompuesto6(){
		
		double resultado = calculadora.pesoMolecularTotal("(O H)2");
		double esperado = (15.9994 + 1.00797)*2;
		assertEquals(esperado, resultado, 0.0);
	}
	
	@Test
	public void testCaluclarCompuesto7(){
		
		double resultado = calculadora.pesoMolecularTotal("H O (O H)2");
		double esperado = 51.02211;
		assertEquals(esperado, resultado, 0.0);
	}
	
	@Test
	public void testCaluclarCompuesto8(){
		
		double resultado = calculadora.pesoMolecularTotal("2 H O (O H)2");
		double esperado = 2*51.02211;
		assertEquals(esperado, resultado, 0.0);
	}
}

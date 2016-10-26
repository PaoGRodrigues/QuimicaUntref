package Estequiometria;

public class Reaccion {

	private int A, B, C, D;
	private String reactivo1, reactivo2, producto1, producto2;
	private PesosMoleculares calculador;
	
	/*
	 * A: moles del reactivo1.
	 *
	 * B: moles del reactivo2.
	 *
	 * C: moles del producto1.
	 * 
	 * D: moles del producto2.
	 * 
	 */
	public Reaccion(int A, String reactivo1, int B, String reactivo2, 
			int C, String producto1, int D, String producto2){

		this.A = A;
		this.B = B;
		this.C = C;
		this.D = D;
		
		this.reactivo1 = reactivo1;
		this.reactivo2 = reactivo2;
		this.producto1 = producto1;
		this.producto2 = producto2;
		
		this.calculador = new PesosMoleculares();
	}
	
	
	public double calcularPesoMolecularReactivo1(){
		
		return this.A*calculador.pesoMolecularTotal(this.reactivo1);
	}

	public double calcularPesoMolecularReactivo2(){
		
		return this.B*calculador.pesoMolecularTotal(this.reactivo2);
	}
	
	public double calcularPesoMolecularProducto1(){
			
		return this.C*calculador.pesoMolecularTotal(this.producto1);	
	}
	
	public double calcularPesoMolecularProducto2(){
		
		return this.D*calculador.pesoMolecularTotal(this.producto2);
	}
}

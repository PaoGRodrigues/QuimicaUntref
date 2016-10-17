
/*
 * Notaciones:
 *  1) SLC = solucion.
 *  2) SLV = solvente.
 *  3) SLT = soluto.
 *  4) CONC = concentracion.
 */


public class Concentrador {

	private double soluto;
	private double solvente;
	private double solucion; 

	//Los valores ingresados no pueden ser negativos.
	public Concentrador(int soluto, int solvente, int solucion){
		
		this.soluto = soluto;
		this.solvente = solvente;
		this.solucion = solucion;
	}
	
	double masaMasa (){
		
		// Regla de 3
		// X solucion -> Y soluto
		// 100 g solucion -> ?
		
		double conc = (100*this.soluto)/this.solucion;
		
		return conc;
	}
	
	double masaVolumen (){
		
		// Regla de 3
		// X solucion -> Y soluto
		// 0,100 L solucion -> ?
		
		double conc = (100*this.soluto)/this.solucion;
		
		return conc;
	}
	
	

}

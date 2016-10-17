package Estequiometria;

public class ReactivoLimitante {	
	
	private void calcularLimitante(double reactivo1, double reactivo2,double purezaReactivo1, double purezaReactivo2){
		double reaccionReactivo2;
		String reactivoLimitante;
		reaccionReactivo2 = (purezaReactivo1 * reactivo2) / reactivo1;
		
		if (reaccionReactivo2 < purezaReactivo2) {
//			reactivoLimitante = reactivo2;
		} else {
//			reactivoLimitante = reactivo1;
		}
	}
	
	private double calcularPureza(double valorElemento, double porcentajePureza){
		return (porcentajePureza * valorElemento)/100;
	}
	
	private double calcularGramosPorMol(double gramosElemento, double moles) {
		double molesPorElemento = Math.pow((6*10), 22);
		return (molesPorElemento * moles) / gramosElemento;
	}
	
	private double calcularMolPorGramos(double gramosElemento, double PMElemento){
		double molesPorElemento = Math.pow((6*10), 22);
		return (gramosElemento * molesPorElemento)/gramosElemento;
	}
	
	private double calcularLitrosDeElemento(double molElemento) {
		double litrosPorMol = 22.4;
		return (molElemento*litrosPorMol);
	}
	
	private double calcularLitrosDeElementoConPesos(double gramosElemento, double PMElemento){
		double litrosPorMol = 22.4;
		return(gramosElemento*litrosPorMol)/PMElemento;
	}
	
}

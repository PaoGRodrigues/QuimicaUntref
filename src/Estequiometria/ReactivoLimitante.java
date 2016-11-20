package Estequiometria;

public class ReactivoLimitante {	
	
	private PesosMoleculares calculador;
	final double litrosUnMol = 22.4;
	private double cantidadReactivoLimitante;
	
	private Reaccion reaccionActual;
	
	public ReactivoLimitante(Reaccion reaccionActual){
		
		this.reaccionActual = reaccionActual;
		this.calculador = new PesosMoleculares();
		this.cantidadReactivoLimitante = 0;
	}
	
	public String reactivoLimitante(double gramosReactivo1, double gramosReactivo2){
		
		String reactivoLimitante;
		
		this.cantidadReactivoLimitante = (gramosReactivo1 * gramosReactivo2) / gramosReactivo2;
		
		if (this.cantidadReactivoLimitante < gramosReactivo2) {
			reactivoLimitante = this.reaccionActual.getReactivo2();
		} else {
			reactivoLimitante = this.reaccionActual.getReactivo1();
		}
		
		return reactivoLimitante;
	}
	
	public double getCantidadReactivoLimitante(){
		
		return this.cantidadReactivoLimitante;
	}

	/***************************************************
	* Pre: el porcentaje tiene que ser un valor entre 0-100 y los gramos del elemento tienen que ser mayores a 0.
	* 
	* Post: Devuelve la pureza del reactivo.
	* 
	* @Param gramosReactivo: gramos del reactivo.
	* @Param pureza: porcentaje de Pureza del reactivo.
	*
	***************************************************/
	public double calcularPureza(double gramosElemento, double pureza){
		return (pureza * gramosElemento)/100;
	}

	
	/***************************************************
	* Pre: el porcentaje tiene que ser un porcentaje entre 0-100 y los gramos del elemento tienen que ser mayores a 0.
	* 
	* Post: Devuelve los moles en una determinada cantidad del elemento (en gramos)
	* 
	* @Param gramosReactivo: gramos del reactivo/producto.
	* @Param elemento: elemento del cual se quiere calcular la cantidad de moles en dicha cantidad de gramos.
	*
	***************************************************/
	public double molPorGramos(double gramosElemento, String elemento){
		return (gramosElemento/calculador.pesoMolecularTotal(elemento));
	}
	
	
	/***************************************************
	* Pre: la cantidad de moles tiene que ser positiva.
	* 
	* Post: Devuelve los litros que ocupa determinada cantidad de moles de un elemento.
	* 
	* @Param molesElemento: moles del reactivo/producto.
	*
	***************************************************/
	public double litrosDeElementoMoles(double molesElemento) {
		return (molesElemento*this.litrosUnMol);
	}
	
	
	/***************************************************
	* Pre: la cantidad del elemento debe ser positiva.
	* 
	* Post: Devuelve los litros que ocupa determinada cantidad de moles de un elemento.
	* 
	* @Param gramosElemento: moles del reactivo/producto.
	* @Param PMElemento: peso molecular del elemento.
	*
	***************************************************/
	public double litrosDeElementoGramos(double gramosElemento, String elemento){
		return(gramosElemento*this.litrosUnMol)/calculador.pesoMolecularTotal(elemento);
	}
	
}

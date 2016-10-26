package Estequiometria;

import java.util.LinkedList;
import java.util.List;

public class PesosMoleculares {
	
	public PesosMoleculares() {
		
		inicializarTabla();
	}
		
	private List <Elemento> elementos2 = new LinkedList<Elemento>();
	
	private void inicializarTabla(){
		
		//El primero no va
		this.elementos2.add(0, new Elemento(null,null, 0.0));
		this.elementos2.add(1, new Elemento("H","HIDROGENO", 1.00797));
		this.elementos2.add(2, new Elemento("He","HELIO", 4.0026));
		this.elementos2.add(3, new Elemento("Li","LITIO", 6.939));
		this.elementos2.add(4, new Elemento("Be","BERILIO", 9.0122));
		this.elementos2.add(5, new Elemento("B","BORO", 10.811));
		this.elementos2.add(6, new Elemento("C","CARBONO", 12.01115));
		this.elementos2.add(7, new Elemento("N","NITROGENO", 14.0067));
		this.elementos2.add(8, new Elemento("O","OXIGENO", 15.9994));
		this.elementos2.add(9, new Elemento("F","FLUOR", 18.9984));
		this.elementos2.add(10, new Elemento("Ne","NEON", 20.183));
		this.elementos2.add(11, new Elemento("Na","SODIO", 22.9898));
		this.elementos2.add(12, new Elemento("Mg","MAGNESIO", 24.312));
		this.elementos2.add(13, new Elemento("Al","ALUMINIO", 26.9815));
		this.elementos2.add(14, new Elemento("Si","SILICIO", 28.086));
		this.elementos2.add(15, new Elemento("P","FOSFORO", 30.9738));
		this.elementos2.add(16, new Elemento("S","AZUFRE", 32.064));
		this.elementos2.add(17, new Elemento("Cl","CLORO", 35.453));
		this.elementos2.add(18, new Elemento("Ar","ARGON", 39.948));
		this.elementos2.add(19, new Elemento("K","POTASIO", 39.102));
		this.elementos2.add(20, new Elemento("Ca","CALCIO", 40.08));
		this.elementos2.add(21, new Elemento("Sc","ESCANDIO", 44.956));
		this.elementos2.add(22, new Elemento("Ti","TITANIO", 47.90));
		this.elementos2.add(23, new Elemento("V","VANADIO", 50.942));
		this.elementos2.add(24, new Elemento("Cr","CROMO", 51.996));
		this.elementos2.add(25, new Elemento("Mn","MANGANESO", 54.938));
		this.elementos2.add(26, new Elemento("Fe","HIERRO", 55.847));
		this.elementos2.add(27, new Elemento("Co","COBALTO", 58.9332));
		this.elementos2.add(28, new Elemento("Ni","NIQUEL", 58.71));
		this.elementos2.add(29, new Elemento("Cu","COBRE", 63.54));
		this.elementos2.add(30, new Elemento("Zn","CINC", 65.37));
		this.elementos2.add(31, new Elemento("Ga","GALIO", 69.72));
		this.elementos2.add(32, new Elemento("Ge","GERMANIO", 72.59));
		this.elementos2.add(33, new Elemento("As","ARSENICO", 74.922));
		this.elementos2.add(34, new Elemento("Se","SELENIO", 78.96));
		this.elementos2.add(35, new Elemento("Br","BROMO", 79.909));
		this.elementos2.add(36, new Elemento("Kr","KRIPTON", 83.80));
		this.elementos2.add(37, new Elemento("Rb","RUBIDIO", 85.47));
		this.elementos2.add(38, new Elemento("Sr","ESTRONCIO", 87.62));
		this.elementos2.add(39, new Elemento("Y","ITRIO", 88.905));
		this.elementos2.add(40, new Elemento("Zr","CIRCONIO", 91.22));
		this.elementos2.add(41, new Elemento("Nb","NIOBIO", 92.906));
	}
	
	
	/***************************************************
	* Post: Devuelve el nombre del elemento a partir del numero atomico.
	* 
	* @Param numAtomico: numero entero perteneciente a uno de los elementos de la tabla
	* 						periodica.
	*
	***************************************************/
	public String getElemento(int numAtomico){
		
		return this.elementos2.get(numAtomico).getNombre();
	}
	
	
	/***************************************************
	* Post: Devuelve el numero masico del elemento al cual pertenece el simbolo.
	* 
	* @Param simbolo: Elemento de la tabla periodica.
	*
	***************************************************/
	private double getNumMasico(String simbolo){
		
		double numMasico =0;
	
		int i = this.elementos2.size()-1;
		
		Elemento uno;
		while(i != 0){

			uno = this.elementos2.get(i);

			if(uno.getSimbolo().equals(simbolo)){
				
				numMasico = uno.getNumMasico();
			}
			i--;
		}
		
		return numMasico;
	}
	
	
	/***************************************************
	* Pre: Este metodo calculara el peso relativo a cada elemento dentro del compuesto.
	* 		Ej: Si anteriormente se ingreso "H2 O", calculara el peso de H2 y el peso de O 
	* 			para que luego el metodo "pesoMolecularTotal" pueda sumarlos.
	* 
	* Post: Se obtiene el peso molecular del elemento del compuesto.
	* 
	* @Param elementoDelCompuesto: Elemento del cual se quiere calcular el peso.
	*
	***************************************************/
	private double calcularPeso(String elementoDelCompuesto){
		
		char[] listaOrigen = elementoDelCompuesto.toCharArray();
		int i = 0;
		int PM = 0;
		StringBuilder constructor = new StringBuilder();
		String simboloCompuestoIngresado = null;
		double resultado = 0.0;
		double auxiliar = 0.0;
		
		while(i<=listaOrigen.length-1){
			
			if(Character.isLetter(listaOrigen[i])){
								
				if((i+1)<=listaOrigen.length-1){
					
					//Si el siguiente caracter al que estamos es una letra y es minúscula: 
					if(Character.isLetter(listaOrigen[i+1]) && Character.isLowerCase(listaOrigen[i+1])){
						
						//Armo el simbolo del compuesto.
						simboloCompuestoIngresado = constructor.append(listaOrigen[i]).append(listaOrigen[i+1]).toString();
						i=i+2;
						
						if(i<=listaOrigen.length-1){
						
							//Si el siguiente caracter es un digito:
							if(Character.isDigit(listaOrigen[i])){
								
								//multiplico el digito por el numero masico.
								PM = Integer.parseInt(Character.toString(listaOrigen[i]));
								
								auxiliar = this.getNumMasico(simboloCompuestoIngresado)*PM;
							}
							
						}else{
							
							//si no es un digito, sumo el numero masico.
							auxiliar = this.getNumMasico(simboloCompuestoIngresado);
						}
					
					}else if(Character.isDigit(listaOrigen[i+1])){
						
						auxiliar = this.getNumMasico(Character.toString(listaOrigen[i]))* Integer.parseInt(Character.toString(listaOrigen[i+1]));
						
					}else{
						
						auxiliar = this.getNumMasico(Character.toString(listaOrigen[i]));
					}
					
				}else{
					
					auxiliar = this.getNumMasico(Character.toString(listaOrigen[i]));
				}
				
				resultado = resultado + auxiliar;
			}
			
			i++;
		}
		
		return resultado;
	}
	
	
	/***************************************************
	* Pre: Los elementos del componente ingresado tiene que estar separado
	* 		por un espacio. Ej: H2O sera ingresado como "H2 O".
	* 
	* Post: Se obtiene el peso molecular de todo el compuesto.
	*
	*@Param molecula: Compuesto del cual se quiere calcular el peso molecular.
	*
	***************************************************/
	public double pesoMolecularTotal(String molecula){
		
		double resultado = 0.0;
		
		String[] componentes = molecula.split(" ");
		 
		for (int i = 0; i < componentes.length; i++) {
			
			resultado = resultado + this.calcularPeso(componentes[i]);
		}
		
		return resultado;
	}

}

package Estequiometria;

// A = Número másico
// Nombre = nombre del elemento

public class Elemento {

	private double A;
	private String nombre;
	private String simbolo;
	
	public Elemento(String simbolo, String name, double numMasico){
		
		this.simbolo = simbolo;
		this.A = numMasico;
		this.nombre = name;
	}
	
	//---------------------------------------------------------------
	public String getSimbolo() {
		return simbolo;
	}

	public void setSimbolo(String simbolo) {
		this.simbolo = simbolo;
	}
	//---------------------------------------------------------------
	public double getNumMasico() {
		return A;
	}
	
	public void setNumMasico(int a) {
		A = a;
	}
	//---------------------------------------------------------------
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	//---------------------------------------------------------------
}

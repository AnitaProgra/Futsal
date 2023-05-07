package equipo;


import java.util.ArrayList;

public class Jugador{
	String nombre; 
	Integer precio;
	Integer edad; 
	int amonestacion; 
	int minutos_de_la_amonestacion = 120;
	boolean expulsado; 

    

///////////////////////CONSTRUCTORES////////////////////////////////////// 
	public Jugador() {

	}
	
	public Jugador(String nombre) {

	}
	

	
	public Jugador(int amonestacion, String nombre, int minutos_de_la_amonestacion) {
    this.amonestacion=amonestacion; 
    this.nombre=nombre; 
    this.minutos_de_la_amonestacion= minutos_de_la_amonestacion;
	}
	
	
	
    public Jugador(String nombre, Integer precio, Integer edad) {
	this.nombre=nombre; 
	this.precio=precio; 
	this.edad=edad; 
}
///////////////////METODOS////////////////////////////////////////////

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}






public Integer getPrecio() {
	return precio;
}




public void setPrecio(Integer precio) {
	this.precio = precio;
}




public double getEdad() {
	return edad;
}




public void setEdad(Integer edad) {
	this.edad = edad;
}



public void setJugador(String nombre, Integer precio, Integer edad) {
	this.nombre= nombre;
	this.precio=precio;
	this.edad=edad;
	
}


public boolean getJugador() {
	return true;
}

public boolean estaAmonestado() {
	
	return false;
}

  /*public boolean amonestarUnJugador() {
	ArrayList <Jugador> amonestados = new ArrayList<Jugador>(); 
	amonestados.add(new Jugador(1, "jose", 15)); 

	
	if ( amonestacion == 1) {
	return getAmonestacion();
	}

   return false;
  }      

*/



}
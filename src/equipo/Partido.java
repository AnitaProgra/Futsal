package equipo;

import java.util.ArrayList;
import java.util.List;

public class Partido extends Jugador{
	 ArrayList<Jugador> jugadoresLocal;
	 ArrayList<Jugador> jugadoresVisitante;
     Integer golesLocal;
     Integer golesVisitante;
     String resultado;
     String datosDeLosGoles;
     String fecha;
     ArrayList <Jugador> amonestados ;
	private Jugador jugador; 
  
     
     public Partido(String fecha){
  	}
     
     
     public Partido(){
  	jugadoresLocal=new ArrayList<Jugador>(); 
  	jugadoresVisitante=new ArrayList<Jugador>(); 
  	
  	}
    
   /*  public Partido(ArrayList<Jugador> jugadoresLocal, ArrayList<Jugador> jugadoresVisitante){
    	 jugadoresLocal = new ArrayList<Jugador>();
         equipoVisitante = new ArrayList<Jugador>();
   	}
     */
    
 

	public boolean crearPartido(ArrayList<Jugador> jugadoresLocal, ArrayList<Jugador> jugadoresVisitante) {
        if (jugadoresLocal.size() == 5 && jugadoresVisitante.size() == 5) {
           return true;
        }
        return false;
    }
      


     public void registrarAmonestado(Jugador jugador, int minutos_de_la_amonestacion) {
			
	amonestados.add(jugador); 

	}
     
     

public void setAmonestacion(int amonestacion, Jugador jugador, int minutos_de_la_amonestacion) {
 this.amonestacion=amonestacion; 
 this.jugador=jugador; 
 this.minutos_de_la_amonestacion=minutos_de_la_amonestacion; 
}



public boolean getExpulsado() {
	if (amonestacion==2 && minutos_de_la_amonestacion<=120) {
		return true; 	
		}
		else {
		return false; }
}


public void setExpulsado(int amonestacion, Jugador jugador, int minutos_de_la_amonestacion) {
	this.amonestacion = amonestacion;
	 this.jugador=jugador; 
	this.minutos_de_la_amonestacion=minutos_de_la_amonestacion;
}


/*
public boolean getAmonestacion() {
	if (amonestacion==1 && minutos_de_la_amonestacion<=120) {
	return true; 	
	}
	else {
	return false;}
} */




//////////////////////////////////////////////////////////////////////////////////////////////////
public void registrarGol(int minuto, Jugador jugador) {
    if (minuto > 120 && jugadoresLocal != jugadoresVisitante ) {
       golesLocal++; 
    } 
    else if (minuto > 120 && jugadoresVisitante != jugadoresLocal ) {
        golesVisitante++; 
     } 
}
 


public int getGolesLocal() {
	return golesLocal;
}

public int getGolesVisitante() {
	return golesVisitante;
}


public void add(Jugador jugador) {
	jugadoresVisitante.add(jugador);
}

}








  /* 
   public String toString () {
   
	return amonestacion + " " + nombre+ " " + amonestacion_minuto; 
	}
*/








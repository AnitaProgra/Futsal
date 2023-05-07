package equipo;

import java.util.ArrayList;
import java.util.List;

public class Equipo extends Jugador{
	ArrayList <Jugador> listaJugadores; 
    private String nombreEquipo; 

    
    
    
    public Equipo(String nombreEquipo, ArrayList<Jugador> listaJugadores ) {
		this.nombreEquipo = nombreEquipo;
		listaJugadores = new ArrayList<Jugador>();
	}
    
    public Equipo() {
  
	}
   
   /*    public void add(Jugador jugador) {
        listaJugadores.add(jugador);
    }
*/
    
/////////////////METODOS/////////////////


	public String getNombreEquipo() {
		return nombreEquipo;
	}
	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}


   

	
	public boolean agregarLosJugadoresALosEquipos(ArrayList <Jugador> listaJugadores) {
		if(listaJugadores.size() == 5){
            return true; 
        }
		
		return false;
		
	}
	
     public double valorTotalDelEquipo(ArrayList<Jugador> listaJugadores) {
    	 int sumaPrecios = 0;
         for (Jugador p : listaJugadores) {
             sumaPrecios += p.getPrecio();
         }
         
        return sumaPrecios;
     }     
     
       
     
     public double promedioEdadDelEquipo(ArrayList <Jugador> listaJugadores) {
    	 int sumaEdades = 0;
         for (Jugador p : listaJugadores) {
             sumaEdades += p.getEdad();
         }
         
        return sumaEdades / listaJugadores.size();
     }     	
 
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
      }     
     
     
     
     
     
     
     


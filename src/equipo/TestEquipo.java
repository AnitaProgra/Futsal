package equipo;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TestEquipo {

	@Test
	public void queSeAgregueUnJugador() {
     Jugador actual= new Jugador();
     actual.setJugador("Daniel Mendez", 500, 30);
		
	assertTrue(actual.getJugador());  
	}

	///////////////////////////////////////////////////////////////////////
	@Test
	public void agregarLosJugadoresALosEquipos() {
     Equipo boca = new Equipo();
    ArrayList <Jugador> listaJugadores = new ArrayList<Jugador>();   
 /*   Jugador jugador =new Jugador("pepe gomez", 5000, 30);
    Jugador jugador2 =new Jugador("messi lionel", 10000, 35);
    Jugador jugador3 =new Jugador("david ibanez", 4000, 33);
    Jugador jugador4 =new Jugador("raul perez", 5000, 37);
    Jugador jugador5 =new Jugador("dybala", 6000, 25);

 
    listaJugadores.add(jugador); 
    listaJugadores.add(jugador2); 
    listaJugadores.add(jugador3); 
    listaJugadores.add(jugador4); 
    listaJugadores.add(jugador5);    */ 
   
    
    listaJugadores.add(new Jugador("John raff", 2000, 80));
    listaJugadores.add(new Jugador("John juarez", 5000, 80));
    listaJugadores.add(new Jugador("John perez", 3000, 80));
    listaJugadores.add(new Jugador("John martinez", 5000, 80));
    listaJugadores.add(new Jugador("John gomez", 5000, 80));
  
    
   
	//assertTrue(listaJugadores.size()==5);
	assertTrue(boca.agregarLosJugadoresALosEquipos(listaJugadores));
	//assertEquals(5, listaJugadores.size());  
	}
	


	///////////////////////////////////////////////////////////////////////
	@Test
	public void valorTotalDelEquipo() {
	
		Equipo river = new Equipo();
	    ArrayList <Jugador> listaJugadores = new ArrayList<Jugador>();  
	       
	    listaJugadores.add(new Jugador("John raff", 2000, 80));
	    listaJugadores.add(new Jugador("John juarez", 5000, 80));
	    listaJugadores.add(new Jugador("John perez", 3000, 80));
	    listaJugadores.add(new Jugador("John martinez", 5000, 80));
	    listaJugadores.add(new Jugador("John gomez", 5000, 80));
	    
	    
	    ArrayList <Jugador> listaJugadores2 = new ArrayList<Jugador>();  
	       
	    listaJugadores2.add(new Jugador("John raff", 1000, 80));
	    listaJugadores2.add(new Jugador("John juarez", 5000, 80));
	    listaJugadores2.add(new Jugador("John perez", 3000, 80));
	    listaJugadores2.add(new Jugador("John martinez", 5000, 80));
	    listaJugadores2.add(new Jugador("John gomez", 5000, 80));
	    
	    double valorEsperado= 19000.0; 
	
	    
	    assertEquals(valorEsperado, river.valorTotalDelEquipo(listaJugadores2), 0.0);
	   
	}
	
	///////////////////////////////////////////////////////////////////////
	
	@Test
	public void promedioEdadesEquipo() {
	 Equipo river= new Equipo();
	 ArrayList <Jugador> listaJugadores = new ArrayList<Jugador>();  
     
	    listaJugadores.add(new Jugador("John raff", 2000, 30));
	    listaJugadores.add(new Jugador("John juarez", 5000, 25));
	    listaJugadores.add(new Jugador("John perez", 3000, 20));
	    listaJugadores.add(new Jugador("John martinez", 5000, 35));
	    listaJugadores.add(new Jugador("John gomez", 5000, 32));
	    
	    double valorEsperado=28.4 ; 
    
	
       assertEquals(valorEsperado, river.promedioEdadDelEquipo(listaJugadores), 1.0);
	
	}
	////////////////////////////////////////////////////////////////////////
	
	@Test
	public void registarNuevoPartido() {
		
		Jugador local1 = new Jugador("messi");
        Jugador local2 = new Jugador("Pedro");
        Jugador local3 = new Jugador("Maria");
        Jugador local4 = new Jugador("Pablo");
        Jugador local5 = new Jugador("Morena");
        ArrayList<Jugador> jugadoresLocal = new ArrayList<>();
        jugadoresLocal.add(local1);
        jugadoresLocal.add(local2);
        jugadoresLocal.add(local3);
        jugadoresLocal.add(local4);
        jugadoresLocal.add(local5);
        
        
        // Creamos los jugadores del equipo visitante
        Jugador visitante1 = new Jugador("Juan");
        Jugador visitante2 = new Jugador("Pedro");
        Jugador visitante3 = new Jugador("Maria");
        Jugador visitante4 = new Jugador("Pedrito");
        Jugador visitante5 = new Jugador("Marta");

        ArrayList<Jugador> jugadoresVisitante = new ArrayList<>();
        jugadoresVisitante.add(visitante1);
        jugadoresVisitante.add(visitante2);
        jugadoresVisitante.add(visitante3);
        jugadoresVisitante.add(visitante4);
        jugadoresVisitante.add(visitante5);
     
        
        // Creamos los equipos
        Equipo equipoLocal = new Equipo("boca", jugadoresLocal);
        Equipo equipoVisitante = new Equipo("river", jugadoresVisitante);
        
        // Creamos el partido con los equipos creados
        Partido partido = new Partido();
        
        assertEquals(5, jugadoresVisitante.size());
        assertEquals(5, jugadoresLocal.size());
		
		assertTrue(partido.crearPartido(jugadoresVisitante, jugadoresVisitante));
	}
	
	//////////////////////////////////////////////////////////////////////
	@Test
	public void registarUnNuevoGol() {
		Jugador local1 = new Jugador("messi");
        Jugador local2 = new Jugador("Pedro");
        Jugador local3 = new Jugador("Maria");
        Jugador local4 = new Jugador("Pablo");
        Jugador local5 = new Jugador("Morena");
        ArrayList<Jugador> jugadoresLocal = new ArrayList<>();
        jugadoresLocal.add(local1);
        jugadoresLocal.add(local2);
        jugadoresLocal.add(local3);
        jugadoresLocal.add(local4);
        jugadoresLocal.add(local5);
        
        
        // Creamos los jugadores del equipo visitante
        Jugador visitante1 = new Jugador("Juan");
        Jugador visitante2 = new Jugador("Pedro");
        Jugador visitante3 = new Jugador("Maria");
        Jugador visitante4 = new Jugador("Pedrito");
        Jugador visitante5 = new Jugador("Marta");

        ArrayList<Jugador> jugadoresVisitante = new ArrayList<>();
        jugadoresVisitante.add(visitante1);
        jugadoresVisitante.add(visitante2);
        jugadoresVisitante.add(visitante3);
        jugadoresVisitante.add(visitante4);
        jugadoresVisitante.add(visitante5);
     
        
        // Creamos los equipos
        Equipo equipoLocal = new Equipo("boca", jugadoresLocal);
        Equipo equipoVisitante = new Equipo("river", jugadoresVisitante);
        
        // Creamos el partido con los equipos creados
        Partido partido = new Partido();
        
      partido.registrarGol(35, visitante3);
        partido.registrarGol(36, local3);
        partido.registrarGol(38, visitante4);
        partido.registrarGol(56, visitante2 );
        
	
        assertEquals(1, partido.getGolesLocal()); 
        
	}
	
	////////////////////////////////////////////////////////////////////
	
	@Test
	public void mostrarDatosGol() {
	Gol actual= new Gol();
	actual.setGol("messi", 30);
    String valorEsperado="messi 30"; 

    assertEquals(valorEsperado, actual.toString()) ;
	
	}
	
	///////////////////////////////////////////////////////////////////////
    @Test
	public void registarUnJugadorAmonestado() {
	Partido actual=new Partido(); 
	Equipo moronLocal = new Equipo();
	Equipo chacaritaVisitante = new Equipo();
	
	Jugador local1 = new Jugador("messi");
    Jugador local2 = new Jugador("Pedro");
    Jugador local3 = new Jugador("Maria");
    Jugador local4 = new Jugador("Pablo");
    Jugador local5 = new Jugador("Morena");
    ArrayList<Jugador> jugadoresLocal = new ArrayList<>();
    jugadoresLocal.add(local1);
    jugadoresLocal.add(local2);
    jugadoresLocal.add(local3);
    jugadoresLocal.add(local4);
    jugadoresLocal.add(local5);
    
    
    // Creamos los jugadores del equipo visitante
    Jugador visitante1 = new Jugador("Juan");
    Jugador visitante2 = new Jugador("Pedro");
    Jugador visitante3 = new Jugador("Maria");
    Jugador visitante4 = new Jugador("Pedrito");
    Jugador visitante5 = new Jugador("Marta");

    ArrayList<Jugador> jugadoresVisitante = new ArrayList<>();
    jugadoresVisitante.add(visitante1);
    jugadoresVisitante.add(visitante2);
    jugadoresVisitante.add(visitante3);
    jugadoresVisitante.add(visitante4);
    jugadoresVisitante.add(visitante5);
	// 10 instancias de jugadores . 5 p cada equipo

	
	actual.setAmonestacion(1, visitante5, 15);
	


   // assertTrue(actual.getAmonestacion(visitante3)) ;
    assertTrue(actual.getAmonestacion(visitante5));
	
	}  
	
	///////////////////////////////////////////////////////////////////////
     @Test
	public void registarUnJugadorExpulsado() {
    	 
    	 Partido actual= new Partido("14/07/2023");
  
    	 
		Jugador visitante1 = new Jugador("Juan");
	    Jugador visitante2 = new Jugador("Pedro");
	    Jugador visitante3 = new Jugador("Maria");
	    Jugador visitante4 = new Jugador("Pedrito");
	    Jugador visitante5 = new Jugador("Marta");
	    Jugador local6 = new Jugador("Juan");
	    Jugador local7 = new Jugador("Pedro");
	    Jugador local8 = new Jugador("Maria");
	    Jugador local9 = new Jugador("Pedrito");
	    Jugador local10 = new Jugador("Marta");

	    Partido boca= new Partido();
	   boca.add(visitante1);
	    boca.add(visitante2);
	    boca.add(visitante3);
	    boca.add(visitante4);
	    boca.add(visitante5);

	    Partido river= new Partido();
		   river.add(local6);
		    river.add(local7);
		    river.add(local8);
		    river.add(local9);
		    river.add(local10);

	    
	  
	    
	//visitante4.setAmonestacion(2, visitante4, 34);
	boca.setAmonestacion(1, visitante5, 12); 
	boca.setAmonestacion(1, visitante2, 12); 
	river.setAmonestacion(1, local6, 12); 
	boca.setAmonestacion(1, local6, 12); 
	
	
	
    assertEquals(4, river.amonestados.size());
	
	}	

	
}

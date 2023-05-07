package equipo;


public class Gol extends Partido {
	String autor;
	Integer minuto; 

	
	public Gol() { 
	}
	
	public Gol(String autor, int minuto) { 
	}
	
	
	public void setGol(String autor, int minuto) {
		this.autor=autor; 
		this.minuto=minuto;
	}
	
	public String toString() {
		return autor +" "+ minuto;
	}
	


	
	
	
	
    public String getAutor() {
		return autor;
	}



	public void setAutor(String autor) {
		this.autor = autor;
	}



	public Integer getMinuto() {
		return minuto;
	}



	public void setMinuto(Integer minuto) {
		this.minuto = minuto;
	}







}
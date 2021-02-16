import java.util.Calendar;
import java.util.Random;

public class Boleto {

	 
	  String folio;
	  String modelo;
	  int hora;
	  int min;
	  int segundos;
	  
	  public Boleto (String modelo) {
		  
		  this.modelo=modelo;
		  
		  hora=Calendar.getInstance().getTime().getHours();
		  min=Calendar.getInstance().getTime().getMinutes();
		  segundos=Calendar.getInstance().getTime().getSeconds();
		  this.folio=generaFolio();
	  }
	  
   public String generaFolio(){
         Random r = new Random();
         int[] arreglo=new int[4];
         String folio="";
        for(int i=0;i<arreglo.length;i++){
        	int x; //Boleto
            	arreglo[i] = r.nextInt(100) + 1; 
            	x=arreglo[i];
            	
            }
        
        for(int x=0; x<arreglo.length;x++){
        	folio=folio+arreglo[x];
        }
        
        return String.valueOf(folio);
        
        }

public String getFolio() {
	return folio;
}

public void setFolio(String folio) {
	this.folio = folio;
}

public String getModelo() {
	return modelo;
}

public void setModelo(String modelo) {
	this.modelo = modelo;
}

public int getHora() {
	return hora;
}

public void setHora(int hora) {
	this.hora = hora;
}

public int getMin() {
	return min;
}

public void setMin(int min) {
	this.min = min;
}

public int getSegundos() {
	return segundos;
}

public void setSegundos(int segundos) {
	this.segundos = segundos;
}
   
   
}
   


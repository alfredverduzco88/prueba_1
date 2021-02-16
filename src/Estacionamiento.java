import java.util.Calendar;
import java.util.GregorianCalendar;

public class Estacionamiento {
	
	static Boleto[] listaBoletos= new Boleto[8];
	
	//Se crea por default el constructor
	public Estacionamiento()
	{
		listaBoletos= new Boleto[8];
	}
	
	public static String registrarEntrada(Boleto nuevoBoleto){
		//agregar boleto
		    
		     String HI=null;
				boolean agregado=false;
				Calendar calendario = new GregorianCalendar();
				 int hora, minutos, segundos;	
				 hora =calendario.get(Calendar.HOUR_OF_DAY);
				 minutos = calendario.get(Calendar.MINUTE);
				 segundos = calendario.get(Calendar.SECOND);
			 
				HI=(hora + ":" + minutos + ":" + segundos);
				for(int x=0; x<listaBoletos.length; x++) {
					
				
					if(listaBoletos[x]==null && agregado==false ) {
						listaBoletos[x]=nuevoBoleto;
						agregado=true;
						return ("EL CARRO SE HA AGREGADO :" )+
						" "+
					  "A la hora ;" +HI;
		}
		 }
				return "EL CARRO SE HA AGREGADO :" +
						" "+
						 "A la hora ;" +HI;
		
	}
	//Agregar metodo de cobrar
	 @SuppressWarnings("deprecation")
	public static String cobrarBoleto(String folio) {
		 Calendar calendario = new GregorianCalendar();
		 int hora, minutos, segundos;	
		 hora =calendario.get(Calendar.HOUR_OF_DAY);
		 minutos = calendario.get(Calendar.MINUTE);
		 segundos = calendario.get(Calendar.SECOND);
	 
		
		 
		return null;
			}
			
		
	 
	//Agregar metodo de Registrar salida
	public static String registrarSalida(String folio) {
		String HF=null;
		Calendar calendario = new GregorianCalendar();
		 int hora1, minutos1, segundos1;	
		 hora1 =calendario.get(Calendar.HOUR_OF_DAY);
		 minutos1 = calendario.get(Calendar.MINUTE);
		 segundos1 = calendario.get(Calendar.SECOND);
		HF= hora1 + ":" + minutos1 + ":" + segundos1;
		for(int x=0; x<listaBoletos.length; x++) {
			if(listaBoletos[x]!=null && listaBoletos[x].getFolio().equals(folio)) {
				listaBoletos[x]=null;
				
				return "EL CARRO SE HA SALIDO"+
				"A la hora :"+HF;
				}else{
					return "FOLIO NO ENCONTRADO";
				}
			} 
		return "EL CARRO SE HA SALIDO";
		
	
		
	}
	//Agregar método de disponibilidad

		public static String dispinibilidad() {
			//String disponibilidad = null;
			for(int x=0; x<listaBoletos.length; x++) {
				if(listaBoletos[x]!=null ) {
					for (int i = 0; i < listaBoletos.length; i++) {
						
	
					return "EL MODELO DEL AUTOMOVIL EN LA POSICION  :"+" " + (x+1) +" ES "+ listaBoletos[x].getModelo()
					+"El folio es :"+ listaBoletos[x].getFolio();
					}
			}else
				if(listaBoletos[x]==null) {
					return "ESPACIO DISPONIBLE";
				}
				
			}
			return "" ;
		}

}

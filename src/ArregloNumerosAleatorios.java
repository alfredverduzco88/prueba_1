import java.util.Random;

public class ArregloNumerosAleatorios {
	
	  
    public static void main(String[] args) {
        int[] arregloNumeros = new int[4];
        inicializar(arregloNumeros);
        visualizar(arregloNumeros);
    }
 
    static void inicializar(int[] arreglo){
         Random r = new Random();
        for(int i=0;i<arreglo.length;i++){
            	arreglo[i] = r.nextInt(100) + 1; 
            }
        }
     
    static void visualizar(int[] arreglo){
        for(int i=0;i<arreglo.length;i++){
                System.out.print(arreglo[i]);
            }
            System.out.println();
        }
    }



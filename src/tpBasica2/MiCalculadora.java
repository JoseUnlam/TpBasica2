
package tpBasica2;
import java.util.Scanner;

public class MiCalculadora {
	public static void main(String[] args) {
		
		//atributos
		Integer a = 0;
		Integer b = 0;
		Integer opcion;
		Integer resultado;
		
		Scanner teclado = new Scanner(System.in);
		
		do{
			System.out.println("Ingrese su operación: 1 para sumar, 2 para restar, 3 para multiplicar, 4 para dividir");
			System.out.println("Luego, ingrese los numeros que desee operar");
			opcion = teclado.nextInt();	
		}while(opcion <= 1 && opcion >= 4);
		
			switch(opcion) {
				case 1:
					
				break;
				
				case 2:
					
				break;
				
				case 3:
					
				break;
				
				case 4:
					
				break;
			}
	}
}		
		
		

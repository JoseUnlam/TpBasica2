
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
			System.out.print("Ingrese su operacion: 1 para multiplicar , 2 para dividir, 3 para sumar, 4 para restar: ");
			
			opcion = teclado.nextInt();
			
			System.out.println("\nLuego, ingrese los numeros que desee operar");
		}while(opcion <= 1 && opcion >= 4);
		
			switch(opcion) {
				case 1:
					System.out.print("Ingrese el primero numero: ");
					a = teclado.nextInt();
					System.out.print("Ingrese el segundo numero: ");
					b = teclado.nextInt();
					
					Integer multiplicar = a*b;
					System.out.println("\nEl resultado es: "+multiplicar);
				break;
				
				case 2:
					System.out.print("Ingrese el primero numero: ");
					a = teclado.nextInt();
					System.out.print("Ingrese el segundo numero: ");
					b = teclado.nextInt();
					
					Integer dividir = a/b;
					System.out.println("\nEl resultado es: "+dividir);
				break;
				
				case 3:
					System.out.print("Ingrese el primero numero: ");
					a = teclado.nextInt();
					System.out.print("Ingrese el segundo numero: ");
					b = teclado.nextInt();
					
					Integer sumar = a+b;
					System.out.println("\nEl resultado es: "+sumar);
				break;
				
				case 4:
					System.out.print("Ingrese el primero numero: ");
					a = teclado.nextInt();
					System.out.print("Ingrese el segundo numero: ");
					b = teclado.nextInt();
					
					Integer restar = a-b;
					System.out.println("\nEl resultado es "+restar);
				break;
			}
	}
}		
		
		

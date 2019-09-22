
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
					System.out.println("Ingrese el primer numero");
					 a = teclado.nextInt();
					 System.out.println("Ingrese el segundo numero");
					 b = teclado.nextInt();
				break;
				
				case 2:
					System.out.println("Ingrese el primer numero");
					 a = teclado.nextInt();
					 System.out.println("Ingrese el segundo numero");
					 b = teclado.nextInt();
					
				break;
				
				case 3:
					System.out.println("Ingrese el primer numero");
					 a = teclado.nextInt();
					 System.out.println("Ingrese el segundo numero");
					 b = teclado.nextInt();
					
				break;
				
				case 4:
					System.out.println("Ingrese el primer numero");
					 a = teclado.nextInt();
					 System.out.println("Ingrese el segundo numero");
					 b = teclado.nextInt();
					
				break;
			}
	}
}		
		
//¿Qué es GIT FLOW?
//Git-flow es un conjunto de extensiones para Git, agrega comandos que por detras
usan los comandos de git.

//¿Cómo puede ayudarnos a trabajar en equipo?
// ayuda a trabajar dando la posibilidad de trabajar sobre copias de los contenidos de Develop y Master, las
cuales son develop y hotfix.

//¿Se relaciona con alguna de las estrategias planteadas? ¿Como?
//Esto logra que al trabajar en equipo, mientras correjimos algo en el codigo del programa, podemos hacerlo sin
alterar el trabajo de otro miembro del equipo.		

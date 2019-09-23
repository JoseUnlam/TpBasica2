package tpBasica2;

import java.util.Scanner;

public class MiCalculadoraMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//atributos
				Integer a = 0;
				Integer b = 0;
				Integer opcion;
				Integer resultado;
				
				Scanner teclado = new Scanner(System.in);
				
				System.out.println("Ingrese los numeros a operar.");
				System.out.print("\nPrimer numero: ");
				a = teclado.nextInt();
				System.out.print("Segundo numero: ");
				b = teclado.nextInt();
				
				MiCalculadora c1 = new MiCalculadora(a,b);
				
				do{
					System.out.print("\nIngrese su operacion: 1 para multiplicar , 2 para dividir, 3 para sumar, 4 para restar: ");
					
					opcion = teclado.nextInt();
					
					
				}while(opcion <= 1 && opcion >= 4);
				
					switch(opcion) {
						case 1:
							resultado = c1.multiplicar();
							System.out.println("Resultado: "+resultado );
						break;
						
						case 2:
							resultado = c1.dividir();
							System.out.println("Resultado: "+resultado);
						break;
						
						case 3:
							resultado = c1.sumar();
							System.out.println("Resultado: "+resultado);
						break;
						
						case 4:
							resultado = c1.restar();
							System.out.println("Resultado: "+resultado);
						break;
					}
	}	
	
}

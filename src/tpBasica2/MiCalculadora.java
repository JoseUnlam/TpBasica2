package tpBasica2;

public class MiCalculadora {
	
		Integer a = 0;
		Integer b = 0;
		Integer opcion;
		Integer resultado;
		
			public MiCalculadora(Integer a, Integer b) {
				
				this.a = a;
				this.b = b;
			}
	
	public int  sumar() {
		return this.a + this.b;
	}
	
	public int restar() {
		return this.a - this.b;
	}
	
	public int multiplicar() {
		return this.a * this.b;

	}

	
	public int dividir() {
		if(this.a > this.b) {
		return this.a / this.b;
		}
		else {
			return this.b / this.a;
		}
		}
	}
			
//¿Qué sucedió cuando se intento hacer el segundo push?
// Se genero conflictos con la rama master
//¿Qué acciones hay que tomar antes de realizar el push?
//Hacer un pull de la rama master y comparar las modificaciones recientes
//¿Qué estrategia propondrían para evitar esta situación?
//Comentar las modificaciones y trabajar en una rama aparte
//¿Qué acción realiza el parámetro -b?

//Realizar en el repositorio remoto un merge request
//
//¿Qué diferencias notaron en el proceso?
//se abrio un merge luego del pull -Pull request successfully merged and closed- y permite comparar cambios entre
//los distintos branches y commits, e incluso entre forks
//¿Qué estrategia utilizarían para evitar conflictos?
//leer los cambios a medida que se van aplicando y comentar en cada caso que fue lo que se introdujo
//que mejoras o correcciones hubo, comentandolo en cada merge request


//¿Qué es GIT FLOW?
//Git-flow es un conjunto de extensiones para Git, agrega comandos que por detras usan los comandos de git.

//¿Cómo puede ayudarnos a trabajar en equipo?
//ayuda a trabajar dando la posibilidad de trabajar sobre copias de los contenidos de Develop y Master, las cuales son develop y hotfix.

//¿Se relaciona con alguna de las estrategias planteadas? ¿Como?
//Esto logra que al trabajar en equipo, mientras correjimos algo en el codigo del programa, podemos hacerlo sin alterar el trabajo de otro miembro del equipo.





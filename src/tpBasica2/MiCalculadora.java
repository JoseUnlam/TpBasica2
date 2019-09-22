package tpBasica2;

public class MiCalculadora {
	
	Integer a;
	Integer b;
	
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
		
		

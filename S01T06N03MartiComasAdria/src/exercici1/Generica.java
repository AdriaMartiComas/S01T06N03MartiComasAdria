package exercici1;

public class Generica<T extends Telefon, S extends Smartphone> {
	
	
	public void telefon(T telefon) {
		telefon.trucar();
	}
	
	public void smartphone(S smartphone) {
		smartphone.ferFotos();
	}
}

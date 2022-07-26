package exercici1;

public class App {

	public static void main(String[] args) {
		Smartphone smPhone = new Smartphone();

		smPhone.ferFotos();

		smPhone.trucar();
		

		

		// El mètode limitat per la interfície Telefon, de la classe Generica, no pot
		// cridar al mètode ferFotos(), ja que no hereda de la Interficie Smartphone
		//Els metodes amb arguments limitats no poden ser estatics per cridar-los sense instanciar un objecte
	}

}

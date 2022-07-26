package exercici1;

public class Smartphone implements Telefon{

	@Override
	public void trucar() {
		System.out.println("Realitzant trucada");
	}
	
	public void ferFotos() {
		System.out.println("S'estan fent fotos");
	}

}

public class TstCar{

	public static void main(String arg[]){ //classloader


		Carro c1 = new Carro(); //m�todo Construtor --> informar ao SO as dimens�es de p1
		c1.setPlaca(1234);
		c1.setModelo("ModelS");
		c1.setChassi(1523);
	
		System.out.println("\nPlaca...: "+ c1.getPlaca());
		System.out.println("Modelo..: "+ c1.getModelo());
		System.out.println("Chassi..: "+ c1.getChassi());

	}

}
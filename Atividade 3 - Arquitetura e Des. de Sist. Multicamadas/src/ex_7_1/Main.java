package ex_7_1;

public class Main {
	// M�todo principal
	public static void main(String[] args) throws Exception {
		// Manipula de v�rias formas.
		ManipuladorAbstrato manipulador;
	
		
		System.out.println("-------------------------------");
		System.out.println("    Transforma em mai�sculo    ");
		System.out.println("-------------------------------");
		manipulador = new MaiusculoSt();
		manipulador.manipularString();

		System.out.println("-------------------------------");
		System.out.println("    Transforma em min�sculo    ");
		System.out.println("-------------------------------");
		manipulador = new MinusculoSt();
		manipulador.manipularString();

		System.out.println("---------------");
		System.out.println("    Duplica    ");
		System.out.println("---------------");
		manipulador = new DuplicarSt();
		manipulador.manipularString();

		System.out.println("---------------");
		System.out.println("    Inverte    ");
		System.out.println("---------------");
		manipulador = new InverterSt();
		manipulador.manipularString();
	}
}
import java.util.ArrayList;

public class Geometria {

	public Geometria() {
		
	}

	public static void main(String[] args) {
		
		ArrayList<Figura> figuras = new ArrayList();
      figuras.add(new Losango(7,15,0));            
		figuras.add(new Circulo(7.0));
		figuras.add(new Retangulo(5,10));
		figuras.add(new Quadrado(10));
		
		
		for(Figura figura: figuras) {
			System.out.println("---------------------- EXERCICIO DE FIGURAS ----------------------");
			System.out.println(figura);
			System.out.println("Area da Figura= "+figura.area());
         System.out.println("Perimetro da Figura = "+figura.perimetro());
			if(figura instanceof Diagonal) {
			Diagonal d = (Diagonal)figura;
			System.out.println("Diagonal da Figura = "+d.diagonal());
			System.out.println("---------------------- EXERCICIO DE FIGURAS ----------------------");			}
		}
	}
}


public class Quadrado extends Poligono implements Diagonal {
	
	public Quadrado(double lado) {
		super(lado, lado);
	}

	@Override
	public double diagonal() {
		return getAltura()*Math.sqrt(2);
	}
   
   @Override
   public double perimetro() {
      return (getAltura()+getBase())*2;     
   }
   
	@Override
	public double area() {
		return getAltura()*getBase();
	}

	@Override
	public String toString() {
		return "Quadrado [Base()=" + getBase() + ", Altura()=" + getAltura() + "]";
	}

	
}

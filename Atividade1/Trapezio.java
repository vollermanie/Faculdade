public class Trapezio extends Poligono{

	public Trapezio(double basemenor, double basemaior, double altura) {
		super(basemenor, basemaior, altura);
	}

	@Override
	public double area() {
		return (getAltura()*(getBasemaior()+getBase()))/2;
	}
   
   @Override
   public double perimetro() {
      return (getAltura()+getBase())*2;     
   }

	@Override
	public String toString() {
		return "Trapezio [Base Maior()=" + getBasemaior() + ", Base Menor()=" + getBase() + ", Altura()=" + getAltura() + "]";
	} 

	
}

public class Losango extends Poligono {

	public Losango(double base2, double altura2,double basemaior) {
		super(base2, altura2);
	}

	@Override
	public double area() {
		return getBase()*getAltura();
	}
   
   @Override
   public double perimetro() {
      return (getAltura()+getBase())*2;     
   }

	@Override
	public String toString() {
		return "Losango [Base()=" + getBase() + ", Altura()=" + getAltura() + "]";
	} 

	
}

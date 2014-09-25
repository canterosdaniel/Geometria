package geometria;

public class Circulo extends Geometria{
	static int numCirculos = 0;
	public static final double PI=3.14159265358979323846;
	public double x;
	public double y;
	public double r;
	
	public Circulo (double x, double y, double r){
		this.x = x;
		this.y = y;
		this.r = r;
		numCirculos++;
	}

	public Circulo() {	this(0.0, 0.0, 1.0); }
	public Circulo(double r) {	this(0.0, 0.0, r); }
	public Circulo(Circulo miCirculo) {	
		this(miCirculo.x, miCirculo.y, miCirculo.r); 
		}
	
	public double perimetro(){return 2.0 * PI * r; }
	public double area(){return PI * r * r; }
	
	
	public String toString() {
		return "Circulo [r=" + r + ", x=" + x + ", y=" + y + "]";
	}

	//Metodo de Objeto para comparar circulos
	public Circulo elMayor(Circulo miCirculo){
		if (this.r >= miCirculo.r) 
			return this;
		else return miCirculo;
	}
	//Metodo de la clase para comparar circulos
	public static Circulo elMayor(Circulo miCirculo, Circulo miCirculo2){
		if (miCirculo.r >= miCirculo2.r) 
			return miCirculo;
		else return miCirculo2;
	}
	
}

package geometria;

public class Rectangulo extends Geometria{
	private static int numRectangulos = 0;
	protected double x1;
	protected double x2;
	protected double y1;
	protected double y2;
	
	public Rectangulo(double x1, double x2, double y1, double y2) {
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
		numRectangulos++;
	}
	
	public double perimetro(){return 2.0 * ((x1-x2)+(y1-y2)); }
	public double area(){return (x1-x2) * (y1-y2); }
	
	
}

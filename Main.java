package geometria;
import java.*;
public class Main {

	public static void main(String[] args) {
		System.out.println("Comienza el main()... ");
		Circulo miCirculo1 = new Circulo (2.0, 2.0, 4.0);
		System.out.println("Centro: = (" +  miCirculo1.x + " , " + miCirculo1.y + ") unidades.");
		System.out.println("Radio: = " +  miCirculo1.r + " unidades");
				
		Circulo miCirculo2 = new Circulo (1.0, 1.0, 2.0);
		Circulo miCirculo3 = new Circulo (0.0, 0.0, 3.0);
		System.out.println(miCirculo2);
		System.out.println(miCirculo3);
		miCirculo1 = miCirculo2.elMayor(miCirculo3);
		System.out.println("El mayor radio es: " + miCirculo1.r);
		
		System.out.println("------------------------------------");
		Circulo miCirculo4 = new Circulo();
		System.out.println(miCirculo4);
		miCirculo4 = Circulo.elMayor(miCirculo2, miCirculo4);
		System.out.println("El mayor radio es: " + miCirculo4.r);
		
	}

}

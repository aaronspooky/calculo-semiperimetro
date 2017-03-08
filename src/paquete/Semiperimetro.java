package paquete;
import java.util.*;

public class Semiperimetro {

	static double calcula(double aa, double bb, double cc, double pp){
		double res = pp * ((pp-aa) * (pp-bb) * (pp-cc));
		return res = Math.sqrt(res);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Semiperimetro sm = new Semiperimetro();
		
		System.out.println("Introduce el lado a: ");
		double a = sc.nextDouble();
		System.out.println("Introduce el lado b: ");
		double b = sc.nextDouble();
		System.out.println("Introduce el lado c: ");
		double c = sc.nextDouble();
		System.out.println("Introduce el perimetro: ");
		double p = sc.nextDouble();
		
		
		double resultado = sm.calcula(a,b,c,p);
		
		System.out.println("El resultado es: "+resultado);
	}

}

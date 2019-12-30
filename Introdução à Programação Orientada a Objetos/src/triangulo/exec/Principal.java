package triangulo.exec;

//import java.util.Locale;
import java.util.Scanner;

import triangulo.Triangulo;

public class Principal {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		// Locale.setDefault(Locale.US);

		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();

		System.out.println("Entre com as medidas do tri�ngulo X: ");
		x.a = read.nextDouble();
		x.b = read.nextDouble();
		x.c = read.nextDouble();

		System.out.println("Entre com as medidas do tri�ngulo Y: ");
		y.a = read.nextDouble();
		y.b = read.nextDouble();
		y.c = read.nextDouble();

		//double p = (x.a + x.b + x.c) / 2;
		//double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));

		double areaX = x.area();
		double areaY = y.area();
		
		//p = (y.a + y.b + y.c) / 2;
		//double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));

		System.out.println("�rea do tri�ngulo X � = " + areaX);
		System.out.println("�rea do tri�ngulo Y � = " + areaY);

		if (areaX > areaY) {
			System.out.println("Tri�ngulo X � maior!");
		} else {
			System.out.println("Tri�ngulo Y � maior!");
		}

		read.close();
	}
}

package first_exercises;

import java.util.Scanner;

public class excercise6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float a,b,c;
		
		System.out.println("Entre 3 valores em sequencia: ");
		a=sc.nextFloat();
		b=sc.nextFloat();
		c=sc.nextFloat();
		
		float areaTriangulo = a*c/2;
		double areaCirculo = 3.14159 * Math.pow(c, 2);
		double areaTrapezio = ((a+b)/2)*c;
		float areaQuadrado = b*b;
		float areaRet = a*b;
		
		System.out.printf("TRIANGULO: %.3f%n", areaTriangulo);
		System.out.printf("CIRCULO: %.3f%n", areaCirculo);
		System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);
		System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
		System.out.printf("RETANGULO: %.3f%n", areaRet);


		

	}

}

package curso_udemy_aula1;

import java.util.Scanner;

public class math {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a, b, c, x1, x2, y;

		
		System.out.println("Digite os valores de b, a e c: ");
		a = sc.nextDouble();
		b= sc.nextDouble();
		c = sc.nextDouble();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);


		y = Math.pow(b, 2.0)-(4*a*c);
		System.out.println(y);

		
		x1=(-(b+ Math.sqrt(y))/(2*a));
		x2=(-(b- Math.sqrt(y))/(2*a));
		
		System.out.println("Bhaskara x1 = " + x1 );
		System.out.println("Bhaskara x2 = " + x2 );
		
		//basic Bhaskara formula

		
		
	}

}

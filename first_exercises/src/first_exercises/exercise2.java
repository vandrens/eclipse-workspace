package first_exercises;

import java.util.Scanner;

public class exercise2 {

	public static void main(String[] args) {
		double raio, pi, area;
		pi = 3.14159;
		Scanner sc = new Scanner(System.in);
		System.out.println("insira o valor do raio");
		raio = sc.nextDouble();
		area = pi*(Math.pow(raio, 2));
		System.out.printf("a area e igual: %.4f",area);

	}

}

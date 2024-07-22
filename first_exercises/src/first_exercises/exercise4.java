package first_exercises;

import java.util.Scanner;

public class exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float x,y,z,salario;
		System.out.println("Digite o seu numero de funcionario: ");
		x = sc.nextFloat();
		System.out.println("Digite seu número de horas trabalhadas: ");
		y = sc.nextFloat();
		System.out.println("Digite o valor que recebe por hora: ");
		z = sc.nextFloat();
		salario = z*y;
		System.out.printf("Seu numero e: %.0f%n", x);
		System.out.printf("Seu salario e: %.2f%n", salario);




	}

}

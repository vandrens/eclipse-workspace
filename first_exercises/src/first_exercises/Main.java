package first_exercises;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Faça um programa para ler dois valores inteiros, e 
		//depois mostrar na tela a soma desses números com uma mensagem explicativa, conforme exemplos.
		
		Scanner sc = new Scanner(System.in);
		int x,y, total;
		
		System.out.println("insira o primeiro valor (x): ");
		x = sc.nextInt();
		System.out.println("insira o segundo valor (y): ");
		y = sc.nextInt();
		
		total = x+y;
		System.out.println("A soma e: "+total);

	}

}

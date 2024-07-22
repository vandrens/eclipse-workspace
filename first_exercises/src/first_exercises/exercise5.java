package first_exercises;

import java.util.Scanner;

public class exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int codigoPeca1, codigoPeca2 , qtdePeca1, qtdePeca2;
		float precoUnidade1, precoUnidade2, precofinal;

		System.out.println("Insira do codigo da peca 1, a quantidade, e o preco: ");
		
		codigoPeca1 = sc.nextInt();
		qtdePeca1 = sc.nextInt();
		precoUnidade1 = sc.nextFloat();
		
		System.out.println("Insira do codigo da peca 2, a quantidade, e o preco: ");
		
		codigoPeca2 = sc.nextInt();
		qtdePeca2 = sc.nextInt();
		precoUnidade2 = sc.nextFloat();
		
		precofinal = (qtdePeca1*precoUnidade1) + (qtdePeca2 * precoUnidade2);
				
		System.out.println("Valor final: " + precofinal);

		
		
		
	}

}

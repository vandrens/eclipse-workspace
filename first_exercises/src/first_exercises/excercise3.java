package first_exercises;

import java.util.Scanner;

public class excercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b,c,d;
		float diferenca;
		System.out.println("Digite os valores de A, B, C e D em sequencia: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		diferenca = ((a*b)-(c*d));
		System.out.println("diferenca: "+diferenca);

	}

}

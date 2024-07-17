package curso_udemy_aula1;

import java.util.Locale;
import java.util.Scanner;

public class scanner {
	public static void main(String[] args) {
	Locale.setDefault(Locale.GERMAN);

	Scanner sc = new Scanner(System.in);
	System.out.println("Digite o primeiro valor: ");
	
	char x;
	String y;
	int a;
	double b;
	
	x=sc.next().charAt(0);
	y=sc.next();
	a=sc.nextInt();
	b=sc.nextDouble();

	System.out.println("voce digitou: ");
	System.out.println(x);
	System.out.println(y);
	System.out.println(a);
	System.out.println(b);

	
	
	sc.close();
	

}}

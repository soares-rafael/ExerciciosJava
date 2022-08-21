import java.util.Scanner;

public class ExercicioUm {

	public static void main(String[] args) {

		//faça um programa que receba tres numeros inteiros e diga qual deles é maior
		
		int a, b, c;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nInsira o primeiro número: ");
		a = leia.nextInt();
		System.out.println("\nInsira o segundo número: ");
		b = leia.nextInt();
		System.out.println("\nInsira o terceiro número: ");
		c = leia.nextInt();
		
		if (a>=b && a>=c)
		{
			System.out.println("\nO maior número é: "+a);
		}
		else if (b>=a && b>=c) {
			System.out.println("\nO maior número é: "+b);
		}
		else {
			System.out.println("\nO maior número é: "+c);
		}
	}

}

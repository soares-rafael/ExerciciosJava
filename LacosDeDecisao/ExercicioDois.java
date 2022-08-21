import java.util.Scanner;

public class ExercicioDois {

	public static void main(String[] args) {
		// faça um programa que entre com 3 numeros, e coloqu em ordem crescente
		
		int a, b, c;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nInsira o primeiro número: ");
		a = leia.nextInt();
		System.out.println("\nInsira o segundo número: ");
		b = leia.nextInt();
		System.out.println("\nInsira o terceiro número: ");
		c = leia.nextInt();

		if (a<=b && b<=c)
		{
			System.out.println("\nA ordem crescente é: "+a+"," +b+"e" +c);
		}
		else if (a<=c && c<=b)
		{
			System.out.println("\nA ordem crescente é: "+a+"," +c+"e" +b);
		}
		else if (b<=a && a<=c)
		{
			System.out.println("\nA ordem crescente é: "+b+"," +a+"e" +c);
		}
		else if (b<=c && c<=a)
		{
			System.out.println("\nA ordem crescente é: "+b+"," +c+"e" +a);
		}
		else if (c<=a && a<=b)
		{
			System.out.println("\nA ordem crescente é: "+c+"," +a+"e" +b);
		}
		else
		{
			System.out.println("\nA ordem crescente é: "+c+"," +b+"e" +a);
		}
	}

}

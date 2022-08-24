import java.util.Scanner;

public class ExercicioUmEnquanto {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int x, soma=0, total=0;
		double media=0;
		
		System.out.println("\nInsira um valor: ");
		x = leia.nextInt();
		
		while (x>=0)
		{
			
			System.out.println("\nInsira um valor: ");
			x = leia.nextInt();
			
			soma+=x;
			total++;
		}
		if (x!=0)
		{
			media = soma / total;
		}
		else
		{
			System.out.println("\nNão é possível dividir por zero!");
		}
		System.out.println("\nPrograma finalizado.");
		System.out.println("\nSoma dos valores lidos: "+soma);
		System.out.println("\nMédia dos valores lidos: "+media);
		System.out.println("\nTotal de valores lidos: "+total);
	}

}

import java.util.Scanner;

public class ExercicioTres {

	public static void main(String[] args) {

		int idade, maiorCin=0, menorVin=0;
		Scanner leia = new Scanner (System.in);
		System.out.println("(para encerrar o programa, digite -99)");
		System.out.println("\nInsira sua idade: ");
		idade = leia.nextInt();
		
		while (idade != -99)
		{
			
			
			if (idade<21)
			{
				menorVin++;
			}
			else if (idade>50)
			{
				maiorCin++;
			}
			else
			{
				
			}
			System.out.println("\nInsira a sua idade: ");
			idade = leia.nextInt();
		}
		
		
		System.out.println("\nPrograma encerrado!!!!!!!!! ihuuu!!\n quantidade de maiores de 50: "+maiorCin+"\nquantidade de Menores de 21: "+menorVin);

	}

}

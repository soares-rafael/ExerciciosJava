import java.util.Scanner;

public class ExercicioUm {

	public static void main(String[] args) {

		int filhos, sal, cidadao, quantP=0,somaF=0,somaSal=0;
		double mediaF, mediaSal,porcen,maiorSal=0;
		Scanner leia = new Scanner (System.in);
		
		
		
		for (cidadao=1;cidadao<=3;cidadao++)
		{
			System.out.println("\nInsira quantos filhos você tem: ");
			filhos = leia.nextInt();
			System.out.println("\nInsira qual é seu salário: ");
			sal = leia.nextInt();
			somaSal += sal;
			somaF+= filhos;
			
			
			if (maiorSal<=sal)
			{
				maiorSal = sal;
			}
			if (sal<100)
			{
				quantP++;
			}
		}
			
		
		mediaSal = somaSal / 3;
		mediaF = somaF /3;
		porcen = (quantP * 100) / 3;
		System.out.println("\nA média salarial é: "+mediaSal);
		System.out.println("\nA média de filhos é: "+mediaF);
		System.out.println("\nMaior salário: "+maiorSal);
		System.out.println("\nPercentual de pessoas que recebem até 100 reais: "+porcen);
	}

}

import java.util.Scanner;

public class ExercicioCinco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x, somaX=0;
		Scanner leia = new Scanner (System.in);
		do
		{
			System.out.println("\nInforme um número:");
			x = leia.nextInt();
			somaX += x;		
		}
		while(x != 0);
		System.out.println("\nA soma dos números informados é: "+somaX);
	}

}
import java.util.Scanner;

public class ExercicioUm {

	public static void main(String[] args) {

		int anos, meses, dias, total;
		Scanner leia = new Scanner (System.in);
		System.out.println("\nInsira sua idade completa em: \nAnos: ");
		anos = leia.nextInt();
		System.out.println("\nmeses: ");
		meses = leia.nextInt();
		System.out.println("\nidade: ");
		dias = leia.nextInt();
		
		total = anos*365+(meses*30)+dias;
		System.out.println("\nSua idade em dias é: "+total);

	}

}

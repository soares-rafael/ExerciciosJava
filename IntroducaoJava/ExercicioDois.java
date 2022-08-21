import java.util.Scanner;

public class ExercicioDois {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total, anos, meses, dias, res, resto, diasT;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nInforme sua idade em dias: ");
		diasT = leia.nextInt();
		
		anos = diasT/365;
		meses =  (diasT%365)/30;
		dias = (diasT%365)%30;
		
		
		System.out.println("\nSua idade completa: "+anos+"anos, "+meses+"meses e "+dias+"dias.");
	}

}

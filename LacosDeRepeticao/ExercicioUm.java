
public class ExercicioUm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1- Informar todos os números de 1000 a 1999 que quando divididos por 11
		obtemos resto = 5. (FOR)   if(x % 11 == 5)*/
				
				int x;
				
				for(x=1000;x<=1999;x++)
				{
					if(x % 11 == 5)
					{
						System.out.println("\nEsses são os números entre 1000 e 1999 que divididos por 11 tem o resto 5: "+x);
					}
				}
	}

}

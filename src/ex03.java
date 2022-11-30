import java.util.Scanner;

/**
 * @author borjaMontseny
 */
public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Programa per llegir l'alçada de N persones i calcular l'alçada mitjana.
		 * Calcular quantes persones tenen una alçada superior a la mitjana i quantes
		 * tenen una alçada inferior a la mitjana.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("N persones: ");
		int numPersones = sc.nextInt();
		double totalSumaAltures = 0;

		double[] arrayAltures = new double[numPersones];

		for (int i = 0; i < arrayAltures.length; i++) {
			System.out.print("Altura de la persona " + (i + 1) + ": ");
			arrayAltures[i] = sc.nextDouble();

			totalSumaAltures += arrayAltures[i];
		}
		
		sc.close();

		double mitjana = totalSumaAltures / numPersones;

		int contadorSuperior = 0;
		int contadorInferior = 0;
		
		// for que comproba els superiors/inferiors a la mitja
		for (int i = 0; i < arrayAltures.length; i++) {
			if (arrayAltures[i] >= mitjana) {
				contadorSuperior++;
			} else {
				contadorInferior++;
			}
		}
		
		if (mitjana > 0) {
			System.out.println("\nAltura mitjana: " + mitjana);
			System.out.println("Altures superiors a la mitja: " + contadorSuperior);
			System.out.println("Altures inferiors a la mitja: " + contadorInferior);
		} else {
			System.out.println("\nAmb aquestes dades no es posible fer la mitjana.");
		}


	}

}

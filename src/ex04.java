import java.util.Scanner;

/**
 * @author borjaMontseny
 */
public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Programa que ompli un array amb 10 nombres enters per teclat. calcula i
		 * mostra la mitjana dels valors positius i la dels valors negatius de l'array
		 */

		Scanner sc = new Scanner(System.in);

		int[] arrayNums = new int[10];
		double sumaPositius = 0;
		double contadorPositius = 0;

		double sumaNegatius = 0;
		double contadorNegatius = 0;

		for (int i = 0; i < arrayNums.length; i++) {
			System.out.print("Valor " + (i + 1) + ": ");
			arrayNums[i] = sc.nextInt();

			if (arrayNums[i] > 0) {
				sumaPositius += arrayNums[i];
				contadorPositius++;
			} else if (arrayNums[i] < 0) {
				sumaNegatius += arrayNums[i];
				contadorNegatius++;
			}

		}

		sc.close();

		System.out.println("\nMitjana positius: " + (sumaPositius / contadorPositius));
		System.out.println("Mitjana negatius: " + (sumaNegatius / contadorNegatius));

	}

}

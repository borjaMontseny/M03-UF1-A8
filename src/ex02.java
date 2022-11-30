import java.util.Scanner;

/**
 * @author borjaMontseny
 */
public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Programa Java que llegeixi 10 nombres enters per teclat i els guardi en
		 * un array Calcula i mostra la mitjana dels nombres que estiguin en les
		 * posicions parells del array.
		 */

		int[] arrayNums = new int[10];

		int totalSumaParells = 0;
		int contadorParells = 0;

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < arrayNums.length; i++) {

			System.out.print("Número " + (i + 1) + ": ");
			arrayNums[i] = sc.nextInt();

			if (i % 2 == 0) {
				totalSumaParells += arrayNums[i];
				contadorParells++;
			}

		}

		sc.close();

		double mitjanaParells = totalSumaParells / contadorParells;

		System.out.println("\nMitjana dels parells: " + mitjanaParells);

	}

}

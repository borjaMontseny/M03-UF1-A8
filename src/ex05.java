import java.util.Scanner;

/**
 * @author borjaMontseny
 */
public class ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Programa per inserir 5 números en un vector A, copiar en un vector B totes
		 * les dades parells del vector A, i posteriorment visualitzar les dades del
		 * vector B
		 */

		int[] arrayA = new int[5];

		Scanner sc = new Scanner(System.in);

		int contadorParells = 0;

		for (int i = 0; i < arrayA.length; i++) {
			System.out.print("Num " + (i + 1) + ": ");
			arrayA[i] = sc.nextInt();

			// el total de parells, serà el tamany de arrayB
			if (arrayA[i] % 2 == 0) {
				contadorParells++;
			}

		}

		sc.close();

		int[] arrayB = new int[contadorParells];

		// per cada iteració de arrayB
		for (int i = 0; i < arrayB.length; i++) {

			// recorrem arrayA i asignem el parells
			for (int j = 0; j < arrayA.length; j++) {

				if (arrayA[j] % 2 == 0) {
					arrayB[i] = arrayA[j];
				} else {
					j++;
				}
			}

		}

		System.out.println("\nVector B: ");

		for (int i = 0; i < arrayB.length; i++) {
			System.out.print(arrayB[i] + " ");
		}

	}

}

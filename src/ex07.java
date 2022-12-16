package a8;

import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {

		// Pedimos el tamaño del array y lo
		// llenamos con números
		int[] arrayA = { 9, 12, 1, 4, 6, 45, 2, 50 };

		// Creamos arrayB del mismo tamaño que el A
		int[] arrayB = new int[8];

		// Creamos una copia para no machacar el arrayA
		int[] arrayC = new int[8];

		for (int i = 0; i < arrayC.length; i++) {
			arrayC[i] = arrayA[i];
		}

		// Recorremos el arrayB para poner el número
		// correspondiente en cada posición
		for (int indiceB = 0; indiceB < arrayB.length; indiceB++) {

			int menor = Integer.MAX_VALUE;
			int indiceMenor = 0;

			// Recorremos el arrayA para buscar

			for (int indiceC = 0; indiceC < arrayC.length; indiceC++) {

				// el número menor, QUE NO HAYAMOS PUESTO AÚN
				if (arrayC[indiceC] < menor && arrayC[indiceC] != -1) {

					menor = arrayC[indiceC];
					indiceMenor = indiceC;
				}
			}

			// He encontrado el menor, lo marco como puesto
			arrayC[indiceMenor] = -1;

			arrayB[indiceB] = menor;

		}

		System.out.println("B");
		// Mostramos el vector B
		for (int i = 0; i < arrayB.length; i++) {
			System.out.print(arrayB[i] + " ");
		}
		System.out.println();

		System.out.println("A");
		// Mostramos el vector A
		for (int i = 0; i < arrayA.length; i++) {
			System.out.print(arrayA[i] + " ");
		}
		System.out.println();

	}

}

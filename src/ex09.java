package a8;

import java.util.Scanner;

public class ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Programa que digui si el nombre inserit és o no palíndrom

		System.out.print("Inserir un número: ");

		// demanem el num
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();

		// el passem a String
		String numString = String.valueOf(num);

		// creem un array del tamany de numString en sentit ++
		char[] numArrayA = new char[numString.length()];

		for (int i = 0; i < numArrayA.length; i++) {

			numArrayA[i] = numString.charAt(i);

		}

		// creem l'array que anirà en sentit -- mirall 123 - 321
		char[] numArrayB = new char[numString.length()];

		int j = 0;

		for (int i = numArrayB.length - 1; i >= 0; i--) {

			numArrayB[i] = numString.charAt(j);

			j++;

		}

		// for per pasar el arrayB a un String y comparar-lo
		String numBString = "";

		for (int i = 0; i < numArrayB.length; i++) {

			numBString = numBString + numArrayB[i];

		}

		if (numString.contentEquals(numBString)) {
			System.out.println("\n" + num + " és palíndrom");
		} else {
			System.out.println("\n" + num + " no és palíndrom");
		}

	}

}

// [1] [2] [3]
// [3] [2] [1]

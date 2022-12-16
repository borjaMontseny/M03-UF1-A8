package a8;

import java.util.Scanner;

public class ex09B {

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

		// creem l'array que anirà en sentit --
		char[] numArrayB = new char[numString.length()];

		for (int i = numString.length() - 1; i >= 0; i--) {

			numArrayB[i] = numString.charAt(i);

		}
		
		String numBString = "";
		
		for (int i = 0; i < numArrayB.length; i++) {
			
			numBString = numBString + numArrayB[i];
			
		}

		System.out.println(numString);
		
		System.out.println(numBString);
		
		if (numString.contentEquals(numBString)) {
			System.out.println("\n" + num + " és palíndrom");
		} else {
			System.out.println("\n" + num + " no és palíndrom");
		}

	}

}

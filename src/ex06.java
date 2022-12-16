package a8;

import java.util.Scanner;

public class ex06 {

	/*
	 * Programa que llegeixi el nom i el sou de 20 empleats/des i mostri el nom i el
	 * sou de l'empleat/da que més guanya
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int tamanyArray = 3;

		String[] arrayNoms = new String[tamanyArray];

		double[] arraySous = new double[tamanyArray];

		for (int i = 0; i < arrayNoms.length; i++) {

			System.out.print("Nom treballador " + (i + 1) + ": ");

			arrayNoms[i] = sc.next();

			System.out.print("Sou de " + arrayNoms[i] + ": ");

			arraySous[i] = sc.nextDouble();

			System.out.println(" ");

		}

		sc.close();

		double souAuxiliar = Double.MIN_VALUE;
		int indexGuanyador = 0;

		for (int i = 0; i < arraySous.length; i++) {

			if (arraySous[i] > souAuxiliar) {
				souAuxiliar = arraySous[i];
				indexGuanyador = i;
			}

		}

		System.out.println(
				"L'empleat que més guanya és " + arrayNoms[indexGuanyador] + " amb " + arraySous[indexGuanyador] + "€");

	}

}

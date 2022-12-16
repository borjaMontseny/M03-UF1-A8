package a8;

import java.util.Scanner;

public class ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Donat un vector de N posicions i un nombre, comprovar si aquest nombre
		 * apareix al vector o no. Al final del programa s'ha de dir si apareix o no
		 * apareix
		 */
		
		System.out.print("Num posicions: ");
		
		Scanner sc = new Scanner(System.in);
		
		int numPosicions = sc.nextInt();
		
		int[] array = new int[numPosicions];
		
		for (int i = 0; i < array.length; i++) {
			System.out.print("Num " + (i + 1) + " de " + numPosicions + ": ");
			array[i] = sc.nextInt();
		}
		
		int contador = 0;
		
		System.out.print("Introdueix el nombre a cercar: ");
		int numBuscat = sc.nextInt();
		
		sc.close();
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] == numBuscat) {
				contador++;
			}
		}
		
		if (contador > 0) {
			System.out.println("El número " + numBuscat + " sí que apareix al vector.");
		} else {
			System.out.println("El número " + numBuscat + " no que apareix al vector.");
		}

	}

}

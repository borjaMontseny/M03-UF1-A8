package a8;

import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Càlcul de la lletra d'un DNI. Demanarem el DNI per teclat (sense lletra) i
		// ens mostrarà el DNI complet

		char arrayDNI[] = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V',
				'H', 'L', 'C', 'K', 'E' };
		
		System.out.print("Introdueix el DNI sense lletra: ");
		
		Scanner sc = new Scanner(System.in);
		int numDNI = sc.nextInt();
		sc.close();
		
		int letra = numDNI % 23;
		
		System.out.println("\nEl teu DNI és: " + numDNI + "-" + arrayDNI[letra]);

	}

}


/**
 * @author borjaMontseny
 */
public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Guardar en un array els 20 primers nombres parells.

		// creem el array
		int[] arrayNums = new int[20];

		// variable que anirem incrementant a cada iteració i depositant a l'array, si
		// és parell
		int num = 1;

		// for que recorre el array
		for (int i = 0; i < arrayNums.length; i++) {

			// true = es par / false = es impar
			boolean numEsPar = num % 2 == 0;

			while (!numEsPar) {

				num++;

				// tornem a redefinir el booleà, per a que es guardi el resultat al while
				numEsPar = num % 2 == 0;
			}

			// posició i del array = num
			arrayNums[i] = num;

			// sumem 1 a num
			num++;

			System.out.print(arrayNums[i] + " ");

		}

	}

}

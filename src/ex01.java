
/**
 * @author borjaMontseny
 */
public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Guardar en un array els 20 primers nombres parells.

		// creem el array
		int[] arrayNums = new int[20];

		// for que recorre el array
		for (int i = 0; i < arrayNums.length; i++) {

			int num = 1;
			
			boolean numEsPar = num % 2 == 0;

			while (!numEsPar) {
				num++;
			}

			arrayNums[i] = num;

			num++;

			System.out.println(arrayNums[i]);

		}

	}

}

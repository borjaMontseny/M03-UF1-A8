import java.util.Scanner;

/**
 * @author borjaMontseny
 */
public class ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] arrayEmpleats = new String[20];

		double[] arraySous = new double[20];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < arrayEmpleats.length; i++) {
			System.out.print("Treballador " + (i + 1) + ": ");
			arrayEmpleats[i] = sc.next();

			System.out.print("Sou de " + arrayEmpleats[i] + ": ");
			arraySous[i] = sc.nextDouble();

		}

		sc.close();
	}

}

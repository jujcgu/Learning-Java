package conditional;

public class MultipleConditional {

	public static void main(String[] args) {

		int num1 = 1;
		int num2 = 10;

		if (num2 > num1) {
			System.out.println("el num2 es mayor al num1");
		} else {
			if (num2 == num1) {
				System.out.println("el num2 es igual al num1");
			} else {
				System.out.println("en num2 no es mayor al num1");
			}
		}

	}

}

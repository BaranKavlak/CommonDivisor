
public class Bolen {

	public static int ortakBolenlerinToplamý(int a, int b) {
		int big;
		int sum = 0;
		int counter = 0;

		if (b >= a) {
			big = b;
		}
		for (int i = 1; i <= a; i++) {

			if (a % i == 0 && b % i == 0) {
				System.out.printf("%d.divisor is %d%n", ++counter, i);
				// System.out.println(i);
				sum += i;
			}
		}

		return sum;

	}

	public static void main(String[] args) {
		System.out.print("Sum = " + ortakBolenlerinToplamý(14, 28));

	}

}

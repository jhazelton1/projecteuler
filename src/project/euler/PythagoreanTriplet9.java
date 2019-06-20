package project.euler;

public class PythagoreanTriplet9 {

	public static Boolean isPythagoreanTriplet(Integer a, Integer b, Integer c) {
		return a * a + b * b == c * c;
	}

	public static Long findTripletSumOfNProduct(Integer n) {

		for (int i = 1; i < n; i++) {

			for (int j = 1; j < n; j++) {

				for (int k = 1; k < n; k++) {

					if (isPythagoreanTriplet(i, j, k)) {

						if (i + j + k == n) {
							return (long) i * j * k;
						}

					}
				}

			}

		}

		return 0L;
	}

	public static void main(String[] args) {

		System.out.println(findTripletSumOfNProduct(1000));

	}
}
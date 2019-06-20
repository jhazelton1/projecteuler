package project.euler;

public class LargestPrimeFactor3 {

	public static Boolean isPrime(Long n) {

		if (n == 2 || n == 3) {
			return true;
		}

		if (n % 2 == 0 || n % 3 == 0) {
			return false;
		}

		Long i = 5L;
		Long j = 2L;

		while (i * i <= n) {
			if (n % i == 0) {
				return false;
			}

			i += j;
			j = 6 - j;

		}

		return true;
	}

	public static Long largestPrimeFactor(Long n) {

		Long sqrt = (long) Math.floor(Math.sqrt(n));

		if (sqrt % 2 == 0) {
			sqrt -= 1;
		}

		while (sqrt > 2) {

			if (isPrime(sqrt)) {
				if (n % sqrt == 0) {
					return sqrt;
				}
			}

			System.out.println(sqrt);
			sqrt -= 2;
		}

		return 2L;

	}

	public static void main(String[] args) {

		System.out.println(largestPrimeFactor(600851475143L));
		// System.out.println(isPrime(775121L));
		// System.out.println(600851475143L % 6857L);

	}
}

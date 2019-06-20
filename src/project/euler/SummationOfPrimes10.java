package project.euler;

public class SummationOfPrimes10 {

	public static Boolean isPrime(Long n) {

		if (n == 2 || n == 3 || n == 5) {
			return true;
		}

		if (n % 2 == 0 || n % 3 == 0 || n % 5 == 0) {
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

	public static Long findSumOfPrimesBelowLimit(Long l) {

		Long sum = 0L;

		for (int i = 2; i < l; i++) {
			if (isPrime((long) i)) {
				sum += i;
			}
		}

		return sum;
	}

	public static void main(String[] args) {

		System.out.println(findSumOfPrimesBelowLimit(2000000L));

	}

}

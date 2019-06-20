package project.euler;

public class HighlyDivisibleTrriangularNumber12 {

	public static int getTriangleNumber(int n) {
		return n * (n + 1) / 2;
	}

	public static int divisorCount(int n) {
		int count = 0;
		for (int i = 1; i < Math.sqrt(n); i++) {
			if (n % i == 0) {
				count += 2;
			}
		}

		System.out.println(n + ": " + count);
		return count;
	}

	public static int triangleNumberOfNDivisors(int divisors) {

		int count = 1;

		while (divisorCount(getTriangleNumber(count)) < divisors) {
			count++;
		}

		return getTriangleNumber(count);
	}

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		System.out.println(triangleNumberOfNDivisors(500));
		System.out.println(System.currentTimeMillis() - start);

	}

}

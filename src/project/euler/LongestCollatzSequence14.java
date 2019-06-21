package project.euler;

public class LongestCollatzSequence14 {

	public static int generateSequence(long n) {

		int count = 1;

		while (n != 1) {
			if (n % 2 == 0) {
				n = n / 2;
			} else {
				n = 3 * n + 1;
			}
			count++;
		}

		return count;
	}

	public static int largestSequence(int limit) {

		int largestSequenceCount = 0;
		int largestNumber = 0;

		for (int i = 999999; i > 0; i--) {

			int sequenceCount = generateSequence((long) i);

			if (sequenceCount > largestSequenceCount) {
				largestSequenceCount = sequenceCount;
				largestNumber = i;
			}

		}

		return largestNumber;
	}

	public static void main(String[] args) {

		System.out.println(largestSequence(999999));
		// System.out.println(generateSequence(999999));

	}

}

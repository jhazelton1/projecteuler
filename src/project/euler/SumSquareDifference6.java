package project.euler;

public class SumSquareDifference6 {

	public static void main(String[] args) {
		Long sum = 0L;
		Long sumOfSquares = 0L;
		
		for (long i = 1; i <= 100; i++) {
			sum += i;
			sumOfSquares += i * i;
		}
		sum = sum * sum;
		System.out.println(sum);
		System.out.println(sumOfSquares);
		System.out.println(Math.abs(sumOfSquares - sum));
		
		
	}

}

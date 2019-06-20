package project.euler;

import java.util.ArrayList;
import java.util.List;

public class EvenFibonacciSum2 {

	public static List<Integer> generate(Integer limit) {

		List<Integer> fibonacciSequence = new ArrayList<Integer>();
		fibonacciSequence.add(1);
		fibonacciSequence.add(2);

		Integer count = 2;
		while (true) {

			Integer sum = fibonacciSequence.get(count - 1) + fibonacciSequence.get(count - 2);
			if (sum > limit) {
				break;
			} else {
				fibonacciSequence.add(sum);
				count++;
			}
		}

		return fibonacciSequence;
	}

	public static void main(String[] args) {
		List<Integer> fibonacciSequence = generate(4000000);
		Integer sum = 0;
		for (Integer index : fibonacciSequence) {
			if (index % 2 == 0) {
				sum += index;
			}
		}
		System.out.println(sum);
	}

}

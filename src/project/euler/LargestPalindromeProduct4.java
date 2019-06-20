package project.euler;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LargestPalindromeProduct4 {

	public static Boolean isPalindrome(Integer number) {

		List<String> numbers = (Arrays.asList((number.toString().split(""))));

		Collections.reverse(numbers);

		Integer reversedNumber = Integer.parseInt(String.join("", numbers));

		return number.equals(reversedNumber);
	}

	public static void main(String[] args) {

		Integer highestPalindrome = 0;

		for (int i = 999; i > 0; i--) {

			for (int j = 999; j > 0; j--) {

				if (isPalindrome(i * j)) {
					if (i * j > highestPalindrome) {
						highestPalindrome = i * j;
						System.out.println(highestPalindrome);
						System.out.println(i + " and " + j);
					}
				}

			}

		}
		
		System.out.println(highestPalindrome);

	}

}

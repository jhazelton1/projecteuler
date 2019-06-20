package project.euler;

public class SmallestMultiple5 {

	public static void main(String[] args) {

		Integer number = 40;
		Boolean condition = true;

		while (condition) {

			for (int i = 2; i <= 20; i++) {
				if (number % i == 0) {
					if (i == 20) {
						System.out.println(number);
						condition = false;
					}
				} else {
					break;
				}
			}

			number += 2;

		}

	}

}

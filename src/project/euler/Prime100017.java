package project.euler;

public class Prime100017 {
	
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
	
	public static void main(String[] args) {
		
		Long n = 2L;
		Integer count = 0; 
		while (count != 10001) {
			if (isPrime(n)) {
				count++;
				System.out.println(count + ": " + n);
			}
			n += 1L;
		}
		
		System.out.println(n);
		
	}
	
}

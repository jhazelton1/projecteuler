package project.euler;

import java.util.ArrayList;
import java.util.List;

public class PowerDigitSum {

	public static void main(String[] args) {
		List<Long> twos = new ArrayList<Long>() {
			{
				add(2L);
			}
		};
		
		for (int i = 0; i < 999; i++) {
			twos.add(twos.get(i) * 2);
		}
	
		System.out.println(twos);
	}

}

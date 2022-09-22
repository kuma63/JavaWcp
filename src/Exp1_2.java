
public class Exp1_2 {
	public static void main(String[] args) {
		int gusuSum = 0;

		for (int i = 2; i <= 100; i++) {
			if(i % 2 == 0) {
				gusuSum += i;
			}
		}
		System.out.println("2から100までの偶数の和は" + gusuSum + "です");
	}

}

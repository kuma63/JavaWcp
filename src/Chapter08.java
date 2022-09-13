
public class Chapter08 {
	public static void main(String[] args) {
		int num = 1;
		while (num < 5) {
			System.out.println(num * num);
			num++;
		}

		int numbers[] = {1, 2, 3, 4};
		for (int number = 0; number < numbers.length; number++) {
			System.out.println(numbers[number]);
		}

		for (int number : numbers) {
			if (number % 2 == 0) {
				continue;
			}
			System.out.println(number);
		}
	}

}

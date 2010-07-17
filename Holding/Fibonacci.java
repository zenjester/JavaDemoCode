public class Fibonacci {
	public static void main(String args[]) {
		int first = 1;
		int second = 1;
		int third = 1;
		int count = 1;
		int seed = 10;

		for (count = 1; count < seed; ++count) {
			System.out.println(third);
			first = second;
			second = third;
			third = first + second;

		}
	}
}

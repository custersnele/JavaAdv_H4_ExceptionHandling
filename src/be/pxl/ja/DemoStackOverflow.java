package be.pxl.ja;

public class DemoStackOverflow {

	// Method to print numbers
	private static void printNumber(int x) {
		System.out.println(x);
		printNumber(x + 2);
	}

	public static void main(String[] args) {
		printNumber(15);
	}
}

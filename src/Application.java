public class Application {

	public static void main(String[] args) {

		// Task1 Primitives

		byte b = 1;
		short s = 2;
		int i = 3;
		long l = 4;
		float f = 1;
		double d = 2.2;
		char c = ';';
		boolean bool = true;

		// Task2 Sizes of Primitives
		System.out.println("Byte min = " + Byte.MIN_VALUE + "; Byte max = " + Byte.MAX_VALUE + ";");
		System.out.println("Short min = " + Short.MIN_VALUE + "; Short max = " + Short.MAX_VALUE + ";");
		System.out.println("Byte min = " + Byte.MIN_VALUE + "; Byte max = " + Byte.MAX_VALUE + ";");
		System.out.println("Integer min = " + Integer.MIN_VALUE + "; Integer max = " + Integer.MAX_VALUE + ";");
		System.out.println("Long min = " + Long.MIN_VALUE + "; Long max = " + Long.MAX_VALUE + ";");
		System.out.println("Double min = " + Double.MIN_VALUE + "; Double max = " + Double.MAX_VALUE + ";");
		System.out.println("Char min = " + Character.MIN_VALUE + "; Char max = " + Character.MAX_VALUE + ";");

		// Task3 Arrays

		int[] arr = { 3, 0, 6, 5, 8, 1, 4, 9, 7, 4 };

		int max = 0;
		int min = 0;

		for (int j = 0; j < arr.length; j++) {
			if (arr[j] > max)
				max = arr[j];
		}

		System.out.println("Max value in array: " + max);

		for (int k = 0; k < arr.length; k++) {
			if (arr[k] < min)
				min = arr[k];
		}

		System.out.println("Min value in array: " + min);

	}
}

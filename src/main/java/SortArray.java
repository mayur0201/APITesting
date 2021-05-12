import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		int[] arr = { 13, 7, 6, 45, 21, 9, 2, 100 };

		int[] b = new int[arr.length];

		Arrays.sort(arr);

		for (int i = 0; i <= arr.length - 1; i++) {
			b[i] = arr[i];
			System.out.println(b[i]);
		}

	}
}
import java.util.ArrayList;

public class Moving0s {

	public static void main(String[] args) {
		int a[] = { 1, 0, 5, 6, 7, 0, 3 };
		int count = 0;
		ArrayList<Integer> arrays = new ArrayList<>();

		for (int i = 0; i <= a.length - 1; i++) {
			if (a[i] == 0) {
				count++;
			} else {
				arrays.add(a[i]);

			}
		}

		for (int j = 0; j <= count - 1; j++) {
			arrays.add(0);
		}

		for (Integer r : arrays) {
			System.out.println(r);
		}

	}

}
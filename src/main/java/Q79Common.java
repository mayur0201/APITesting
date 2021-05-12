import java.util.ArrayList;

public class Q79Common {

	public static void main(String[] args) {

		int a[] = { 20, 30, 40, 90, 78, 44, 22 };
		ArrayList<Integer> array = new ArrayList<>();

		for (int i = 0; i <= a.length - 1; i++) {
			array.add(a[i]);

		}

		for (int i = 0; i <= array.size() - 1; i++) {
			if (i == 0) {
				array.add(a.length, array.get(i));
				array.remove(array.get(0));
			}
		}

		for (Integer s : array) {
			System.out.println(s);
		}

	}

}

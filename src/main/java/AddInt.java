import java.util.ArrayList;

public class AddInt {

	public static void main(String[] args) {

		int a[] = { 2, 3, 7, 10 };

		ArrayList<Integer> a1 = new ArrayList<>();

		for (int i = 0; i <= a.length - 1; i++) {
			if (i == 0) {
				a1.add(a[i]);
			} else {
				a1.add(a[i - 1] + a[i]);
			}

		}

		for (Integer ar : a1) {
			System.out.println(ar);
		}

	}

}

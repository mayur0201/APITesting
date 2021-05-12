import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Test {

	public static void main(String[] args) {

		int a[] = { -2, -1, 0, 1, 2, 3 };

		ArrayList<Integer> a1 = new ArrayList<>();

		for (int i = 0; i < a.length; i++) {
			a1.add(a[i] * a[i]);
		}

		Collections.sort(a1);

		for (Integer ar : a1) {
			System.out.println(ar);
		}

	}

}

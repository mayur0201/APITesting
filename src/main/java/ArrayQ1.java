
public class ArrayQ1 {

	public static void main(String[] args) {

		int a[] = { 2, 3 };
		String x = "";

		for (int i = 0; i <= a.length - 1; i++) {
			x = x + x.valueOf(a[i]);

		}

		int value = Integer.parseInt(x);

		value += 1;

		System.out.println(value);

	}

}

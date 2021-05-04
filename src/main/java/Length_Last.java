import java.util.ArrayList;

public class Length_Last {

	public static void main(String[] args) {
		String x = "This is the code ";

		String[] w = x.split(" ");

		ArrayList<String> arr = new ArrayList<>();
		for (int i = 0; i <= w.length - 1; i++) {
			arr.add(w[i]);
		}

		for (int i = 0; i <= arr.size() - 1; i++) {
			if (i == arr.size() - 1) {
				System.out.println(arr.get(i));
				System.out.println(arr.get(i).length());
			}

		}

	}

}

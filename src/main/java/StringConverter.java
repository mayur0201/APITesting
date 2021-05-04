import java.util.ArrayList;

public class StringConverter {

	public static void main(String[] args) {
		String test = "w4c3d3x3";

		ArrayList<Object> as = new ArrayList<>();

		for (int i = 0; i <= test.length() - 1; i++) {
			char ax = test.charAt(i);
			char count = test.charAt(i + 1);
			int cnt = Character.getNumericValue(count);

			for (int j = 0; j < cnt; j++) {
				as.add(ax);
			}
			i += 1;
		}

		for (Object obj : as) {
			System.out.print(obj);
		}
	}

}

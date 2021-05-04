import java.util.HashSet;
import java.util.Set;

public class Duplicate_Array {

	public static void main(String[] args) {

		String arr[] = { "Amazon", "Facebook", "Google", "Amazon", "Netflix", "Netflix", "Facebook", "Apple" };

		System.out.println("******Brute Force********");

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].equals(arr[j])) {
					System.out.println(arr[j]);
				}
			}
		}

		System.out.println("******Hash Set********");

		Set<String> s1 = new HashSet<String>();

		for (String x : arr) {
			if (s1.add(x) == false) {
				System.out.println(x);
			}
		}

	}

}

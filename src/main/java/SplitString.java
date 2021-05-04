import java.util.Scanner;

public class SplitString {

	public static void main(String[] args) {

		String x = "mam is in the room";
		int count = 0;
		Scanner sc = new Scanner(x);

		while (sc.hasNext()) {
			String a = sc.next();
			System.out.println(a);

			if (a.endsWith("m")) {
				count++;
			}

		}

		System.out.println("String ending with m" + " " + count);

	}

}

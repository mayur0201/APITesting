import java.util.ArrayList;
import java.util.Scanner;

public class AddStringInMiddle {

	public static void main(String[] args) {

		String s1 = "My name Mayur";
		String s2 = "is";
		ArrayList<Object> array = new ArrayList<>();
		int count = 0;

		Scanner sc = new Scanner(s1);
		Scanner s3 = new Scanner(System.in);

		System.out.print("enter the position");
		int input = s3.nextInt();

		while (sc.hasNext()) {
			if (count == input) {
				array.add(s2 + " ");
			}

			else {
				array.add(sc.next() + " ");
			}

			count++;
		}

		for (Object obj : array) {
			System.out.print(obj);
		}

	}

}

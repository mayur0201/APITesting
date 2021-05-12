import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Top3Num {

	public static void main(String[] args) {
		int count = 0;
		System.out.println("enter 8 numbers btwn 1 to 1000");
		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> arr = new ArrayList<>();

		for (int i = 0; i < 8; i++) {
			int num = sc.nextInt();
			arr.add(num);
		}

		Collections.sort(arr);

		for (int j = arr.size() - 1; j >= 0; j--) {

			if (count == 3) {
				break;
			}

			else {
				System.out.println(arr.get(j));
				count++;
			}
		}

	}
}
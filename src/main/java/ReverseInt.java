import java.util.ArrayList;

public class ReverseInt {

	public static void main(String[] args) {

		int x = 123456;
		String reverse = "";

		String number = String.valueOf(x);

		for (int i = number.length(); i > 0; i--) {
			reverse += i;
		}

		int y = Integer.parseInt(reverse);

		System.out.println(y);

	}

}

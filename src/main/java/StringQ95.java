
public class StringQ95 {

	public static void main(String[] args) {
		String a = "ab5c2d4ef12sSS  uu8721 e221421";
		int num = 0;
		int sum = 0;
		for (int i = 0; i <= a.length() - 1; i++) {
			if ((a.charAt(i) >= 97 && a.charAt(i) <= 122) || (a.charAt(i) >= 65 && a.charAt(i) <= 90)
					|| (a.charAt(i) == 32)) {

				continue;
			}

			else {
				num = Character.getNumericValue(a.charAt(i));
				System.out.println(num);
				sum = sum + num;
			}
		}

		System.out.print(sum);

	}

}

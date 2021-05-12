
public class ChallengeQuestion {

	public static void main(String[] args) {

		String a = "7cc?a??2ss?qrr1???9";
		int count = 0, countq = 0;
		int beg = 0, end = 0, begval = 0, endval = 0;

		for (int i = 0; i <= a.length() - 1; i++) {
			if (a.charAt(i) >= 48 && a.charAt(i) <= 57) {
				count++;
				if (count == 1) {
					beg = i;
					begval = Integer.parseInt(String.valueOf(a.charAt(i)));

				}
				if (count == 2) {
					end = i;
					endval = Integer.parseInt(String.valueOf(a.charAt(i)));

					if (begval + endval == 10) {
						for (int j = beg; j <= end; j++) {
							if (a.charAt(j) == 63) {
								countq++;
								if (countq == 3) {
									System.out.println("Test Case Passed");
									countq = 0;
								}
							}
						}
					} else {
						System.out.println("No values found with sum 10");
					}
					count = 0;
				}

			}
		}

	}
}
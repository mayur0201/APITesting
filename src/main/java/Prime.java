
public class Prime {

	public static void main(String[] args) {

		int num = 77;
		boolean flag = true;

		for (int i = 2; i < num; i++) {

			if (num % i == 0) {
				flag = false;
				break;
			}
		}

		if (flag) {
			System.out.println("Prime Number");
		}

		else
			System.out.println("Not Prime Number");

	}

}

import java.util.ArrayList;

/*Write a Java program to separate even and odd numbers of a given array of integers. 
 * Put all even numbers first, and then odd numbers.
 */

public class EvenOddSort {

	public static void main(String[] args) {

		int a[] = { 20, 12, 23, 17, 7, 8, 10, 2, 1, 0 };

		ArrayList<Integer> al = new ArrayList<>();
		ArrayList<Integer> ax = new ArrayList<>();

		for (int i = 0; i <= a.length - 1; i++) {
			if (a[i] % 2 == 0) {
				al.add(a[i]);
			} else {
				ax.add(a[i]);
			}
		}

		al.addAll(ax);

		for (Integer ar : al) {
			System.out.println(ar);
		}
	}

}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*Given two sorted arrays A and B of size p and q, 
 * write a Java program to merge elements of A with B by maintaining the sorted order i.e. 
 * fill A with first p smallest elements and fill B with remaining elements
 */
public class ArrayTest {

	public static void main(String[] args) {

		int[] a = { 1, 5, 6, 7, 8, 10 };
		int[] b = { 2, 4, 9 };

		Arrays.sort(a);
		Arrays.sort(b);

		ArrayList<Integer> al = new ArrayList<>();

		for (int i = 0; i <= a.length - 1; i++) {
			al.add(a[i]);
		}

		for (int i = 0; i <= b.length - 1; i++) {
			al.add(b[i]);
		}

		Collections.sort(al);

		for (int i = 0; i <= al.size() - 1; i++) {
			// System.out.println(al.get(i));
		}

		System.out.println("Sorted element in array a");
		for (int i = 0; i <= a.length - 1; i++) {

			a[i] = al.get(i);
			System.out.println(a[i]);
		}

		System.out.println("Sorted element in array b");

		for (int i = a.length; i <= al.size() - 1; i++) {

			System.out.println(al.get(i));
		}
	}

}

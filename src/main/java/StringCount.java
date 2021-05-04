import java.util.Scanner;

public class StringCount {

	public static void main(String[] args) {
		
		String test = "wwwwcccdddxxx";
		int n = test.length();
		for (int i = 0; i <= n-1; i++) {
			 
            int count = 1;
            while (i < n - 1 &&
                   test.charAt(i) == test.charAt(i + 1)) {
                count++;
                i++;
            }
 
            
            System.out.print(test.charAt(i));
            System.out.print(count);
        }
	}

}

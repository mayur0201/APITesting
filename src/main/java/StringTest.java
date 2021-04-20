import java.util.ArrayList;

public class StringTest {

	public static void main(String[] args) {
		
		
		String test = "testatzahhhhzahhhhzahhhh" ;
		ArrayList<Object> al = new ArrayList<Object>();
		
		int lenght_of_string =test.length();
		
		for(int i=0;i<=lenght_of_string-1 ; i++)
		{
			if(i==lenght_of_string)
				break;
			
			else
				if(test.charAt(i) =='z' && test.charAt(i+2) =='g')
				{
					al.add(test.charAt(i));
					al.add(test.charAt(i+2));
					i+= 2;
				}
		
				else
					
				al.add(test.charAt(i));
	
	  }

		for (int i = 0; i <= al.size()-1; i++)
		{
            System.out.print(al.get(i));
		}
		
	
	
	}
	
}
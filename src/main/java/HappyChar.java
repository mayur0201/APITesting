
public class HappyChar {

	public static void main(String[] args) {
		
		String example = "ddhhxxg";
		
		int lenght_of_string =example.length();
		
		for(int i=0;i<=lenght_of_string-1;i++)
		{
			if(i==0 || i==example.length()-1)
			{
				continue;
			}
			if(example.charAt(i)==example.charAt(i-1) || example.charAt(i)==example.charAt(i+1))
			{
				System.out.println("Happy Character found" + " " + example.charAt(i) );
				
			}
			
		}
	}

}

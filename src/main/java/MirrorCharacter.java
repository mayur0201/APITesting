
public class MirrorCharacter {

	public static void main(String[] args) {
	
		String x = "rotavator";
		int l =x.length();
        
		StringBuffer sb = new StringBuffer(x);
		StringBuffer x1=sb.reverse();
		String x2 = new String(x1);
		
		System.out.println(x);
		System.out.println(x1);
		
		if(x.equals(x2))
		{
			System.out.println("True");
		}
		
	    
	
		
	
		
	
	
	}
	

}

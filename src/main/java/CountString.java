import java.util.HashMap;
import java.util.Map;

 

public class CountString {

 

    public static void main(String[] args) {
        
        
        String a = "assaa";
        
        HashMap<Character,Integer> h = new HashMap<>();
        
        for(int i=0;i<=a.length()-1;i++)
        {
            if(h.containsKey(a.charAt(i))) {
        int count=     h.get(a.charAt(i));
        
        h.put(a.charAt(i), ++count);
            
        }
        
        else
        {
            h.put(a.charAt(i), 1);
        }
        }
        
        for(Map.Entry<Character, Integer> m:h.entrySet())
        {
            if(m.getValue()==3)
            System.out.println(m.getKey()+ " " +m.getValue());
        }

 

    }

 

}
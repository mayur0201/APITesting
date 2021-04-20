import java.util.Arrays;

public class SortArray {

 

    public static void main(String[] args) {
    	int[] arr = {13, 7, 6, 45, 21, 9, 2, 100};
    	
    	int[] b = {} ;
    	 
        
      Arrays.sort(arr);
        
      int  size =arr.length;
        for(int i=0;i<size ; i++)
        {
        	for(int j=0;j<size;j++)
        	{
        		b[j]=arr[i];
        	}
        	
        	
        }
        
        
        //System.out.println(Arrays.toString(b));
    }
} 
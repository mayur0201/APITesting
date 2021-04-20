import java.util.ArrayList;

import com.excelutility.Xls_Reader;

public class ExcelTesting {

	public static void main(String[] args) {
	
		String filepath = "C:\\Users\\Conduent\\Desktop\\TestingExcelfile";
		getdatafromexcel(filepath);	
	}
	
	
	static Xls_Reader reader ;
	
	public static ArrayList<Object[]> getdatafromexcel(String path){
		ArrayList<Object[]> mydata = new ArrayList<Object[]>();
		
		try
		{
			reader = new Xls_Reader(path);
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		for(int rowcount=2 ; rowcount<reader.getRowCount("Data"); rowcount++)
		{
			String name=reader.getCellData("Data", "Name", rowcount);
			String city=reader.getCellData("Data", "City", rowcount);
			String Country=reader.getCellData("Data", "Country", rowcount);
			String ZipCode=reader.getCellData("Data", "ZipCode", rowcount);
			
			Object ob[] = {name , city ,Country , ZipCode };
			
			mydata.add(ob);
			
		}
		
		return mydata;
		
		
	}

	
}



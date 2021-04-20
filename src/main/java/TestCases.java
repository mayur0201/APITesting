import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class TestCases {

	SoftAssert softassert = new SoftAssert();
	
	@Test
	
	public void test1()
	{
		
		System.out.println("Testing Soft Assert");
		Assert.assertEquals(false, false);
		
		System.out.println("Mayur1");
		softassert.assertEquals(false, true);
		System.out.println("Mayur2");
		softassert.assertEquals(false, true);
		System.out.println("Mayur3");
		System.out.println("Mayur4");
		
		softassert.assertAll();
	}
}

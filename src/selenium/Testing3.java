package selenium;

import static org.junit.Assert.*;

import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import junit.framework.Assert;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class Testing3 {
	

    @Rule
    public ErrorCollector err = new ErrorCollector();
	@Test
	public void tes6t() {
				String actual = "abc";
				String expected ="abc1";
				System.out.println("before 1st assert");
				//Assert.assertEquals(expected, actual); //we use regular assert in the history
				System.out.println("after 1st assert");
				Assert.assertTrue("Verify 2>3", 2>3);
				System.out.println("after 2nd assert");

				
			/*	if(actual.equals(expected)) {
					System.out.println("pass");
					
				}
				else {
					System.out.println("fail");
				}*/
	}

	
	
	

	@Test
	public void test7() {
		String actual = "abc";
		String expected = "abc1";
		System.out.println("before 1st Assert");
		try {
		Assert.assertEquals(expected, actual); 
		}catch(Throwable t) {
			err.addError(t);
			System.out.println("I'm in Catch1");
		}
		System.out.println("After 1st Assert");
		try {
		Assert.assertTrue("Verify 2>3", 2>3);
		}catch(Throwable t) {
			err.addError(t);
			System.out.println("I'm in catch2");
		}
		System.out.println("After 2nd Assert");
	}
}

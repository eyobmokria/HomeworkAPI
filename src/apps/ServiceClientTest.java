/**
 * 
 */
package apps;

import static org.junit.Assert.*;
import javax.persistence.NoResultException;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author eyob mokria
 *
 */
public class ServiceClientTest {

	/**
	 * Test method for
	 * {@link apps.ServiceClient#invokeservice(java.lang.String)}.
	 */
	@Test
	public void testInvokeservice() {
		fail("Not yet implemented");
		ServiceClient sc = new ServiceClient();
		try {

		String str = sc.invokeservice("http://api.walmartlabs.com/v1/search?apiKey=3guft8a6zzakcuzsjyxt73xt&query=" + "tv");
        Assert.assertTrue(str.isEmpty() || str.equals(null));
        	
        
		} catch (NoResultException e) {
			// TODO: handle exception
			System.out.println(e.getMessage()+" invalid input");
		}
	}

	/**
	 * Test method for {@link apps.ServiceClient#main(java.lang.String[])}.
	 */
	@Test
	public void testMain() {
		fail("Not yet implemented");
	}

}

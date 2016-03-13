/**
 * 
 */
package apps;


import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @author eyob mokria
 *
 */
public class Main {
	

	  public Main() {
	    // TODO Auto-generated constructor stub
	  }

	  public static void main(String[] args) {
	    // first step call first product webserice.
	    try {
	      URL url = new URL("");
	      HttpURLConnection connection = (HttpURLConnection) url.openConnection();
	      connection.setDoOutput(true);
	      connection.setInstanceFollowRedirects(false);
	      connection.setRequestMethod("GET");
	      connection.setRequestProperty("Content-Type", "application/json");

	      OutputStream os = connection.getOutputStream();
	      Object jaxbContext;
	      // jaxbContext.createMarshaller().marshal(String.class, os);
	      os.flush();

	      connection.getResponseCode();
	      connection.disconnect();
	    } catch (Exception e) {
	      throw new RuntimeException(e);
	    }
	  }

	  // step 2 map the response with Product Response.class
	  // step 3 retrive the first Item Id
	  // step 4 call get recommendation products.
	  // list of productResponse will be returned
	  // for each products , look call the review service,
	  // returned object will map with Review Response object.

}

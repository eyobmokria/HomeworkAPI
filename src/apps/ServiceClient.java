/**
 * 
 */
package apps;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;

import domain.ProductResponse;

/**
 * @author eyob mokria
 *
 */

public class ServiceClient {

	public static void callService() {

		String uri = "http://api.walmartlabs.com/v1/search?apiKey=3guft8a6zzakcuzsjyxt73xt&query=tv";
		try {
			Client client = ClientBuilder.newClient();
			WebTarget webTarget = client.target(uri);

			Invocation.Builder invocationBuilder = webTarget.request(MediaType.APPLICATION_JSON_TYPE);
			Response response = invocationBuilder.get();
			String resString = response.readEntity(String.class);

			System.out.println(response.getStatus());
			System.out.println(resString);

			Gson gson = new Gson();
			ProductResponse responseobject = gson.fromJson(resString, ProductResponse.class);
			System.out.println(responseobject.toString());
			System.out.println(responseobject.getQuery());
			System.out.println(responseobject.getItems().get(0).getItemId());
			if (response.getStatus() != 200) {

				throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());

			}
		} catch (Exception e) {

			e.printStackTrace();

		}
	}

	public static void main(String[] args) {
		callService();

	}

}
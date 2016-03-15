/**
 * 
 */
package apps;

import java.util.List;
import java.util.Scanner;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import domain.Item;
import domain.ProductResponse;
import domain.Review;
import domain.ReviewResponse;

/**
 * @author eyob mokria
 *
 */

public class ServiceClient {
	Gson gson = new Gson();

	public final String SEARCH_URL = "http://api.walmartlabs.com/v1/search?apiKey=3guft8a6zzakcuzsjyxt73xt&query=";
	public final String PRODUCT_URL = "http://api.walmartlabs.com/v1/nbp?apiKey=3guft8a6zzakcuzsjyxt73xt&itemId=";
	public final String REVIEW_URL = "http://api.walmartlabs.com/v1/reviews/";
	public final String APIKEY = "?apiKey=3guft8a6zzakcuzsjyxt73xt";

	public static String invokeservice(String url) {
		String resString = "";
		if (url != null && !url.isEmpty()) {
			Client client = ClientBuilder.newClient();
			WebTarget webTarget = client.target(url);

			Invocation.Builder invocationBuilder = webTarget.request(MediaType.APPLICATION_JSON_TYPE);
			Response response = invocationBuilder.get();
			if (response.getStatus() != 200) {

				throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());

			}
			resString = response.readEntity(String.class);
		}
		return resString;
	}

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String querytxt = "";
		System.out.println("Please Provide a query string");
		querytxt = sc.nextLine();

		ServiceClient client = new ServiceClient();
		String productresponse = invokeservice(client.SEARCH_URL + querytxt);

		ProductResponse responseobject = client.gson.fromJson(productresponse, ProductResponse.class);
		System.out.println(responseobject);
		System.out.println(responseobject.getQuery());
		long itemId = responseobject.getItems().get(0).getItemId();
		System.out.println(itemId);
		String resp;
		List<Item> respObject = null;

		if (itemId > 0) {
			resp = client.invokeservice(client.PRODUCT_URL + itemId);
			System.out.println(resp);

			respObject = client.gson.fromJson(resp, new TypeToken<List<Item>>() {
			}.getType());
			System.out.println(respObject.size());
		}

		int index = 0;

		for (int i = 0; i < respObject.size() && i < 10; i++) {

			String reviewStr = invokeservice(client.REVIEW_URL + respObject.get(i).getItemId() + client.APIKEY);
			ReviewResponse reviewResponse = client.gson.fromJson(reviewStr, ReviewResponse.class);

			System.out.println(index++ + " " + reviewResponse.toString());


		}

	}

}
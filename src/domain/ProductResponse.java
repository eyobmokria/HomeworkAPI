/**
 * 
 */
package domain;

import java.util.List;

/**
 * @author eyob mokria
 *
 */
public class ProductResponse {

	public ProductResponse() {
		// TODO Auto-generated constructor stub
	}

	private String query;
	private String sort;
	private String responseGroup;
	private long totalResults;
	private long start;
	private long numItems;
	private List<Item> items;

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public String getResponseGroup() {
		return responseGroup;
	}

	public void setResponseGroup(String responseGroup) {
		this.responseGroup = responseGroup;
	}

	public long getTotalResults() {
		return totalResults;
	}

	public void setTotalResults(long totalResults) {
		this.totalResults = totalResults;
	}

	public long getStart() {
		return start;
	}

	public void setStart(long start) {
		this.start = start;
	}

	public long getNumItems() {
		return numItems;
	}

	public void setNumItems(long numItems) {
		this.numItems = numItems;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

}

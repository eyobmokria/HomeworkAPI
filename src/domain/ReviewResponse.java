/**
 * 
 */
package domain;

/**
 * @author eyob mokria
 *
 */
public class ReviewResponse {
	

	  private long itemId;
	  private long salePrice;
	 private String  name;
	 private String  upc;
	 private String  categoryPath;
	 private String  brandName;
	 private String  productTrackingUrl;
	 private String  productUrl;
	 private String  categoryNode;
	 private  Review []reviews ;
	 public long getItemId() {
	  return itemId;
	}
	public void setItemId(long itemId) {
	  this.itemId = itemId;
	}
	public long getSalePrice() {
	  return salePrice;
	}
	public void setSalePrice(long salePrice) {
	  this.salePrice = salePrice;
	}
	public String getName() {
	  return name;
	}
	public void setName(String name) {
	  this.name = name;
	}
	public String getUpc() {
	  return upc;
	}
	public void setUpc(String upc) {
	  this.upc = upc;
	}
	public String getCategoryPath() {
	  return categoryPath;
	}
	public void setCategoryPath(String categoryPath) {
	  this.categoryPath = categoryPath;
	}
	public String getBrandName() {
	  return brandName;
	}
	public void setBrandName(String brandName) {
	  this.brandName = brandName;
	}
	public String getProductTrackingUrl() {
	  return productTrackingUrl;
	}
	public void setProductTrackingUrl(String productTrackingUrl) {
	  this.productTrackingUrl = productTrackingUrl;
	}
	public String getProductUrl() {
	  return productUrl;
	}
	public void setProductUrl(String productUrl) {
	  this.productUrl = productUrl;
	}
	public String getCategoryNode() {
	  return categoryNode;
	}
	public void setCategoryNode(String categoryNode) {
	  this.categoryNode = categoryNode;
	}
	public Review[] getReviews() {
	  return reviews;
	}
	public void setReviews(Review[] reviews) {
	  this.reviews = reviews;
	}
	public ReviewStatistics getReviewStatistics() {
	  return reviewStatistics;
	}
	public void setReviewStatistics(ReviewStatistics reviewStatistics) {
	  this.reviewStatistics = reviewStatistics;
	}
	public boolean isAvailableOnline() {
	  return availableOnline;
	}
	public void setAvailableOnline(boolean availableOnline) {
	  this.availableOnline = availableOnline;
	}
	private  ReviewStatistics reviewStatistics;
	 private boolean availableOnline;

}

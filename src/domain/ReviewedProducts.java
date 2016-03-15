/**
 * 
 */
package domain;

import java.util.List;

/**
 * @author eyob mokria
 *
 */
public class ReviewedProducts {
	
	private Item item;
	private List<Review> reviews;
	/**
	 * @return the item
	 */
	public Item getItem() {
		return item;
	}
	/**
	 * @param item the item to set
	 */
	public void setItem(Item item) {
		this.item = item;
	}
	/**
	 * @return the reviews
	 */
	public List<Review> getReviews() {
		return reviews;
	}
	/**
	 * @param reviews the reviews to set
	 */
	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ReviewedProducts [item=" + item + ", reviews=" + reviews + "]";
	}
	
	

}

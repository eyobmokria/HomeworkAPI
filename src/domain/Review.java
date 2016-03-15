/**
 * 
 */
package domain;

import apps.OverallRating;

/**
 * @author eyob mokria
 *
 */
public class Review {

	private String downVotes;

	private String upVotes;

	private String title;

	private String reviewText;

	private String name;

	private String submissionTime;

	private String reviewer;

	private ProductAttribute[] productAttributes;

	private OverallRating overallRating;

	public String getDownVotes() {
		return downVotes;
	}

	public void setDownVotes(String downVotes) {
		this.downVotes = downVotes;
	}

	public String getUpVotes() {
		return upVotes;
	}

	public void setUpVotes(String upVotes) {
		this.upVotes = upVotes;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getReviewText() {
		return reviewText;
	}

	public void setReviewText(String reviewText) {
		this.reviewText = reviewText;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubmissionTime() {
		return submissionTime;
	}

	public void setSubmissionTime(String submissionTime) {
		this.submissionTime = submissionTime;
	}

	public String getReviewer() {
		return reviewer;
	}

	public void setReviewer(String reviewer) {
		this.reviewer = reviewer;
	}

	public ProductAttribute[] getProductAttribute() {
		return productAttributes;
	}

	public void setProductAttributes(ProductAttribute[] productAttribute) {
		this.productAttributes = productAttribute;
	}

	public OverallRating getOverallRating() {
		return overallRating;
	}

	public void setOverallRating(OverallRating overallRating) {
		this.overallRating = overallRating;
	}

	@Override
	public String toString() {
		return "Review Detail  [downVotes = " + downVotes + ", upVotes = " + upVotes + ", title = " + title
				+ ", reviewText = " + reviewText + ", name = " + name + ", submissionTime = " + submissionTime
				+ ", reviewer = " + reviewer + ", productAttributes = " + productAttributes + ", overallRating = "
				+ overallRating + "]";
	}

}

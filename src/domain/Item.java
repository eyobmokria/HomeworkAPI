/**
 * 
 */
package domain;

import apps.GiftOptions;

/**
 * @author eyob mokria
 *
 */
public class Item {
	
	private String affiliateAddToCartUrl;

    private long standardShipRate;

    private String customerRatingImage;

    private String thumbnailImage;

    private GiftOptions giftOptions;

    private String productTrackingUrl;

    private double msrp;

    private String categoryNode;

    private long numReviews;

    private String mediumImage;

    private String name;

    private String longDescription;

    private boolean bundle;

    private String addToCartUrl;

    private ImageEntity[] imageEntities;

    private boolean marketplace;

    private double customerRating;

    private String largeImage;

    private long parentItemId;

    private long itemId;

    private long upc;

    private String categoryPath;

    private boolean availableOnline;

    private String shortDescription;

    private String productUrl;

    private double salePrice;

    private String modelNumber;

    public String getAffiliateAddToCartUrl ()
    {
        return affiliateAddToCartUrl;
    }

    public void setAffiliateAddToCartUrl (String affiliateAddToCartUrl)
    {
        this.affiliateAddToCartUrl = affiliateAddToCartUrl;
    }

    public long getStandardShipRate ()
    {
        return standardShipRate;
    }

    public void setStandardShipRate (long standardShipRate)
    {
        this.standardShipRate = standardShipRate;
    }

    public String getCustomerRatingImage ()
    {
        return customerRatingImage;
    }

    public void setCustomerRatingImage (String customerRatingImage)
    {
        this.customerRatingImage = customerRatingImage;
    }

    public String getThumbnailImage ()
    {
        return thumbnailImage;
    }

    public void setThumbnailImage (String thumbnailImage)
    {
        this.thumbnailImage = thumbnailImage;
    }

    public GiftOptions getGiftOptions ()
    {
        return giftOptions;
    }

    public void setGiftOptions (GiftOptions giftOptions)
    {
        this.giftOptions = giftOptions;
    }

    public String getProductTrackingUrl ()
    {
        return productTrackingUrl;
    }

    public void setProductTrackingUrl (String productTrackingUrl)
    {
        this.productTrackingUrl = productTrackingUrl;
    }

    public double getMsrp ()
    {
        return msrp;
    }

    public void setMsrp (double msrp)
    {
        this.msrp = msrp;
    }

    public String getCategoryNode ()
    {
        return categoryNode;
    }

    public void setCategoryNode (String categoryNode)
    {
        this.categoryNode = categoryNode;
    }

    public long getNumReviews ()
    {
        return numReviews;
    }

    public void setNumReviews (long numReviews)
    {
        this.numReviews = numReviews;
    }

    public String getMediumImage ()
    {
        return mediumImage;
    }

    public void setMediumImage (String mediumImage)
    {
        this.mediumImage = mediumImage;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getLongDescription ()
    {
        return longDescription;
    }

    public void setLongDescription (String longDescription)
    {
        this.longDescription = longDescription;
    }

    public boolean getBundle ()
    {
        return bundle;
    }

    public void setBundle (boolean bundle)
    {
        this.bundle = bundle;
    }

    public String getAddToCartUrl ()
    {
        return addToCartUrl;
    }

    public void setAddToCartUrl (String addToCartUrl)
    {
        this.addToCartUrl = addToCartUrl;
    }

    public ImageEntity[] getImageEntities ()
    {
        return imageEntities;
    }

    public void setImageEntities (ImageEntity[] imageEntities)
    {
        this.imageEntities = imageEntities;
    }

    public boolean getMarketplace ()
    {
        return marketplace;
    }

    public void setMarketplace (boolean marketplace)
    {
        this.marketplace = marketplace;
    }

    public double getCustomerRating ()
    {
        return customerRating;
    }

    public void setCustomerRating (double customerRating)
    {
        this.customerRating = customerRating;
    }

    public String getLargeImage ()
    {
        return largeImage;
    }

    public void setLargeImage (String largeImage)
    {
        this.largeImage = largeImage;
    }

    public long getParentItemId ()
    {
        return parentItemId;
    }

    public void setParentItemId (long parentItemId)
    {
        this.parentItemId = parentItemId;
    }

    public long getItemId ()
    {
        return itemId;
    }

    public void setItemId (long itemId)
    {
        this.itemId = itemId;
    }

    public long getUpc ()
    {
        return upc;
    }

    public void setUpc (long upc)
    {
        this.upc = upc;
    }

    public String getCategoryPath ()
    {
        return categoryPath;
    }

    public void setCategoryPath (String categoryPath)
    {
        this.categoryPath = categoryPath;
    }

    public boolean getAvailableOnline ()
    {
        return availableOnline;
    }

    public void setAvailableOnline (boolean availableOnline)
    {
        this.availableOnline = availableOnline;
    }

    public String getShortDescription ()
    {
        return shortDescription;
    }

    public void setShortDescription (String shortDescription)
    {
        this.shortDescription = shortDescription;
    }

    public String getProductUrl ()
    {
        return productUrl;
    }

    public void setProductUrl (String productUrl)
    {
        this.productUrl = productUrl;
    }

    public double getSalePrice ()
    {
        return salePrice;
    }

    public void setSalePrice (double salePrice)
    {
        this.salePrice = salePrice;
    }

    public String getModelNumber ()
    {
        return modelNumber;
    }

    public void setModelNumber (String modelNumber)
    {
        this.modelNumber = modelNumber;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [affiliateAddToCartUrl = "+affiliateAddToCartUrl+", standardShipRate = "+standardShipRate+", customerRatingImage = "+customerRatingImage+", thumbnailImage = "+thumbnailImage+", giftOptions = "+giftOptions+", productTrackingUrl = "+productTrackingUrl+", msrp = "+msrp+", categoryNode = "+categoryNode+", numReviews = "+numReviews+", mediumImage = "+mediumImage+", name = "+name+", longDescription = "+longDescription+", bundle = "+bundle+", addToCartUrl = "+addToCartUrl+", imageEntities = "+imageEntities+", marketplace = "+marketplace+", customerRating = "+customerRating+", largeImage = "+largeImage+", parentItemId = "+parentItemId+", itemId = "+itemId+", upc = "+upc+", categoryPath = "+categoryPath+", availableOnline = "+availableOnline+", shortDescription = "+shortDescription+", productUrl = "+productUrl+", salePrice = "+salePrice+", modelNumber = "+modelNumber+"]";
    }

}

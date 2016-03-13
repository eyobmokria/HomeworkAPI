/**
 * 
 */
package apps;

/**
 * @author eyob mokria
 *
 */
public class GiftOptions {

	private boolean allowGiftMessage;
	private boolean allowGiftReceipt;
	private boolean allowGiftWrap;

	public boolean isAllowGiftMessage() {
		return allowGiftMessage;
	}

	public void setAllowGiftMessage(boolean allowGiftMessage) {
		this.allowGiftMessage = allowGiftMessage;
	}

	public boolean isAllowGiftReceipt() {
		return allowGiftReceipt;
	}

	public void setAllowGiftReceipt(boolean allowGiftReceipt) {
		this.allowGiftReceipt = allowGiftReceipt;
	}

	public boolean isAllowGiftWrap() {
		return allowGiftWrap;
	}

	public void setAllowGiftWrap(boolean allowGiftWrap) {
		this.allowGiftWrap = allowGiftWrap;
	}

	@Override
	public String toString() {
		return "ClassPojo [allowGiftMessage = " + allowGiftMessage + ", allowGiftReceipt = " + allowGiftReceipt
				+ ", allowGiftWrap = " + allowGiftWrap + "]";
	}

}

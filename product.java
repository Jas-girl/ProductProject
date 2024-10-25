package Project;

public class product {
	int productId;
	String productName;
	float productPrice;
	int productQty;
	String productType;

	public product(int productId, String productName, float productPrice, int productQty, String productType) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productQty = productQty;
		this.productType = productType;
	}

	public String getProductName() {
		return productName;
	}

	public float getProductPrice() {
		return productPrice;
	}

	public String getProductType() {
		return productType;
	}

	public int getProductId() {
		return productId;
	}

	public int getProductQty() {
		return productQty;
	}

	@Override
	public String toString() {
		return "product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", productQty=" + productQty + ", productType=" + productType + "]";
	}

}

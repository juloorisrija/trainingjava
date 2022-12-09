package javainterface;

public class Product {
    private String productName,category;
    private int prodId,price;

    public Product(String productName, String category, int prodId, int price) {
        this.productName = productName;
        this.category = category;
        this.prodId = prodId;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getProdId() {
        return prodId;
    }

    public void setProdId(int prodId) {
        this.prodId = prodId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", category='" + category + '\'' +
                ", prodId=" + prodId +
                ", price=" + price +
                '}';
    }
}

package com.codegym.mysql;

public class Product {
    private int id;
    private String productCode;
    private String productName;
    private float productPrice;
    private int productAmount;
    private String productDescription;
    private boolean productStatus;

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productCode='" + productCode + '\'' +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", productAmount=" + productAmount +
                ", productDescription='" + productDescription + '\'' +
                ", productStatus=" + productStatus +
                '}';
    }

    public String taoGiaTri(int i){
        String result = String.format("INSERT INTO `c3_demoindex`.`products` " +
                "(`id`, `productCode`, `productName`, `productPrice`, `productAmount`, `productDescription`, `productStatus`) " +
                "VALUES ('%d', 'code%d', 'name%d', '%d', '%d', 'des%d', b'%d')", i, i, i, i, i, i, 1);

        return result;

    }
    public Product(int i){
        this.id = i;
        this.productCode = "code" + i;
        this.productName = "name"+i;
        this.productAmount = i;
        this.productPrice = 10 + i;
        this.productDescription = "des" + i;

    }

    public Product(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(float productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductAmount() {
        return productAmount;
    }

    public void setProductAmount(int productAmount) {
        this.productAmount = productAmount;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public boolean isProductStatus() {
        return productStatus;
    }

    public void setProductStatus(boolean productStatus) {
        this.productStatus = productStatus;
    }
}

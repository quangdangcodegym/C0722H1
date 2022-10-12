package models;

import java.time.Instant;

public class Product {
    private long idProduct;
    private String nameProduct;
    private double price;
    private int quantity;
    private Instant createAt;
    private Instant updateAt;

    public Product(long idProduct, String nameProduct, double price, int quantity) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.price = price;
        this.quantity = quantity;
    }

    public Instant getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Instant createAt) {
        this.createAt = createAt;
    }

    public Instant getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Instant updateAt) {
        this.updateAt = updateAt;
    }

    public Product(long idProduct, String nameProduct,
                   double price, int quantity, Instant createAt, Instant updateAt) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.price = price;
        this.quantity = quantity;
        this.createAt = createAt;
        this.updateAt = updateAt;
    }

    //    line là những dòng để ghi file
    public static Product parseProduct(String line) {
//        String[] array = line.split(",");
//
//        Product product = new Product();
//        product.setIdProduct(Long.parseLong(array[0]));
//        product.setNameProduct(array[1]);
//        product.setPrice(Double.parseDouble(array[2]));
//        product.setQuantity(Integer.parseInt(array[3]));
//        return product;

        String[] array = line.split(",");
        String sIdProduct = array[0];
        String nameProduct = array[1];
        String sPrice = array[2];
        String sQuantity = array[3];
        String sCreateAt = array[4];
        String sUpdateAt = array[5];

        long idProduct = Long.parseLong(sIdProduct);
        double price = Double.parseDouble(sPrice);
        int quantity = Integer.parseInt(sQuantity);


        Product product = new Product(idProduct, nameProduct, price, quantity);
        product.setCreateAt(Instant.parse(sCreateAt));
        if(!sUpdateAt.equals("null")){
            product.setUpdateAt(Instant.parse(sUpdateAt));
        }

        return product;

    }

    public Product (){}

    public long getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(long idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s,%s,%s,%s",
                idProduct,
                nameProduct,
                price,
                quantity,
                createAt,
                updateAt);
    }
}

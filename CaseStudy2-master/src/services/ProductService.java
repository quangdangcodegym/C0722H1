package services;

import models.Product;
import utils.CSVUtils;

import java.util.ArrayList;
import java.util.List;

public class ProductService implements IProductService {
    public static final String path = "D:\\CODEGYM\\CODEGYM\\C0722H1\\CaseStudy2-master\\data\\products.csv";

    @Override
    public List<Product> findAllProducts() {
        List<Product> products = new ArrayList<>();
        List<String> records = CSVUtils.read(path);
        for (String record : records) {
            products.add(Product.parseProduct(record));
        }
        return products;
    }

//    Thêm sản phẩm mới
    @Override
    public void addProduct(Product newProduct) {
        List<Product> products = findAllProducts();
        products.add(newProduct);
        CSVUtils.write(path, products);
    }

    @Override
    public void editProduct(long idProduct, Product editProduct) {
        List<Product> products = findAllProducts();

        for(int i=0;i<products.size();i++){
            if(products.get(i).getIdProduct()==idProduct){
                products.get(i).setQuantity(editProduct.getQuantity());
                products.get(i).setPrice(editProduct.getPrice());
                products.get(i).setNameProduct(editProduct.getNameProduct());
            }
        }
        CSVUtils.write(path, products);
    }

    @Override
    public Product getProductById(long idProduct) {
        List<Product> products = findAllProducts();

        for(int i=0;i<products.size();i++){
            if(products.get(i).getIdProduct()==idProduct){
                return products.get(i);
            }
        }
        return null;
    }

//    Sửa thông tin sản phẩm

//   1. Sửa tên sản phẩm theo id
    public  void editNameProductById (long id, String name) {
        List <Product> products = findAllProducts();
        for (int i=0; i<products.size(); i++) {
            if (products.get(i).getIdProduct() == id) {
                products.get(i).setNameProduct(name);
            }
        }
    }


}


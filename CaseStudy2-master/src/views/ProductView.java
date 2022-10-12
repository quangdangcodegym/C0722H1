package views;

import models.EnumProduct;
import models.Product;
import services.ProductService;
import shoeshop.Menu;
import utils.ConvertUtils;
import utils.DateUtils;

import java.time.Instant;
import java.util.List;
import java.util.Scanner;

public class ProductView {
    public List<Product> list;
    static ProductService productService = new ProductService();
    static Scanner input = new Scanner(System.in);

    public static void addProduct() {

        boolean check = false;
        do{
            try{
                System.out.println("⟹⟹⟹⟹ Thêm sản phẩm ⟸⟸⟸⟸");
                long idProduct = System.currentTimeMillis()/1000;
                String name = inputNameProduct(EnumProduct.CREATE);
                double price = inputPriceProduct();

                int quantity = inputQuantityProduct();

                Product product = new Product(idProduct, name, price, quantity);
                product.setCreateAt(Instant.now());
                productService.addProduct(product);
                System.out.println("Đã thêm thành công");


            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập lại.");
            }

        } while (isReTry(EnumProduct.CREATE));

    }

    private static boolean isReTry(EnumProduct eProduct) {
        switch (eProduct){
            case CREATE:
                System.out.println("Bạn có tiếp tuc thêm sản phẩm hay không");
                break;
            case EDIT:
                System.out.println("Bạn có muốn sửa sản phẩm hay không");
                break;
        }
        do{
            System.out.println("Nhập 'c' để tiếp tục, nhập 'e' để thoát");
            String action = input.nextLine();
            if(action.equals("c")){
                return true;
            } else{
                if(action.equals("e")){
                    return false;
                }
            }
        }while (true);
    }

    public static void editProduct(){
        showProductList();
        boolean check = false;
        do{
            try{
                System.out.println("⟹⟹⟹⟹ Sửa sản phẩm ⟸⟸⟸⟸");
                System.out.println("Nhập ID cần sửa");
                //
                long idProduct = inputIDProduct();


                String name = inputNameProduct(EnumProduct.EDIT);
                double price = inputPriceProduct();
                int quantity = inputQuantityProduct();

                Product productEdited = new Product();
                productEdited.setIdProduct(idProduct);
                productEdited.setNameProduct(name);
                productEdited.setPrice(price);
                productEdited.setQuantity(quantity);

                productService.editProduct(idProduct, productEdited);
                System.out.println("Sửa thành công");
                showProductList();
                launch();

            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập lại.");
            }

        } while (isReTry(EnumProduct.EDIT));
    }

    private static long inputIDProduct() {
        System.out.println("Nhập ID sản phẩm cần sửa:");
        System.out.print("⟹");
        long idProduct = -1;
        boolean flag = true;
        do {
            try{
                idProduct = Long.parseLong(input.nextLine());
                Product product = productService.getProductById(idProduct);
                if(product==null){
                    System.out.println("ID sản phẩm không tồn tại. Vui lòng nhập lại");
                    flag = false;
                }else {
                    flag = true;
                }

            }catch (NumberFormatException ex){
                System.out.println("ID sản phẩm không đúng định dạng");
                flag = false;
            }
        } while (flag==false);
        return idProduct;
    }

    private static int inputQuantityProduct() {
        System.out.println("Nhập số lượng sản phẩm:");
        System.out.print("⟹");
        int quantity = -1;
        boolean flag = true;
        do {
            try{
                quantity = Integer.parseInt(input.nextLine());
                if (quantity<0) {
                    System.out.println("Số lượng không được nhỏ hơn 0.");
                    System.out.print("⟹ ");
                    flag = false;
                }else {
                    flag = true;
                }
            }catch (NumberFormatException ex){
                System.out.println("Số lượng không hợp lệ");
                flag=false;
            }
        } while (flag==false);
        return quantity;
    }

    private static double inputPriceProduct() {
        System.out.println("Nhập giá sản phẩm:");
        System.out.print("⟹");
        double price = 0;
        boolean flag = true;
        do {
            try{
                price = Double.parseDouble(input.nextLine());
                if (!(price > 1000)) {
                    System.out.println("Giá tiền không được nhỏ hơn 1000");
                    System.out.print("⟹ ");
                    flag = false;
                }else {
                    flag = true;
                }
            }catch (NumberFormatException ex){
                System.out.println("Giá không hợp lệ vui lòng nhập lại");
                flag = false;
            }

        } while (flag==false);

        return price;
    }

    private static String inputNameProduct(EnumProduct eProduct) {
        switch (eProduct){
            case CREATE: {
                System.out.println("Nhập tên sản phẩm:");
                System.out.print("⟹");
                break;
            }
            case EDIT:{
                System.out.println("Nhập tên sản phẩm muốn sửa:");
                System.out.print("⟹");
                break;
            }
        }

        String name;

        do {
            name = input.nextLine().trim();
            if (name.equals("") ||name.equals(null)) {
                System.out.println("Vui lòng nhập lại tên sản phẩm");
                System.out.print("⟹");
            }
        } while (name.equals("") ||name.equals(null));
        return name;
    }

    public static void showProductListShow(){
        showProductList();
        int choose;
        do {
            System.out.println("Nhấn 0 để quay lại màn hình chính");
            System.out.print("⟹");
            choose = ConvertUtils.convertParseInt();
        } while (choose != 0);
    }

//    Hiển thị sản phẩm:
    public static void showProductList() {
        System.out.println("⟹⟹⟹⟹⟹⟹⟹⟹ Danh sách sản phẩm ⟸⟸⟸⟸⟸⟸⟸⟸");
        System.out.printf("%-25s %-20s %-20s %-20s %-20s %-20s\n", "ID", "Tên Sản Phẩm", "Giá", "Số lượng sản phẩm", "Ngày tạo", "Ngày cập nhật");
        for (Product product : productService.findAllProducts()) {
            System.out.printf("%-25s %-20s %-20s %-20s %-20s %-20s\n",
                    product.getIdProduct(),
                    product.getNameProduct(),
                    product.getPrice(),
                    product.getQuantity(),
                    DateUtils.convertInstantToStringFormat(product.getCreateAt()),
                    DateUtils.convertInstantToStringFormat(product.getUpdateAt()));
        }
    }

    public static void  launch(){
        boolean check = false;
        String choose;

        do {
            showMenuProduct();
            choose = input.nextLine();
            switch (choose) {
                case "1":
                    ProductView.addProduct();
                    break;
                case "2":
                    ProductView.editProduct();
                default:
                    System.out.println("Lựa chọn không đúng vui lòng nhập lại");
                    System.out.print("⟹");
                    check = false;
            }

        } while (!check);
    }

    private static void showMenuProduct() {
        System.out.println("⟹⟹⟹⟹⟹⟹⟹⟹⟹⟹⟹Menu⟸⟸⟸⟸⟸⟸⟸⟸⟸");
        System.out.println("⟹   1. Thêm sản phẩm                 ⟸");
        System.out.println("⟹   2. Sửa thông tin sản phẩm        ⟸");
        System.out.println("⟹   3. Xóa sản phẩm                  ⟸");
        System.out.println("⟹   4. Hiển thị danh sách sản phẩm   ⟸");
        System.out.println("⟹   5. Tìm kiếm sản phẩm             ⟸");
        System.out.println("⟹   6. Sắp xếp sản phẩm              ⟸");
        System.out.println("⟹   0. Quay lại menu Admin           ⟸");
        System.out.println("⟹⟹⟹⟹⟹⟹⟹⟹⟹⟹⟹⟹⟸⟸⟸⟸⟸⟸⟸⟸⟸⟸⟸");
        System.out.println("Vui lòng chọn chức năng:");
        System.out.print("=>");
    }


}

import model.Order;
import model.Product;
import views.*;

import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
//        MainLauncher.lauch();
        ProductView productView = new ProductView();
        productView.launch();
    }
}

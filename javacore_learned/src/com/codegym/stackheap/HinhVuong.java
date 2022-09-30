package com.codegym.stackheap;

public class HinhVuong {
    public HinhVuong(String name){
        this.name = name;
    }
    HinhVuong(){}

    String name;        // bien instance

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "HinhVuong{" +
                "name='" + name + '\'' +
                '}' +
                getClass().getName() + "@" + Integer.toHexString(hashCode());
    }

    public void chuVi() {
        System.out.println("chu vi");
    }

//    @Override
//    public String toString() {
//        return super.toString();
//    }


    public static void xinChaoHinhVuong(HinhVuong hinhVuong) {
        String s = "xin chao";
        String s1 = s;
        System.out.println(s);
        hinhVuong.chuVi();
    }

    public static void changeValue(HinhVuong hv, int value){
        hv.setName("Quang");
    }
    public static void main(String[] args) {
        int a = 5;
        HinhVuong hv = new HinhVuong("thien");
        HinhVuong hv1 = hv;


        changeValue(hv1, a);
        System.out.println(hv);
        System.out.println(hv1);


        int b = a;

//        int x = 10;
//        System.out.println(x);
//        // hinhVuong: biên tham chiếu
//        // Class HinhVuong: kiểu dữ liệu hình vuông
//
//        HinhVuong hinhVuong = new HinhVuong();
//
//        System.out.println(hinhVuong);
//        HinhVuong hinhVuong1 = hinhVuong;
//        System.out.println(hinhVuong1);
//
//
//
//        xinChaoHinhVuong(hinhVuong);
    }
}

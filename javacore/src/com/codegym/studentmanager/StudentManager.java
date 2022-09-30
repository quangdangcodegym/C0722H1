package com.codegym.studentmanager;

public class StudentManager {
    public static void main(String[] args) {
        Student s1 = new Student("Hoan", 20, "28 Điện Biên Phủ",9.0f, "Quốc Học");
        Student s2 = new Student("Luyn", 40, "29 Điện Biên Phủ",7.0f, "Quốc Học");
        Student s3 = new Student("Dung", 10, "28 Điện Biên Phủ",5.0f, "HBT");
        Student s4 = new Student("Cuong", 27, "58 Điện Biên Phủ",10.0f, "Quốc Học");
        Student s5 = new Student("Loi", 20, "98 Điện Biên Phủ",8.0f, "Nguyễn Huệ");

        //Student[] students = new Student[5];
        // Khởi tạo mảng như thế này sai
//        for(int i=0;i<students.length;i++){
//            students[i] = s[i];
//        }
        // Khởi tạo mảng 5 phần tử
//        students[0] = s1;
//        students[1] = s2;
//        students[2] = s3;
//        students[3] = s4;
//        students[4] = s5;
        Student[] students = {s1, s2, s3, s4, s5};
        Student s = searchStudentByPoint(10f, students);
        System.out.println(s.showInfo());

    }
    public static int searchStudentIndexByPoint(float point, Student[] students){
        for(int i=0;i<students.length;i++){
            if(students[i].getPoint() == point){
                return i;
            }
        }
        return -1;
    }
    public static Student searchStudentByPoint(float point, Student[] students){
        // foreach(Element e: list)
        int i = 0;
        for(Student item : students){
            if (item.getPoint() == point) {
                System.out.println("Index:  " + i);
                return item;
            }
            i++;
        }
        return null;
    }

}

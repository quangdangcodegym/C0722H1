package com.codegym.collection;

public class Person implements Comparable<Person>{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        if(this.name.compareToIgnoreCase(o.getName())>0){
            return 1;
        }else{
            if(this.name.compareToIgnoreCase(o.getName())<0)
            {
                return -1;
            }else {
                // 2 thang co trung ten thi xet theo tuoi
                if(this.age > o.getAge()){
                    return 1;
                }else {
                    if(this.age <o.getAge()){
                        return -1;
                    }
                }
            }
        }
        return 0;
    }

    public String toString(){
        return String.format("{%s, %d}", this.name, this.age);
    }
}

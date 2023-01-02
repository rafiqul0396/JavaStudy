package com.company.constructorStudy;

public class Students {
    private  String name;
    private  int age;
    private  String address;
    public static int count=0;

    public  Students(String name,int age,String address){
        this.name=name;
        this.age=age;
        this.address=address;
        count++;


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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public  static  int getCount(){
        return count;
    }


    public static void main(String[] args) {
        Students s=new Students("rafik",23,"delhi");
        System.out.println(s.name);
    }

}

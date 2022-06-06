package com.company.constructorStudy;

class Parent {
 protected String name;
 private int age;
 public Parent(String tName, int tAge) {
 name = tName;
 age = tAge;
 }
}
class Child extends Parent {
 public Child() {
 super("John", 42); // explicit super-call
 }
 public static void main(String[]args ){
  Child child = new Child();
  String name1 = child.name;
  System.out.printf("name:->"+name1);


 }
}

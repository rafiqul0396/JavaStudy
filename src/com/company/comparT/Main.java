package com.company.comparT;



class HDTV implements Comparable<HDTV>{
    private int size;
    private String brand;

    public HDTV(int size, String brand) {
        this.size = size;
        this.brand = brand;
    }

    public int getSize() {
        return size;
    }

    public String getBrand() {
        return brand;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public int compareTo(HDTV tv) {
        if(this.getSize()>tv.getSize()){
            return 1;
        }
        else if(this.getSize()<tv.getSize()){
            return -1;
        }
        else {
            return 0;
        }
    }
}
public class Main {
    public static void main(String[] args) {
         HDTV tv1= new HDTV(55,"sumsung");
         HDTV tv2= new HDTV(60,"sony");
         if(tv1.compareTo(tv2)>0){
             System.out.println(tv1.getBrand()+" "+" is Better ");

         }
         else{
             System.out.println(tv2.getBrand()+" is better");
         }
    }
}

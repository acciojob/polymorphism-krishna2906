package com.driver;

public class Main {
    public static void main(String[] args) {
        Product p = new Product();

        int ans = p.product(10,15);
        int ans_1 = p.product(5,10,20);
        double ans_2 = p.product(10.50,5.50);
        System.out.println(ans+" "+ans_1+" "+ans_2);

    }
    public static class Product{
        public int product(int x, int y){
            return x*y;
        }
        public int product(int x, int y, int z) {
            return x*y*z;

        }
        public double product(double x, double y) {
            return x*y;
        }


    }

}
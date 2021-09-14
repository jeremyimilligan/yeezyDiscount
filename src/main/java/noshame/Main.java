package noshame;

import java.util.Arrays;

public class Main {

//    public static void calculateArea (int length, int width) {
//
////        length * width;
//        //String area = "A= W * L =" + length + " * " + width + " = " + length * width;
//        System.out.println(length * width);
//        System.out.println("A= W * L =" + length + " * " + width + " = " + length * width);

//        return area;

//    }

//    public static void main(String[] args) {
//
//        calculateArea(2,10);

//
//    }

//    public static int[] returnArray (int num1, int num2) {
//
//        int [] container = {num1, num2};
//
//        return container;
//    }
//
//    public static void main(String[] args) {
//
//        int num1 = 69;
//        int num2 = 420;
//
//        System.out.println(Arrays.toString(returnArray(num1,num2)));
//    }

    //?
    //create method that creates price of the product
    //create discount
    //return final price after discount
    //?

    public static double calculateDiscount (double price , double discount){
       double discountAmount = discount/100;
       double discountPrice = price * discountAmount;
       double finalPrice = price - discountPrice;
        return finalPrice;

    }
    public static void main(String[] args) {


        System.out.println(calculateDiscount(500.00,10.0));

    }
}

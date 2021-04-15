package ca.concordia.id40181099.helloworldapp;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class exercise6 {

    public static void main(String[] args) {
        /*Given a price, write a program to calculate the the QST (10%), GST (5%), and the total price.
        Print the original and total prices in French Canadian format, and the taxes in percentage.
         */
        //variables
        double originalPrice = 11.57;
        final double QST = 0.1;
        final double GST = 0.05;
        double price = originalPrice;
        double qstP = originalPrice * QST;
        double gstP = originalPrice * GST;
        double totalPrice = originalPrice + gstP + qstP;

        //Formatting process
        NumberFormat originalPriceF = NumberFormat.getCurrencyInstance(new Locale("fr", "ca"));
        String originalPriceFormatted = originalPriceF.format(originalPrice);
        NumberFormat qstF = NumberFormat.getCurrencyInstance(new Locale("fr", "ca"));
        String qstFormatted = qstF.format(qstP);
        NumberFormat gstF = NumberFormat.getCurrencyInstance(new Locale("fr", "ca"));
        String gstFormatted = gstF.format(gstP);
        NumberFormat totalF = NumberFormat.getCurrencyInstance(new Locale("fr", "ca"));
        String totalFormatted = totalF.format(totalPrice);

        //Doing the math
        String result = "Price:" + originalPriceFormatted  + "\n" + "QST(10%):"+ qstFormatted + "\n" + "GST(5%):"+ gstFormatted+ "\n" +"Total:"+ totalFormatted;

        //Printing
        System.out.println(result);
















    }


}

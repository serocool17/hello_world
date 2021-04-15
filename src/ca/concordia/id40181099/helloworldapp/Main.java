
package ca.concordia.id40181099.helloworldapp;

import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Locale;

public class Main {


    private static Object LocalTime;

    public static void main(String[] args) {
	// My first project

        // String functions

        String Bank = ("TD Canada");
        String welcome = ("Hello");
        String First = ("Richardson");
        String Last = ("Ceballo");
        String Balance = ("Your account balance is:");
        String transactionDate = ("Transaction Date:");


        //Integer values and declarations
        int age = 25;
        int Account = 1457;
        int payment = 2000;

        //Arithmetic Expressions
        int total = (Account - payment);

        //formatting numbers
        NumberFormat accountFormatted = NumberFormat.getCurrencyInstance(Locale.CANADA_FRENCH);
        NumberFormat paymentFormatted = NumberFormat.getCurrencyInstance();
        NumberFormat totalFormatted = NumberFormat.getCurrencyInstance();
        String accountresult = accountFormatted.format(Account);
        String paymentresult = paymentFormatted.format(payment);
        String totalresult = totalFormatted.format(total);

        //Local date and time with format

        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter date1 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = date.format(date1);


        int currentYear = 2021;
        int birthYear = 1972;
        int totalYears = currentYear - birthYear;
        int month = totalYears * 12;
        int days = month * 365;


        // user info to print
        String userInfo = Bank +" "+ transactionDate+": "+ formattedDate+"\n "+   welcome + " "+  First+ " " + Last + "\n "+ Balance;
        System.out.println(Bank);




        String first = "ABC";
        String second = "ABC";

        //second = "DEF";

        //System.out.println(first == second);


        //Decimals for money

        // operations
        double d = 95.0;
        int i= 86, j = 91;
        double average = (d+i+(double)j)/3;

        System.out.println(average);

//        // integer division
//        double a = 5.0;
//        int b = 2;
//       //double c= (double) (a/b);
//        System.out.println(c);

        //Three static methods of the NumberFormatclass

        //getCurrencyInstance()
        double price = 35.897;
        //create an object with proper formatting
        NumberFormat currency = NumberFormat.getCurrencyInstance();

        NumberFormat currency5 = NumberFormat.getCurrencyInstance(new Locale("fr", "ca"));
        String total3 = currency5.format(price);

        System.out.println(total3);

        int gradeb = (int)77.9;
        System.out.println(gradeb);

        //getPercentInstance()


        // exercise 5
        //(20°C × 9/5) + 32 = 68°F

        //float celcius3 = 0;
//        float f;
//        f = (0 * 9f/5f) + 32;
//        System.out.println(f);
//
//        f = (15 * 9f/5f) + 32;
//        System.out.println(f);
//
//        f = (10 * 9f/5f) + 32;
//        System.out.println(f);
//
//
//        //(20°F − 32) × 5/9 = -6.667°C
//         float fahrenheit4 = 68;
//         float celcius5;
//        celcius5 = (68 - 32) * 5f/9f;
//        System.out.println(celcius5);
//
//        celcius5 = (86 - 32) * 5f/9f;
//        System.out.println(celcius5);
//
//        celcius5 = (104 - 32) * 5f/9f;
//        System.out.println(celcius5);




        //float fahrenheit = 9/5 * 0 + 32;
        //System.out.println(fahrenheit);

       //float celcius = 68 * 9f/5f+32;
       //System.out.println(celcius);

        //float fahrenheit2 = 9/5 * 0+ 32;
        //System.out.println(fahrenheit2);




        //getNumberInstance()

        //class name
        // pascal-case
        // Class name example -> Student
        // example -> GraduateStudent

        //trying arrays class

        //int[] numbers = {3 ,2 ,1};
        //Arrays.sort(numbers);
        //String result = Arrays.toString(numbers);

        //Elements to be print



        System.out.println(userInfo);
        System.out.println(accountresult + " " + paymentresult + " " + totalresult);
        //System.out.println(result);













    }


}

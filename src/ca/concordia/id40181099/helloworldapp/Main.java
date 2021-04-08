
package ca.concordia.id40181099.helloworldapp;

import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

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
        NumberFormat accountFormatted = NumberFormat.getCurrencyInstance();
        NumberFormat paymentFormatted = NumberFormat.getCurrencyInstance();
        NumberFormat totalFormatted = NumberFormat.getCurrencyInstance();
        String accountresult = accountFormatted.format(Account);
        String paymentresult = paymentFormatted.format(payment);
        String totalresult = totalFormatted.format(total);

        //Local date and time with format

        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter date1 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = date.format(date1);

        //trying arrays class

        int[] numbers = {3 ,2 ,1};
        Arrays.sort(numbers);
        String result = Arrays.toString(numbers);

        //Elements to be print

        System.out.println(Bank);
        System.out.println(transactionDate + " " + formattedDate);
        System.out.println(welcome + " " + First + " " + Last + " " + Balance);
        System.out.println(accountresult + " " + paymentresult + " " + totalresult);
        System.out.println(result);













    }


}

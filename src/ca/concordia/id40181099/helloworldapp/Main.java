
package ca.concordia.id40181099.helloworldapp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

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
        int total = (Account - payment);

        //Local date and time with format

        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter date1 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = date.format(date1);


        //Elements to be print

        System.out.println(Bank);
        System.out.println(transactionDate + " " + formattedDate);
        System.out.println(welcome + " " + First + " " + Last + " " + Balance);
        System.out.println(Account + " " + "$" + payment + " " + "$"+ total);








    }


}

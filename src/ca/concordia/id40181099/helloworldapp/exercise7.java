package ca.concordia.id40181099.helloworldapp;

public class exercise7 {
    public static void main(String[] args) {
        //Declare two integer variables called "first" and "second".
        //Assign two values to them. (e.g 14 and 4)
        //Print out the followings by using the two variables, first and second:
        //14 + 4 is 18
        //14 * 4 is 56
        //14 % 4 is 2
        //14 / 4 is 3

        //variables
        int first = 14;
        int second = 4;

        //doing math
        int result1 = first+second;
        int result2 = first*second;
        int result3 = first%second;
        int result4 = first/second;

        //printing
        System.out.println(first + " + "+ second + " is "+ result1+ "\n"+ first + " * "+ second + " is "+ result2+
                "\n"+ first + " % "+ second + " is "+ result3+ "\n"+ first + " / "+ second + " is "+ result4);
    }
}

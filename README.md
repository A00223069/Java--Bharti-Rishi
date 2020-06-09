 /* Lab 1 - Intro to Java
Write a program to determine a salesperson’s commission in a week.

With an If-Else-If statement print the amount of commission and final value (eg 5% of $1000 will give $50)

    If the sales are outside the range $0-$5000 error and exit with message “Sales don’t add up”

    If the sales are less than $1000 print “Commission is 5%”

    If the sales are greater than or equal to $1000 print “Commission is 10%”

    If the sales are greater than or equal to $4000 print “Commission is 15%” */

import java.util.Scanner;
public class Sales{
    public static void main(String[] args) {
        Boolean flag=true;
        double CommissionRate=-1;
        double TotalSales, Commission;
        Scanner Read = new Scanner (System.in);
        System.out.print("Please enter total sales :");
        TotalSales=Read.nextDouble();

        if(TotalSales>5000 || TotalSales<0)
        {
            flag=false;

        }
        else if (TotalSales<1000)
            CommissionRate=0.05;
        else if (TotalSales>=1000 && TotalSales <4000)
            CommissionRate=0.10;
        else
            CommissionRate=0.15;

        if(flag)
        {
            Commission = CommissionRate * TotalSales;
            System.out.println("Commission recieved is "+ CommissionRate*100+ "%");
            System.out.println("The Commision is: "+ Commission);

        }
        else
        {
            System.out.println("Sales don't add up!!!");
        }

    }
}

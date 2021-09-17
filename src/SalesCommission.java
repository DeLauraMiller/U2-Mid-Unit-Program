/*
A car salesperson typically earns an hourly wage and a commission on any sales they completed. They typically work 30 to 40
hours a week, earning $5.25 to $7.50 an hour. Additionally, they earn 1% to 3% of all sales they've completed that week,
which a typical car sells for $10,000 to $30,000. A salesperson with a 1% commission that sells a car for $20,000 earns $200.00.

Write a program which prompts the user to enter the hourly rate, hours worked, the sales commission percent and the total
sales of a salesperson and calculates their total earnings. The program should include multiple methods. (What ARE the
smaller pieces?)

Example:

Hourly Rate: 6.25
Hours Worked: 33.5
Sales Commission: 1.5%
Total Sales: $65,000.00

Total Earnings: $1184.38

1.Get hourly rate. Get hours.
2. Calculate weekly pay and
 commission
3. Total pay
4. output
 */
import javax.swing.*;
import java.text.DecimalFormat;

public class SalesCommission {

    public static void main(String[] args) {
       double rate = getInput(" What is your hourly rate?");
       double hours = getInput("How many hours did you work?");
       double comm = getInput("What is your sales commission rate?");
       double sales = getInput("How much did you earn through sales?");

       double hourlyPay = hourlyPay(rate, hours);
       double commissions = commissions(comm, sales);
       double totalPay = totalPay( hourlyPay, commissions) ;

       output(totalPay);

    }

    public static double getInput(String prompt) {
        return Double.parseDouble(JOptionPane.showInputDialog(prompt));
    }

    public static double hourlyPay(double rate, double hours){
       return  rate * hours ;
    }

    public static double commissions(double comm, double sales){
        return sales * (comm/100.0);
    }

    public static double totalPay(double hourlyPay, double commissions){
        return hourlyPay + commissions;
    }

    public static void output(double totalPay){
        DecimalFormat round = new DecimalFormat("#.00");
        JOptionPane.showMessageDialog(null, "Your total earnings are " + round.format(totalPay));

    }



}

import javax.swing.*;
import java.text.DecimalFormat;

public class Sales {


    /*Write a program, using dialog boxes, which prompts the user to enter a quantity, price, discount(as an integer) and sales tax(as an integer).
        The program should output the subtotal, tax total and total cost. Output should have proper currency format and proper rounding.

        Hint: You can use \n inside a String literal to make a new line, helpful for the dialog box output.

        Example:

        What is the sale price?: 4.99
        What is the discount?: 10
        How many are you buying?: 5
        What is the sales tax?: 7

        Subtotal: $22.46
        Tax Total: $1.57
        Total Cost: $24.03
         */
    public static void main(String[] args) {


        double price;
        double discount = 0;
        double buying;
        double totalCost;
        double subTotal = 0;
        double tax = 0;
        double taxOne;


        //price

        price = Double.parseDouble(JOptionPane.showInputDialog("what is the price of the item"));
        discount = Double.parseDouble(JOptionPane.showInputDialog("What is the discount? "));
        double TAX;
        taxOne = Double.parseDouble(JOptionPane.showInputDialog("what is the tax ? "));
        buying = Double.parseDouble(JOptionPane.showInputDialog("how many items are you buying?"));

        TAX = 0.07;
        subTotal = price * buying;
        TAX = subTotal * TAX;
        double rouned;
        rouned = Math.round(TAX * 100)/100;


        double discountOne = discount / 100 * subTotal;
        double discountTwo = subTotal - discountOne;
        double allTogether = discountTwo + TAX;

        JOptionPane.showMessageDialog(null, "subtotal without tax: " + subTotal + "Tax rate is: " + rouned + " Total With discount applied: " + discountTwo + " with taxes and discount: " + allTogether);




    }
}

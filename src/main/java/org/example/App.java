package org.example;

import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the order amount? ");
        String mon = sc.nextLine();
        double money = Double.parseDouble(mon);
        System.out.print("What is the state? ");
        String state = sc.nextLine();
        DecimalFormat df = new DecimalFormat("#.00");

        double tax = 0;
        if (state.equals("WI") || state.equals("wi")){
            System.out.println("The subtotal is $" + df.format(money) + ".");
            tax = money * .055;
            System.out.println("The tax is $" + df.format(tax) + ".");
        }
        double total = tax + money;
        System.out.println("The total is $" + df.format(total) + ".");

    }
}

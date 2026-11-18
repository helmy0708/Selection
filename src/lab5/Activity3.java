/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

import java.util.Scanner;

public class Activity3 {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        System.out.print("Account number : ");
        if (!input.hasNextInt()){
            System.out.println("Error : Invalid account number.");
            return;
        }
        int accountNumber = input.nextInt();
        System.out.print("Account type (S/C) : ");
        char type = Character.toUpperCase(input.next().charAt(0));
        System.out.print("Minimum balance (RM) : ");
        if (!input.hasNextDouble()){
            System.out.println("Error : Invalid minimum balance.");
            return;
        }
        double minimumBalance = input.nextDouble();
        System.out.print("Current balance (RM) : ");
        if (!input.hasNextDouble()){
            System.out.println("Error : Invalid current balance. ");
            return;
        }
        double currentBalance = input.nextDouble();
        if (type != 'S' && type != 'C'){
            System.out.println("Error : Account type must be S or C. ");
            return;
        }
        if (minimumBalance < 0 || currentBalance < 0){
            System.out.println("Error : Balance cannot be negative. ");
            return;
        }
        double newBalance;
        if (currentBalance < minimumBalance){
            if (type == 'S'){
                newBalance = currentBalance - 10.00;
            }
            else {
                newBalance = currentBalance - 25.00;
            }
        }
        else{
            if (type == 'S'){
                newBalance = currentBalance * 1.04;
            }
            else{
                if (currentBalance <= minimumBalance + 5000){
                    newBalance = currentBalance * 1.03;
                }
                else {
                    newBalance = currentBalance * 1.05;
                }
            }
        }
        System.out.println("Account Number : "+accountNumber);
        System.out.println("Account Type : "+(type == 'S' ? "Savings" : "Checking"));
        System.out.printf("Current Balance : RM %.2f\n",currentBalance);
        System.out.printf("New Balance : RM %.2f\n", newBalance);
    }
}


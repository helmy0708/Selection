/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

import java.util.Scanner;

public class Activity5 {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        System.out.print("Enter name : ");
        String name = input.nextLine();
        System.out.print("Wood type (oak/mahogany/other) : ");
        String wood = input.nextLine().trim().toLowerCase();
        System.out.print("Number of characters : ");
        if (!input.hasNextInt()){
            System.out.println("Error : Enter a whole number.");
            return;
        }
        int characters = input.nextInt();
        input.nextLine();
        System.out.print("Enter colour (gold/black/white) : ");
        String colour = input.nextLine().trim().toLowerCase();
        if (characters < 0){
            System.out.println("Error : Character count cannot be negative.");
            return;
        }
        double price = 30.00;
        switch (wood){
            case "oak" : price += 15.00;
            break;
            case "mahogany" : price += 10.00;
            break;
            case "other":
            break;
            default : System.out.println("Error : Invalid wood type.");
            return;
        }
        if (characters > 6){
            price += (characters - 6) * 3.00;
        }
        switch (colour){
            case "gold" : price += 12.00;
            break;
            case "black" :
            case "white" : 
            break;
            default : System.out.println("Error : Invalid lettering colour.");
            return;
        }
        System.out.println("\n---HOUSE SIGN ORDER---");
        System.out.println("Customer : "+name);
        System.out.println("Wood : "+wood);
        System.out.println("Characters : "+characters);
        System.out.println("Letter Colour : "+colour);
        System.out.println("Price : RM "+price);
    }
}


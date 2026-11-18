/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

import java.util.Scanner;
public class Activity2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter sales amount : RM ");
        if (!input.hasNextDouble()){
        System.out.print("Error : Enter a numeric sales amount.");
        return;
    }
    double sales = input.nextDouble();
    
    if (sales < 0){
    System.out.println("Error : Sales cannot be negative.");
    return;
}
    double rate;
    if (sales <= 1000){
    rate = 0.01;
}
    else if (sales <= 15000){
    rate = 0.15;;
}
    else{
    rate = 0.20;
}
    double commission = sales*rate;
    System.out.printf("Sales : RM %.2f\n",sales);
    System.out.printf("Commission rate : %.2f\n",rate * 100);
    System.out.printf("Commision : RM %.2f\n",commission);
    
    }
}

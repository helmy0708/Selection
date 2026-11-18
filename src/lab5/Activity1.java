/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.Period;
import java.time.DateTimeException;
import java.time.Month;

public class Activity1 {
    public static void main (String[] args){
        String ic = JOptionPane.showInputDialog(null,"Enter 12-digit IC number : ");
        if (ic==null)return;
        ic = ic.trim();
        if (!ic.matches("\\d(12)")){
            
            JOptionPane.showMessageDialog(null,"Error : IC must contain exactly 12 digits.");
            return;
        }
        int yy = Integer.parseInt(ic.substring(0,2));
        int month = Integer.parseInt(ic.substring(2,4));
        int day = Integer.parseInt(ic.substring(4,6));
        int year;
        
        if (yy <= 16){
            year = 2000+yy;
        }
        else if (yy >= 20){
            year = 1900 + yy;
        }
        else{
            JOptionPane.showMessageDialog(null,"Year 17-19 is outside the module's stated ranges.");
            return;
        }
        try{
            LocalDate birthday = LocalDate.of(year,month,day);
            LocalDate today = LocalDate.now();
            if (birthday.isAfter(today)){
                JOptionPane.showMessageDialog(null,"Error : Birth date cannot be in the future.");
                return;
            }
            int age = Period.between(birthday,today).getYears();
            String dateText = String.format("%02d-%02d-%04d",day,month,year);
            JOptionPane.showMessageDialog(null,"Birth Date : "+dateText+"\nAge : "+age+"years");
        }
        
        catch (DateTimeException ex){
            JOptionPane.showMessageDialog(null, "Error : Invalid date IC number.");
        }
            }
        }
    


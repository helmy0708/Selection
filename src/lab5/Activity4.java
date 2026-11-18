/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.DateTimeException;
import java.time.Month;

public class Activity4 {
    public static void main (String[] args){
        String date = JOptionPane.showInputDialog(null,"Enter date (DD-MM-YYYY or DD/MM/YYYY) :");
        if (date == null)
            return;
        date = date.trim();
        if (!date.matches("\\d{2}[-/]\\d{2}[-/]\\d{4}")){
            JOptionPane.showMessageDialog(null, "Error : Use DD-MM-YYYY or DD/MM/YYYY.");
            return;
        }
        String[] parts = date.split("[-/]");
        int q = Integer.parseInt(parts[0]);
        int m = Integer.parseInt(parts[1]);
        int y = Integer.parseInt(parts[2]);
        
        try{
            LocalDate.of(y, m, q);
        }
        catch (DateTimeException ex){
            JOptionPane.showMessageDialog(null,"Error : Invalid calendar date.");
            return;
        }
        if (m == 1 || m == 2){
            m += 12;
            y -= 1;
        }
        int h =(q + (13 * (m+1)) / 5 + y + y / 4 - y / 100 + y / 400)%7;
        String dayName;
        switch (h){
            case 0 : dayName = "Saturday";
            break;
            case 1 : dayName = "Sunday";
            break;
            case 2 : dayName = "Monday";
            break;
            case 3 : dayName = "Tuesday";
            break;
            case 4 : dayName = "Wednesday";
            break;
            case 5 : dayName = "Thursday";
            break;
            case 6 : dayName = "Friday";
            break;
            default : dayName = "Unknown";
        }
        JOptionPane.showMessageDialog(null, "Date : "+date+"\nDay : "+dayName);
        
    }
        
}


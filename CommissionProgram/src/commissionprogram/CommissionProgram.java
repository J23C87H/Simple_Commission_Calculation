
package commissionprogram;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Jack Jack
 */
public class CommissionProgram {
    
// breakline to enable blank lines in output
    public static String breakline = System.getProperty("line.separator");
    
    
    public static void main(String[] args) {
        
        // Created input from scanner
        Scanner input = new Scanner( System.in );
        
        // Created an Array based on the employee Class named emp
        Employee[] emp = new Employee[2];
        
        // Created commissionObject to communicate with Commission class
        Commission commissionObject = new Commission();
        
        // fmt currency formatting
        DecimalFormat fmt = new DecimalFormat("###,###,##0.00");
        
        // declare variables
        double salesAmount;
        String name;
        double difference;
        
        // Welcome user and explain program
        System.out.println("Welcome to the Simple Commission Calculation Program!");

        System.out.println(breakline);
        
        // Employee 1 section starts
        // prompt for name of employee 1 and setName of emp array 0
        System.out.print("Please enter the first employees name: ");
        name = input.next();
        emp[0] = new Employee();
        emp[0].setName(name);
        
        
        // Ask user to enter employee 1's annual sales numbers
        System.out.print("Please enter " + emp[0].getName() +"'s annual sales amount:");
        salesAmount = input.nextDouble();
        
        // Sending salesAmount to setRate & calculateCompensation in Commission class
        commissionObject.setRate( salesAmount );
        commissionObject.calculateCompensation( salesAmount);
        
        // setAnnualSales and setTotalCompensation in emp array 0 to salesAmount and getPay
        emp[0].setAnnualSales(salesAmount);
        emp[0].setTotalCompensation(commissionObject.getPay());
        
        // Printing total compensation for employee 1 and a blank line
        System.out.println("The total annual compensation for this employee is $" + fmt.format(emp[0].getTotalCompensation()));
        System.out.println(breakline);
        
        System.out.println("Potential sales and earnings for " + emp[0].getName());
        
        // Creating potentialSales variable to stop loop at 50% above annual sales
        double potentialSales = .50 * salesAmount + salesAmount;

            // Print out table headers, borders, and first line of table
            System.out.print("Total Sales  |   ");
            System.out.println("Total Compensation");
            System.out.println("===================================");
            System.out.print("$" + fmt.format(salesAmount));
            System.out.println("         $" + fmt.format(commissionObject.getPay()));
            System.out.println("-----------------------------------");
            
        // While loop to print potential sales & earnings in $5000 increments
        while (potentialSales > salesAmount ){
            
            // establish new amount and print
            salesAmount = salesAmount + 5000;
            System.out.print("$" + fmt.format(salesAmount));
            
            // Sending new amount to setRate & calculateCompensation in Commission class
            commissionObject.setRate( salesAmount );
            commissionObject.calculateCompensation( salesAmount ); 
            
            // return and print results and border
            System.out.println("         $" + fmt.format(commissionObject.getPay()));
            System.out.println("-----------------------------------");
        }
        System.out.println(breakline);        
        
        
        
        
        
        
        // Employee 2 section starts
        // prompt for name of employee 2 and setName of emp array 1
        System.out.print("Please enter the second employees name: ");
        name = input.next();
        emp[1] = new Employee();
        emp[1].setName(name);
        
        // Ask user to enter employees 2's annual sales numbers
        System.out.print("Please enter " + emp[1].getName() +"'s annual sales amount:");
        salesAmount = input.nextDouble();
        
        // Sending salesAmount to setRate & calculateCompensation in Commission class
        commissionObject.setRate( salesAmount );
        commissionObject.calculateCompensation( salesAmount);
        
        // setAnnualSales and setTotalCompensation in emp array 1 to salesAmount and getPay
        emp[1].setAnnualSales(salesAmount);
        emp[1].setTotalCompensation(commissionObject.getPay());
        
        
        // Printing total compensation for employee 2 and a blank line
        System.out.println("The total annual compensation for this employee is $" + fmt.format(emp[1].getTotalCompensation()));
        System.out.println(breakline);
        
        System.out.println("Potential sales and earnings for " + emp[1].getName());
        
        // Creating potentialSales variable to stop loop at 50% above annual sales
        double potentialSales2 = .50 * salesAmount + salesAmount;

            // Print out table headers, borders, and first line of table
            System.out.print("Total Sales  |   ");
            System.out.println("Total Compensation");
            System.out.println("===================================");
            System.out.print("$" + fmt.format(salesAmount));
            System.out.println("         $" + fmt.format(commissionObject.getPay()));
            System.out.println("-----------------------------------");
            
        // While loop to print potential sales & earnings in $5000 increments
        while (potentialSales2 > salesAmount ){
            
            // establish new amount and print
            salesAmount = salesAmount + 5000;
            System.out.print("$" + fmt.format(salesAmount));
            
            // Sending new amount to setRate & calculateCompensation in Commission class
            commissionObject.setRate( salesAmount );
            commissionObject.calculateCompensation( salesAmount ); 
            
            // return and print results and border
            System.out.println("         $" + fmt.format(commissionObject.getPay()));
            System.out.println("-----------------------------------");
        }
        System.out.println(breakline);        
        
        
        
        // if else statement to determine which employee made more and compare employee results
        if (emp[0].getAnnualSales()> emp[1].getAnnualSales()){
            difference = emp[0].getAnnualSales()- emp[1].getAnnualSales();
            System.out.println(emp[1].getName() + " would need to earn $" + fmt.format(difference) + " more in annual sales to meet or exceed " + emp[0].getName() + "'s annual compensation of $" + fmt.format(emp[0].getTotalCompensation()));
        }
        else {
            difference = emp[1].getAnnualSales() - emp[0].getAnnualSales();
            System.out.println(emp[0].getName() + " would need to earn $" + fmt.format(difference) + " more in annual sales to meet or exceed " + emp[1].getName() + "'s annual compensation of $" + fmt.format(emp[1].getTotalCompensation()));
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
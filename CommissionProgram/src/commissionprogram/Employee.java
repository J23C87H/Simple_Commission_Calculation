package commissionprogram;

// New class Employee
public class Employee {
    
    // set variables
    private String Name;
    private Double annualAmount;
    private double totalCompensation;
    
    // setName based on user input name and return name
    public void setName(String name){
        Name = name;
    }
    
    public String getName(){
        
        return Name;
        
    }
    
    // setAnnualSales based on user input and return annual sales amount
    public void setAnnualSales(double sales){
        annualAmount = sales;
    }
    
    public double getAnnualSales(){
        return annualAmount;
    }
    
    // setTotalCompensation based on pay calculations and return total amount
    public void setTotalCompensation(double pay){
        totalCompensation = pay;
    }
    
    public double getTotalCompensation(){
        return totalCompensation;
    }
    
    
    
    
   
    
    
    
    
    
}

    

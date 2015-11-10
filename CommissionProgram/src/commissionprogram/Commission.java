package commissionprogram;


public class Commission {
    // Created variables
    double sales;
    double salary = 50000;
    double rate;
    double pay;
    double compensation;
    
    // setRate function using if else statements to determine which rate to use
    public void setRate(double sales){
        
        if (sales < 96000)
            rate = 0;
        else if (sales <= 120000)
            rate = 0.05;
        else if (sales <= 125000)
            rate = 0.065;
        else if (sales <= 130000)
            rate = 0.08;
        else if (sales <= 135000)    
            rate = 0.095;
        else if (sales <= 140000)    
            rate = 0.11;
        else if (sales <= 145000)    
            rate = 0.125;
        else if (sales <= 150000)    
            rate = 0.14;
        else if (sales <= 155000)    
            rate = 0.155;
        else if (sales <= 160000)    
            rate = 0.17;
        else if (sales <= 165000)    
            rate = 0.185;
        else if (sales <= 170000)    
            rate = 0.20;
        else if (sales <= 175000)    
            rate = 0.215;
        else if (sales <= 180000)    
            rate = 0.23;
        else if (sales <= 185000)    
            rate = 0.245;
        else if (sales <= 190000)    
            rate = 0.26;
        else if (sales <= 195000)    
            rate = 0.275;
        else if (sales <= 200000)
            rate = 0.29;
        else if (sales <= 205000)
            rate = 0.305;
        else if (sales <= 210000)
            rate = 0.32;
        else if (sales <= 215000)
            rate = 0.335;
        else if (sales <= 220000)
            rate = 0.35;
        else if (sales <= 225000)
            rate = 0.365;
        else if (sales <= 230000)
            rate = 0.38;
        else if (sales <= 235000)
            rate = 0.395;
        else
            rate = 0.40;    
    }
    
    // calculateComensation to determine compensation and total pay amount
    public void calculateCompensation(double sales){
    
        compensation = sales * rate;
        pay = compensation + salary;
    }
    
    // return pay amount to main function
    public double getPay(){
    
        return pay;
        
    } 
}



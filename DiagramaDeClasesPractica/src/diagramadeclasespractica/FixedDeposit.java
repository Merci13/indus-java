/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagramadeclasespractica;

/**
 *
 * @author estudiante
 */
public class FixedDeposit extends BankAccount {
    
    private double rateOfInterest;
    private double maturityYears;
    
    
    public double depositAmount(){
        
    return 0.0;
    };
    
    
    public String closeAccount(){
    
        return "";
    };
    
    
    public double showMaturityAmount(){
    
    return 0.0;
    };
    
    
    
    
    
    
    
    //==Constructor==//

    public FixedDeposit() {
    }

    public FixedDeposit(double rateOfInterest, double maturityYears) {
        this.rateOfInterest = rateOfInterest;
        this.maturityYears = maturityYears;
    }
    
    //===Getting and Setting==//

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    public double getMaturityYears() {
        return maturityYears;
    }

    public void setMaturityYears(double maturityYears) {
        this.maturityYears = maturityYears;
    }
    
    //==To String==//

    @Override
    public String toString() {
        return "FixedDeposit{" + "rateOfInterest=" + rateOfInterest + ", maturityYears=" + maturityYears + '}';
    }
    
    
    
    
    
    
}

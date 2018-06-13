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
public class CheckingAccount extends BankAccount {
    
    private double minimumBalance;
    private int maximumWhitDrawAlsLimit;
    
    
    
    //==Metodos==//
    
    public double balanceAmount(){
    
        
        
        
    
    return 0.0;
    };
    
    
    public double depositAmount(){
    
    
    return 0;
    
    };
    
    public double whitDrawAmount(){
    
    return 0;
    };
    
    public double showBalance(){
    
    return 0;
    };
    
    public String IncreaseWhitDrawLimit(){
    
    return "";
    };
    
    
    
    
    
    
    
    
    
    //===Constructor===/

    public CheckingAccount() {
    }

    public CheckingAccount(double minimumBalance, int maximumWhitDrawAlsLimit) {
        this.minimumBalance = minimumBalance;
        this.maximumWhitDrawAlsLimit = maximumWhitDrawAlsLimit;
    }
    //===Getting and Setting===//

    public double getMinimumBalance() {
        return minimumBalance;
    }

    public void setMinimumBalance(double minimumBalance) {
        this.minimumBalance = minimumBalance;
    }

    public int getMaximumWhitDrawAlsLimit() {
        return maximumWhitDrawAlsLimit;
    }

    public void setMaximumWhitDrawAlsLimit(int maximumWhitDrawAlsLimit) {
        this.maximumWhitDrawAlsLimit = maximumWhitDrawAlsLimit;
    }
    //==to String===//

    @Override
    public String toString() {
        return "CheckingAccount{" + "minimumBalance=" + minimumBalance + ", maximumWhitDrawAlsLimit=" + maximumWhitDrawAlsLimit + '}';
    }
     
    
    
    
}

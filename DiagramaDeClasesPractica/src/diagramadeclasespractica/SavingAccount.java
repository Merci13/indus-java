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
public class SavingAccount extends BankAccount {

    private double interestrate;
    private int noofWhitDrawAls=0;//cuantos retiros a echo por mes
    private double balanceAmount;

     /**
      * 
      * Metodo para retornar el balance de la cuenta
      * 
      * @return double balanceAmount
      */      
    public double balanceAmount() {

        return balanceAmount;
    }

    ;
    
    /**
     * Metodo para depositar una cantida a la cuenta
     * la misma no puede ser menor a 0, de lo contrario 
     * retornara un string con un mensaje de error;
     * 
     * 
     * @param ammount double, cantidad a depositar en la cuenta
     * @return string "successful deposit" or strign "the quantity can not be less than 0"
     */
    public String depositAmount(double ammount){
        if (ammount>0) {
            balanceAmount += ammount;
        return "successful deposit";  
        }else{
        return "the quantity can not be less than 0";
        
        }
      
    }

    ;
    
    /***
     * Metodo para retirar dinero de la cuenta
     * si la cantidad a retirar es menor o igual a la cantidad 
     * que hay en la cuenta la trasaccion se realizara con exito, 
     * de lo contrario retornara un string con un mensaje de error
     * @param ammountToWhitDraw double cantidad a reitar
     * @return  string 
     * "The withdrawal of the money was successful, its total to debit was: ammountToWhitDraw"
     *
     * 
     * 
     */
    public String whitdrawAmount(double ammountToWhitDraw) {
        if (balanceAmount >= ammountToWhitDraw) {
            balanceAmount = balanceAmount - ammountToWhitDraw;
            return "The withdrawal of the money was successful, its total to debit was:" + ammountToWhitDraw + " \n"
                    + "The total amount in the account is: " + balanceAmount;
        } else if (balanceAmount < ammountToWhitDraw) {
            return "It is not possible to make the transaction because the amount to be debited is greater than the amount in the account.\n"
                    + "your maximum debit is:" + balanceAmount;
        }
        return "";
       
    }

    ;
    /***
     * Metodo para mostrar la cantidad de dinero que hay en la cuenta
     * 
     *  @return double balanceAmount
     */
    public double showBalance() {

        return balanceAmount;
    }

    ;
    
    //==Constructor==//

   

    public SavingAccount() {
    }
    
    public SavingAccount(double interestrate, int noofWhitDrawAls) {
        this.interestrate = interestrate;
        this.noofWhitDrawAls = noofWhitDrawAls;
    }

    //====Getting and Setting===/

    public double getInterestrate() {
        return interestrate;
    }

    public void setInterestrate(double interestrate) {
        this.interestrate = interestrate;
    }

    public int getNoofWhitDrawAls() {
        return noofWhitDrawAls;
    }

    public void setNoofWhitDrawAls(int noofWhitDrawAls) {
        this.noofWhitDrawAls = noofWhitDrawAls;
    }

    public double getBalanceAmount() {
        return balanceAmount;
    }

    public void setBalanceAmount(double balanceAmount) {
        this.balanceAmount = balanceAmount;
    }
    
    //===to string===//

    @Override
    public String toString() {
        return "SavingAccount{" + "interestrate=" + interestrate + ", noofWhitDrawAls=" + noofWhitDrawAls + ", balanceAmount=" + balanceAmount + '}';
    }

    
    
    
}

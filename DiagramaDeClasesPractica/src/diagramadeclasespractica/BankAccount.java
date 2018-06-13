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
public class BankAccount {
    
        private int AccountNomber;
        private String AccountName;
        private String AccountAddres;
        private String AccountContact;
        
        
        
        
        
        //==constructor==//

    public BankAccount() {
    }

    
    public BankAccount(int AccountNomber, String AccountName, String AccountAddres, String AccountContact) {
        this.AccountNomber = AccountNomber;
        this.AccountName = AccountName;
        this.AccountAddres = AccountAddres;
        this.AccountContact = AccountContact;
    }
        
        
        
        
        //====Getting and Setting===//

    public int getAccountNomber() {
        return AccountNomber;
    }

    public void setAccountNomber(int AccountNomber) {
        this.AccountNomber = AccountNomber;
    }

    public String getAccountName() {
        return AccountName;
    }

    public void setAccountName(String AccountName) {
        this.AccountName = AccountName;
    }

    public String getAccountAddres() {
        return AccountAddres;
    }

    public void setAccountAddres(String AccountAddres) {
        this.AccountAddres = AccountAddres;
    }

    public String getAccountContact() {
        return AccountContact;
    }

    public void setAccountContact(String AccountContact) {
        this.AccountContact = AccountContact;
    }
        //=====To String=====//

    @Override
    public String toString() {
        return "BankAccount{" + "AccountNomber=" + AccountNomber + ", AccountName=" + AccountName + ", AccountAddres=" + AccountAddres + ", AccountContact=" + AccountContact + '}';
    }
    






    
}

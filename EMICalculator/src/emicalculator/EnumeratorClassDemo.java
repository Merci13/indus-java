/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emicalculator;


/**
 *
 * @author estudiante
 */
public class EnumeratorClassDemo {
    
    enum Gender{
    Male,Female,Transgender;
    
    }
    
    enum Membership{
    
        SILVER(10),GOLD(20),DIAMOND(30),PLATINUM(40);
        int n;
        
        
        Membership(int n){
        
        this.n=n;
        }
        
        private int getMembership(){
        return this.n;
        }
    
    
    }

    
    
    
    
 
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagramadeclasespractica;

import java.util.Scanner;

/**
 *
 * @author estudiante
 */
public class DiagramaDeClasesPractica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BankAccount ba= new BankAccount();
       Scanner scan=new Scanner(System.in);
       
       

        
        
        System.out.println("Enter the name for the account ");
        ba.setAccountName(scan.nextLine());
        System.out.println("Enter the number of the acount");
        ba.setAccountNomber(scan.nextInt());
        System.out.println("Enter the account Contact");
        System.out.println("");
        ba.setAccountContact(scan.nextLine());
         ba.setAccountContact(scan.nextLine());
        System.out.println("Enter the account address");
        ba.setAccountAddres(scan.nextLine());
        
        System.out.println("The Banck Account information is: \n"+ba.toString());
        System.out.println("Ingrese la cantidad de intereses");
        double interester=Double.parseDouble(scan.nextLine());
        
        SavingAccount sac= new SavingAccount(interester,0);
       
        
        System.out.println("se salvo la con los siguientes datos "+sac.toString());
        
    }
    
}

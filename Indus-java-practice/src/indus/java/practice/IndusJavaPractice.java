/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package indus.java.practice;

import java.util.Scanner;

/**
 *
 * @author estudiante: Merci13 participante del curso java impartido por indus
 * en conjunto con UTN
 */
public class IndusJavaPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        int n1;
        int n2;
        Scanner sc= new Scanner(System.in);
        System.out.println("Introdusca el primer numero: ");
        n1=sc.nextInt();
        
        
        Scanner sc2= new Scanner(System.in);
        System.out.println("Introdusca el segundo numero: ");
        n2=sc2.nextInt();
        
        int resultado= n1+n2;
        System.out.println("La suma de estos dos numeros es: "+ resultado);
        
         resultado= n1-n2;
        System.out.println("La resta de estos dos numeros es: "+ resultado);
         resultado= n1*n2;
        System.out.println("La multiplicacion de estos dos numeros es: "+ resultado);
         resultado= n1/n2;
        System.out.println("La division de estos dos numeros es: "+ resultado);
          resultado= n1%n2;
        System.out.println("El modulo de estos dos numeros es: "+ resultado);
         */
        Student st = new Student();
        st.getData();
        if (st.getAge() < 18) {
            System.out.println("you cant vote beacouse you are MINOR");
        } else {
            System.out.println("you can cast vote");
        }
        
        st.printData();
        System.out.println(st.toString());

    }

}

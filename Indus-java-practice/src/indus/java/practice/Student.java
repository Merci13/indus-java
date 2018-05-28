/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package indus.java.practice;

import java.util.Scanner;

/**
 *
 * @author estudiante
 */
public class Student {

    //declarar variables
    private int studentId;
    private String name;
    private String studentEmail;
    private String studentTelephone;
    private double studentFees;
    private boolean married;
    private int age;

    //constructor
    public Student() {
        studentId = 0;
        name = "";
        studentEmail = "";
        studentTelephone = "";
        studentFees = 0.0;
        married = false;
        age=0;

    }

    //metodos
    //comportamiento de la clase
    /**
     * para aceptar informacion
     */
    public void getData() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Stundent id: ");
        studentId = sc.nextInt();
       sc.nextLine();
        System.out.println("Stundent name: ");
        name = sc.nextLine();

        System.out.println("Stundent email: ");
        studentEmail = sc.nextLine();
        System.out.println("Stundent telephone: ");
        studentTelephone = sc.nextLine();
        System.out.println("Stundent fees: ");
        studentFees = sc.nextDouble();
        System.out.println("Stundent married: ");
        married = sc.nextBoolean();
         sc.nextLine();
         System.out.println("Stundent Age: ");
        age=sc.nextInt();

    }

    public void printData() {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Stundent id: " + getStudentId());

        System.out.println("Stundent name: " + getName());

        System.out.println("Stundent email: " + getStudentEmail());

        System.out.println("Stundent telephone: " + getStudentTelephone());

        System.out.println("Stundent fees: " + getStudentFees());

        System.out.println("Stundent married: " + isMarried());
        
         System.out.println("Stundent age: " + getAge());
        
        System.out.println("-----------------------------------------------------------------");
    }

    //getters and setters
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public String getStudentTelephone() {
        return studentTelephone;
    }

    public void setStudentTelephone(String studentTelephone) {
        this.studentTelephone = studentTelephone;
    }

    public double getStudentFees() {
        return studentFees;
    }

    public void setStudentFees(double studentFees) {
        this.studentFees = studentFees;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    

    public Student(int studentId, String name, String studentEmail, String studentTelephone, double studentFees, boolean married, int age) {
        this.studentId = studentId;
        this.name = name;
        this.studentEmail = studentEmail;
        this.studentTelephone = studentTelephone;
        this.studentFees = studentFees;
        this.married = married;
        this.age=age;
        
    }

    @Override
    public String toString() {
        return "Student{" + "studentId=" + studentId + ", name=" + name + ", studentEmail=" + studentEmail + ", studentTelephone=" + studentTelephone + ", studentFees=" + studentFees + ", married=" + married + ", age=" + age + '}';
    }

   

}

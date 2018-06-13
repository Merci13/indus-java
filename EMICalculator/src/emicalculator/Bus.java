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
public  class Bus extends Vehicle{

    @Override
    public String getLicenceNumber() {
        return "CR-Bus 12151320";
    }

    @Override
    public String getVehicleType() {
       return "Bus";
    }

    @Override
    public String getChassisNumber() {
     return "SAFAW-1561254";
    
    }
    
    int passengercapacity;

    public int getPassengercapacity() {
        return passengercapacity;
    }

    public Bus(int passengercapacity) {
        this.passengercapacity = passengercapacity;
    }

    @Override
    public String toString() {
        return "Bus licence "+"\n" + "passengercapacity=" + passengercapacity+"\n" +"licence Number=: "+getLicenceNumber()+"\n"+"Chassis Number: "+getChassisNumber();
    }
    
    
    
}

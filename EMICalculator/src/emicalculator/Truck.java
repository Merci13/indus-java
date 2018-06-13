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
public class Truck extends Vehicle {

    int numberofTyres;

    @Override
    public String getLicenceNumber() {

        return "CR1002";

    }

    @Override
    public String getVehicleType() {
        return "Truck whit 10 wheels";

    }

    @Override
    public String getChassisNumber() {
        return "SDFSDFS-15212";

    }

    public int getNumberofTyres() {
        return numberofTyres;
    }

    public Truck(int numberofTyres) {
        this.numberofTyres = numberofTyres;
    }

}

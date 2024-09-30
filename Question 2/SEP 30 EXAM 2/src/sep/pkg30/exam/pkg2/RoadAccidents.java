/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sep.pkg30.exam.pkg2;

/**
 *
 * @author Joel
 */
//implement an interface to establish methods
abstract public class RoadAccidents implements IRoadAccidents
{
    
    public String vehicleType;
    public String city;
    public int totAccident;
    //constructor
    RoadAccidents(String pvehicleType, String pCity, int ptotAccident){
    
        vehicleType = pvehicleType;
        city = pCity;
        totAccident = ptotAccident;
    }
    @Override
    public String getAccidentVehicleType(){
        return vehicleType;
    }
    @Override
    public String getCity(){
        return city;
    }
    @Override
    public int getAccidentTotal(){
        return totAccident;
    }
    
}
//===============================End Of File===================================

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sep.pkg30.exam.pkg2;

/**
 *
 * @author Joel
 */
//Child class
public class RoadAccidentReport extends RoadAccidents
{
    
    RoadAccidentReport(String pvehicleType, String pCity, int ptotAccident){
        //calls parent class constructor
        super(pvehicleType,pCity,ptotAccident);
    }
    //to String method
    public void printAccidentReport(){
        System.out.println("""
                           Vehicle Accident Report
                           ***********************""");
        System.out.println("Vehicle Type: " + vehicleType + "\n" + 
                           "City: " + city + "\n" + 
                           "Accident Total: " + String.valueOf(totAccident) + "\n" +
                           "*****************************");
    }
    
    
}
//=============================End Of File======================================

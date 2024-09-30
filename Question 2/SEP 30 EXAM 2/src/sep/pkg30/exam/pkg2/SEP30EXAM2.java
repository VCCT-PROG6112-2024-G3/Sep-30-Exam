/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sep.pkg30.exam.pkg2;

import java.util.Scanner;
/**
 *
 * @author Joel
 */
public class SEP30EXAM2
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        
        String vehicle;
        String city;
        int totAccident;
        
        
        //Get input from user
        System.out.println("Enter the accident vehicle type: ");
        vehicle = scanner.nextLine();
        System.out.println("Enter the city for the vehicle accident: ");
        city = scanner.nextLine();
        System.out.println("Enter the Total amount of accidents for " + city);
        totAccident = scanner.nextInt();
        
        //calls constructor
        RoadAccidentReport instance = new RoadAccidentReport(vehicle,city,totAccident);
        //calls tostring method
        instance.printAccidentReport();
        
    }
    
}
//=============================End Of File=====================================

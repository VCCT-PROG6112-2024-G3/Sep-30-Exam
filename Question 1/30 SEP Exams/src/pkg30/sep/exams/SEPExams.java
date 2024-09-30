/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg30.sep.exams;

import java.util.Scanner;

/**
 *
 * @author Joel Fredrick May ST10440260
 */
public class SEPExams
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        
        int[][] Accidents = new int[3][2];
        
        int[] Totals = new int[3];
        
        int biggest;
        int indexBig;
        
        String city;
        
        Scanner scanner = new Scanner(System.in);
        
        request("Cape Town", "car");
        Accidents[0][0] = scanner.nextInt();
        request("Cape Town","motor bike");
        Accidents[0][1]= scanner.nextInt();
        request("Joburg","car");
        Accidents[1][0] = scanner.nextInt();
        request("Joburg","motor bike");
        Accidents[1][1] = scanner.nextInt();
        request("Port Elizabeth","car");
        Accidents[2][0] = scanner.nextInt();
        request("Port Elizabeth","motor bike");
        Accidents[2][1] = scanner.nextInt();
        
        System.out.println("""
                           -----------------------------------------------------
                           ROAD ACCIDENT REPORT
                           -----------------------------------------------------
                           """);
        System.out.println("\t\t" + "CAR\t" + "MOTORBIKE\n" +
                           "Cape Town\t" + numberprint(Accidents,0) + "\n" + 
                           "Johannesburg\t" + numberprint(Accidents,1) + "\n" + 
                           "Port Elizabeth\t" + numberprint(Accidents,2) + "\n");
        
        System.out.println("""
                           -----------------------------------------------------
                           ROAD ACCIDENT TOTALS FOR EACH CITY
                           -----------------------------------------------------
                           """);
        
        Totals[0] = Total(Accidents,0);
        Totals[1] = Total(Accidents,1);
        Totals[2] = Total(Accidents,2);
        
        System.out.println("Cape Town\t" + String.valueOf(Totals[0]) );
        System.out.println("Johannesburg\t"+ String.valueOf(Totals[1]));
        System.out.println("Port Elizabeth\t" + String.valueOf(Totals[2]) + "\n");
        
        biggest = Totals[0];
        indexBig = 0;
        
        for (int i = 1; i <= 2; i++)
        {
        
            if (biggest < Totals[i]){
                biggest = Totals[i];
                indexBig = i;
            }  
        }
        
        switch (indexBig)
        {
            case 0:
                city = "Cape Town";
                break;
            case 1:
                city = "Johannesburg";
                break;
            case 2:
                city = "Port Elizabeth";
                break;
            default:
                throw new AssertionError();
        }
        
        System.out.println("CITY WITH THE MOST VEHICLE ACCIDENTS: " + city);
                
        
    }
    
    public static void request(String city, String type){
    
        System.out.println("Enter the number of " + type + " accidents for " + city + ": ");
        
    }
    
    public static String numberprint(int[][] Accidents, int row){
        String output;
        
        output = String.valueOf(Accidents[row][0] + "\t" + String.valueOf(Accidents[row][1]));
        return output;
    }
    
     public static int Total(int[][] Accidents, int row){
     
         return Accidents[row][0]+ Accidents[row][1];
     }
    
}

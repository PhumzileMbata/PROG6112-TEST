/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gamingconsolereport;

/**
 *
 * @author Student
 */
public class GamingConsoleReport {

    public static void main(String[] args) {
        String[]Cities ={"cape town","Port Elizabeth","Pretoria"};
        String[]ConsoleType={"PS5";"XBOX","SWITCH"};
    int[]Sales;
 
public static class GamingCosoleReport{
    system.out.println("--------------------------------------");
    system.out.println("Gaming Console Report");
    system.out.println("---------------------------------------");
    
    String[]Cities={"Cape town","Port Elizabeth,Pretoria"}
        int[]Sales={1000,2000,1500}//PS5
                {2000,3000,1100}//XBOX
                {3000,4000,1200}//SWITCH
                
}
    system.out.println("CAPE TOWN");
    System.out.println("Port Elizabeth");
    system.out.println("Pretoria");
    system.out.println("PS5");
    System.out.println("XBOX");
    system.out.println("SWITCH");
    
   
    public static class Totalamountofsales{
        System.out.print("---------------------------------");
        system.out.print("CONSOLE SALES TOTAL FOR EACH CITY");
        System.out.print("----------------------------------");
    
        int[]totals =new string[Cities.length];
        
        for(int r = 0,r< sales.length;r++){
        for(int c =0;sales.lenth;c++){
        total[r]+=sales[r][c]
    }
    }
        int best =0;
        
        for(int i=1;i<totals.length,i++){
    
        if(totals[i]>total[best])best=i;
    }
        System.out.println("City with the most sales: "+Cities[best]+"(R" + total[best]+")");

    }

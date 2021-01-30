package com.inheritance.computer;

public class Laptop extends Computer
{
   public double batteryLife;
   
   public double getBatteryLife()
   {
       return batteryLife;
   }
   
   public void setBatteryLife(double batteryLife)
   {
       this.batteryLife = batteryLife;
   }
   
}

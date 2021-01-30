package com.inheritance.computer;

public class Desktop extends Computer
{
    private boolean monitor;
    
    public boolean monitor()
    {
        return monitor;
    }
    
    public void setMonitor(boolean monitor)
    {
        this.monitor = monitor;
    }
}

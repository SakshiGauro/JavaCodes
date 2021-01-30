package com.subConstructors.instruments;

public class Strings extends Instrument
{
    private boolean useBow;
    
    public Strings(String name, boolean useBow)
    {
        super(name, "Strings");
        this.useBow = useBow;
    }
    
    public boolean getUseBow()
    {
        return useBow;
    }
    
    public void getUseBow(boolean useBow)
    {
        this.useBow = useBow;
    }
}

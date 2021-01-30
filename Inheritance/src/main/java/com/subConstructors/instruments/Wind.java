package com.subConstructors.instruments;

public class Wind extends Instrument
{
    private boolean useReed;
    
    public Wind(String name, String family, boolean useReed)
    {
        super(name, family);
        this.useReed = useReed;
    }
    
    public boolean getUseReed()
    {
        return useReed;
    }
    
    public void setUseReed(boolean useReed)
    {
        this.useReed = useReed;
    }
}

package agh.po.symulator;
import agh.po.symulator.Component;

public class Clutch extends Component
{
    boolean isActive;
    boolean clutchState()
    {
        return isActive;
    }
    public Clutch(String vendor, String model)
    {
        this.vendor = vendor;
        this.model = model;
    }
}

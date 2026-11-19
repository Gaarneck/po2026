package agh.po.symulator;
import agh.po.symulator.Component;

public class Engine extends Component
{
    int RPM;
    int maxRPM;
    boolean isRunning;

    public Engine(int maxRPM, String vendor, String model)
    {
        this.maxRPM = maxRPM;
        this.vendor = vendor;
        this.model = model;
    }

    boolean engineState()
    {
        return isRunning;
    }

}

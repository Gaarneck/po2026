package agh.po.symulator;
import agh.po.symulator.Component;

public class Transmission extends Component
{
    int gear;
    int numberOfGears;
    Clutch clutch;

    public Transmission(int numberOfGears, Clutch clutch, String vendor, String model)
    {
        this.numberOfGears = numberOfGears;
        this.clutch = clutch;
        this.vendor = vendor;
        this.model = model;
    }

    void shiftUp()
    {
        this.gear++;
    }

    void shiftDown()
    {
        this.gear--;
    }
}

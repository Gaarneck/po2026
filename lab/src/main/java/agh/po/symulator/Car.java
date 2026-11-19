package agh.po.symulator;
import agh.po.symulator.*;

public class Car
{
    Engine engine;
    Transmission transmission;
    Position position;

    public Car(Engine engine, Transmission transmission, Position position)
    {
        this.engine = engine;
        this.transmission = transmission;
        this.position = position;
    }

    boolean ignition()
    {
        return false;
    }

    public static void main(String[] args)
    {
        Engine engine = new Engine(12000, "Porsche", "GT3RSB6-24V" );
        Clutch clutch = new Clutch("Bosch", "PoteznaDwumasa");
        Transmission transmission = new Transmission(8, clutch, "Bosch", "HK812RS");
        Position position = new Position(69, 420);
        Car car = new Car(engine, transmission, position);
    }

}

package agh.po.animals;

public abstract class Animal {
    protected String name;
    protected int legs;
    public String getDescription()
    {
        return null;
    }

    public String getName()
    {
        return name;
    }

    public int getLegs()
    {
        return legs;
    }

    public Animal(String name, int legs)
    {
        this.name = name;
        this.legs = legs;
    }
}

package org.launchcode.java.demos.lsn6inheritance;

public class HouseCat extends Cat {
    private String name;
    private String species = "Felis catus";

    public HouseCat(String aName, double aWeight) {
        super(aWeight);
        name = aName;
    }

    public HouseCat(double weight){
        super(weight);
    }

    public HouseCat(String aName){
        name = aName;
    }

    public String getName() {
        return name;
    }

    public boolean isSatisfied() {
        return !isHungry() && !isTired();
    }

    @Override
    public String noise() {
        if (isSatisfied()){
            return "Hello, my name is " + name + "!";
        } else {
            return "Meoooooowwww";
        }
    }

    public String purr() {
        return "I'm a HouseCat";
    }
}

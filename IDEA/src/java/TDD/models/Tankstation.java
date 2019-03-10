package TDD.models;

import java.io.Serializable;

public class Tankstation implements Serializable {
    public String tankname;
    public int amountOfTanks;

    public  Tankstation(String name, int amount) {
        tankname = name;
        amountOfTanks = amount;
    }
}

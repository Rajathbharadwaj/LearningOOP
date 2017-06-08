package com.Composition;

/**
 * Created by BIC on 6/6/2017.
 */
public class Main {

    public static void main(String [] args) {

        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("North");
        Wall wall4 = new Wall("South);

        Ceiling ceiling = new Ceiling(12,55);


        Bed bed = new Bed("Modern", 4,4,2,1);

        Lamp lamp = new Lamp("kmkj", false, 75);

        Bedroom bedroom = new Bedroom("Raj" wall1, wall2, wall3, wall4, Ceiling,bed, lamp);
        bedroom.makebed();

        bedroom.getLamp().turnON();

    }

}

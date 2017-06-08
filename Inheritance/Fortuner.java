package com.Inheritance;

/**
 * Created by BIC on 6/5/2017.
 */
public class Fortuner extends Car{

    private int roadService;

    public Fortuner(String name, String size, int wheels, int doors, int gears, boolean transmissionAutomatic, int roadService) {
        super("Fortuner", "AWD", 5, 4, 5, false);
        this.roadService = roadService;
    }

    public void accelerate(int rate) {

        int newVelocity = getCurrentVelocity() + rate;

        if(newVelocity ==0) {
            stop();
        }
        else if(newVelocity >0 && newVelocity <= 20) {

            ChangeGear(1);

        }
        else if(newVelocity > 20 && newVelocity  <= 40) {
            ChangeGear(2);
        }
        else if(newVelocity >40 && newVelocity <=60) {
            ChangeGear(3);
        }
        else if(newVelocity > 60 && newVelocity <=90 ) {
            ChangeGear(4);
        }
        else {
            ChangeGear(5);
        }

        if(newVelocity >0) {

            ChangeVelocity(newVelocity, getCurrentDirection());
        }
    }

}
